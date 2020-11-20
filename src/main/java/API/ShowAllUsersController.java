package API;

import Entities.User;
import Models.UserModel;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;



public class ShowAllUsersController extends ApiBaseController {

    public ShowAllUsersController() {

        super("ShowAllUsers");
        TableView<User> tab = new TableView<>();
        TableColumn<User, Integer> quantityColumn2 = new TableColumn<>("Id ");
        quantityColumn2.setCellValueFactory(new PropertyValueFactory<>("id"));
        TableColumn<User, String> priceColumn = new TableColumn<>("Pesel");
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("pesel"));
        TableColumn<User, Integer> quantityColumn = new TableColumn<>("Lastname");
        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("lastname"));
        tab.getColumns().addAll(quantityColumn2, priceColumn, quantityColumn);

        this.getChildren().addAll(tab);

        Task<ObservableList> show = new Task<ObservableList>() {
            @Override
            protected ObservableList call() {
                UserModel userModel = new UserModel();
                return userModel.getListOfUsers();
            }
        };
        show.setOnSucceeded(e -> {
            tab.getItems().setAll(show.getValue());
        });
        Thread t1 = new Thread(show);
        t1.start();
    }
}