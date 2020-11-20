package API;

import Entities.User;
import Models.UserModel;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.net.URL;

public class LoginController {


    @FXML
    private TextField pesel;
    @FXML
    private Label warning;
    @FXML
    private void login(){

        Task<User> loadUserTask = new Task<User>() {
            @Override
            protected User call() {
                UserModel userModel = new UserModel();
                return userModel.getUser(pesel.getText());
            }
        };
        loadUserTask.setOnSucceeded(e -> {
            if(loadUserTask.getValue()!=null){
                try {
                   ChangeScene.launchScene("/views/Menu.fxml");
                }catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
            else{
                warning.setVisible(true);
            }
        });
        loadUserTask.setOnFailed(e ->{
            warning.setVisible(true);});


        Thread loadUserThread = new Thread(loadUserTask);
        loadUserThread.start();
    }

    @FXML
    public void registrationForm(){
        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader();
            URL xmlURL = getClass().getResource("/views/Registration.fxml");
            loader.setLocation(xmlURL);
            Parent root = loader.load();
            Scene scene2 = new Scene(root);
            stage.setScene(scene2);
            stage.setMinHeight(400);
            stage.setMinWidth(600);
            stage.setResizable(false);
            stage.show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}


