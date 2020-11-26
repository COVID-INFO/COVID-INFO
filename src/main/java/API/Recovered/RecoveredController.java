package API.Recovered;

import API.ChangeScene;

public class RecoveredController {
    public void displayUsers() {
        ChangeScene.launchScene("/views/ListOfRecovered.fxml"); }
    public void addToRecovered() {
        ChangeScene.launchScene("/views/AddToRecovered.fxml"); }
    public void back(){
        ChangeScene.launchScene("/views/Menu.fxml");
    }
}
