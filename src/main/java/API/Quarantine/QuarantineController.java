package API.Quarantine;

import API.ChangeScene;
import API.Login.LoginController;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class QuarantineController {
    @FXML
    private Label permission;
    public void displayUsers() {
        ChangeScene.launchScene("/views/ListOfQuarantine.fxml"); }
    public void addToQuarantine() {
        if(LoginController.isAdmin==0) permission.setVisible(true);
        else ChangeScene.launchScene("/views/AddToQuarantine.fxml"); }
    public void back(){
        ChangeScene.launchScene("/views/Menu.fxml");
    }
}
