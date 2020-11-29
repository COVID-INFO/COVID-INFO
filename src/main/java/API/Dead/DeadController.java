package API.Dead;

import API.ChangeScene;
import API.Login.LoginController;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class DeadController {
    @FXML
    private Label permission;
    public void displayUsers() {
        ChangeScene.launchScene("/views/ListOfDead.fxml"); }
    public void addToDead() {
        if(LoginController.isAdmin==0) permission.setVisible(true);
        else ChangeScene.launchScene("/views/AddToDead.fxml"); }
    public void back(){
        ChangeScene.launchScene("/views/Menu.fxml");
    }
}
