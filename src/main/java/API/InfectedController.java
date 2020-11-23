package API;

public class InfectedController {
    public void displayUsers() {ChangeScene.launchScene("/views/ListOfInfected.fxml"); }
    public void back(){
        ChangeScene.launchScene("/views/Menu.fxml");
    }
}
