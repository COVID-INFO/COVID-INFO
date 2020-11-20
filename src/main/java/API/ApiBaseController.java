package API;


import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import java.net.URL;

public abstract class ApiBaseController extends Pane {

    public ApiBaseController(String controllerName) {

        FXMLLoader loader = new FXMLLoader();
        URL xmlURL = getClass().getResource("/views/" + controllerName + ".fxml");
        loader.setLocation(xmlURL);
        loader.setController(this);

    }
}