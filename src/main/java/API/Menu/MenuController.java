package API.Menu;


import API.ChangeScene;
import API.Login.LoginController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;


import java.net.URL;
import java.util.ResourceBundle;

public class MenuController implements Initializable {
    @FXML
    private Label role;
    @FXML
    private Label permission;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        if(LoginController.isAdmin==1) role.setText("Witaj! Jesteś zalogowany jako administrator.");
        else role.setText("Witaj! Jesteś zalogowany jako użytkownik.");
    }
    @FXML
    private void listOfUsers() {
       ChangeScene.launchScene("/views/Users.fxml");
    }
    @FXML
    private void quarantine() {
        ChangeScene.launchScene("/views/Quarantine.fxml");
    }
    @FXML
    private void infected() {
        ChangeScene.launchScene("/views/Infected.fxml");
    }
    @FXML
    private void recovered() {
        ChangeScene.launchScene("/views/Recovered.fxml");
    }
    @FXML
    private void dead() {
        ChangeScene.launchScene("/views/Dead.fxml");
    }
    @FXML
    private void polls() {
        if(LoginController.isAdmin==0) permission.setVisible(true);
        else ChangeScene.launchScene("/views/Polls.fxml");
    }
    @FXML
    private void requests() {
        if(LoginController.isAdmin==0) permission.setVisible(true);
        else ChangeScene.launchScene("/views/Requests.fxml");
    }
    @FXML
    private void statistics() {
        ChangeScene.launchScene("/views/Statistics.fxml");
    }
    @FXML
    private void logout() {
        ChangeScene.launchScene("/views/Login.fxml");
    }


}
