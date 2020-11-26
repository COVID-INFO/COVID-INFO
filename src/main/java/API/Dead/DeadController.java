package API.Dead;

import API.ChangeScene;

public class DeadController {
    public void displayUsers() {
        ChangeScene.launchScene("/views/ListOfDead.fxml"); }
    public void addToDead() {
        ChangeScene.launchScene("/views/AddToDead.fxml"); }
    public void back(){
        ChangeScene.launchScene("/views/Menu.fxml");
    }
}
