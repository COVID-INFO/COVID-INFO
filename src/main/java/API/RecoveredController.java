package API;

public class RecoveredController {
    public void displayUsers() {ChangeScene.launchScene("/views/ListOfRecovered.fxml"); }
    public void back(){
        ChangeScene.launchScene("/views/Menu.fxml");
    }
}
