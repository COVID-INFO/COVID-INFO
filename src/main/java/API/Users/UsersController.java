package API.Users;

import API.ChangeScene;
import API.Login.LoginController;
import Entities.User;
import Models.UserModel;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


public class UsersController{

    @FXML
    private Label permission;
    public void addUser(){
        if(LoginController.isAdmin==0) permission.setVisible(true);
        else ChangeScene.launchScene("/views/AddUser.fxml");
    }
    public void displayUsers() {ChangeScene.launchScene("/views/ListOfUsers.fxml"); }
    public void sendMessage(){
        if(LoginController.isAdmin==0) permission.setVisible(true);
        else ChangeScene.launchScene("/views/SendMessage.fxml");
    }
    public void back(){
        ChangeScene.launchScene("/views/Menu.fxml");
    }
}