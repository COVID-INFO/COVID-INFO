package API.Quarantine;

import API.ChangeScene;

public class QuarantineController {
    public void displayUsers() {
        ChangeScene.launchScene("/views/ListOfQuarantine.fxml"); }
    public void addToQuarantine() {
        ChangeScene.launchScene("/views/AddToQuarantine.fxml"); }
    public void back(){
        ChangeScene.launchScene("/views/Menu.fxml");
    }
}
