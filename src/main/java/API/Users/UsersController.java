package API.Users;

import API.ChangeScene;
import Entities.User;
import Models.UserModel;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


public class UsersController{


    public void addUser(){
        ChangeScene.launchScene("/views/AddUser.fxml");
    }
    public void displayUsers() {ChangeScene.launchScene("/views/ListOfUsers.fxml"); }
    public void sendMessage(){
        ChangeScene.launchScene("/views/SendMessage.fxml");
    }
    public void back(){
        ChangeScene.launchScene("/views/Menu.fxml");
    }
}