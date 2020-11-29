package API.Infected;

import API.ChangeScene;
import API.Login.LoginController;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class InfectedController {
    @FXML
    private Label permission;
    public void displayUsers() {
        ChangeScene.launchScene("/views/ListOfInfected.fxml"); }
    public void addToInfected() {
        if(LoginController.isAdmin==0) permission.setVisible(true);
        else ChangeScene.launchScene("/views/AddToInfected.fxml"); }
    public void back(){
        ChangeScene.launchScene("/views/Menu.fxml");
    }
}
