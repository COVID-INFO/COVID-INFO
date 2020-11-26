package API.Infected;

import API.ChangeScene;

public class InfectedController {
    public void displayUsers() {
        ChangeScene.launchScene("/views/ListOfInfected.fxml"); }
    public void addToInfected() {
        ChangeScene.launchScene("/views/AddToInfected.fxml"); }
    public void back(){
        ChangeScene.launchScene("/views/Menu.fxml");
    }
}
