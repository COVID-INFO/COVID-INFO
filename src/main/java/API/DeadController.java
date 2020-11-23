package API;

public class DeadController {
    public void displayUsers() {ChangeScene.launchScene("/views/ListOfDead.fxml"); }
    public void back(){
        ChangeScene.launchScene("/views/Menu.fxml");
    }
}
