package API.Requests;

import API.ChangeScene;

public class RequestsController {
    public void back(){
        ChangeScene.launchScene("/views/Menu.fxml");
    }
}
