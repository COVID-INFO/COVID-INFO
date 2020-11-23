package API;


import javafx.fxml.FXML;

public class MenuController {

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
        ChangeScene.launchScene("/views/Polls.fxml");
    }
    @FXML
    private void requests() {
        ChangeScene.launchScene("/views/Requests.fxml");
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
