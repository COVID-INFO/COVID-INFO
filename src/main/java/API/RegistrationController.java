package API;

import Models.UserModel;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class RegistrationController {

    @FXML private TextField pesel;
    @FXML private TextField lastname;
    @FXML private Label peselExist;
    @FXML
    public void register(){
        peselExist.setVisible(false);
        String p = this.pesel.getText();
        String l = this.lastname.getText();
        UserModel userModel = new UserModel();
        if (userModel.getUser(p) != null) peselExist.setVisible(true);
        else  userModel.createUser(p, l);

    }
}
