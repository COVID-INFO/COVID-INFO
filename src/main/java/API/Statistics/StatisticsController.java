package API.Statistics;

import API.ChangeScene;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;

import java.net.URL;

public class StatisticsController{

    public void pieChart(){
        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader();
            URL xmlURL = getClass().getResource("/views/PieChart.fxml");
            loader.setLocation(xmlURL);
            Parent root = loader.load();
            Scene scene2 = new Scene(root);
            stage.setScene(scene2);
            stage.setMinHeight(400);
            stage.setMinWidth(600);
            stage.setResizable(false);
            stage.show();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void barChart(){
        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader();
            URL xmlURL = getClass().getResource("/views/BarChart.fxml");
            loader.setLocation(xmlURL);
            Parent root = loader.load();
            Scene scene2 = new Scene(root);
            stage.setScene(scene2);
            stage.setMinHeight(400);
            stage.setMinWidth(600);
            stage.setResizable(false);
            stage.show();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void back(){
        ChangeScene.launchScene("/views/Menu.fxml");
    }
}
