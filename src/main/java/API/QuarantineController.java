package API;

public class QuarantineController {
    public void displayUsers() {ChangeScene.launchScene("/views/ListOfQuarantine.fxml"); }
    public void back(){
        ChangeScene.launchScene("/views/Menu.fxml");
    }
}
