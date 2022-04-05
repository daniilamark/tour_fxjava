package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SideBarController implements Initializable {

    @FXML
    private BorderPane borderpane;


    @FXML
    private BorderPane bpu1;

    @FXML
    private ListView<String> lvui1;

    ObservableList<String> langs = FXCollections.observableArrayList("Java", "JavaScript", "C#", "Python");
    ListView<String> langsListView = new ListView<String>(langs);

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    void clear(MouseEvent event) {
        borderpane.setCenter(null);
    }

    @FXML
    void close(MouseEvent event) {
        Stage stage = (Stage) borderpane.getScene().getWindow();
        stage.close();
    }

    @FXML
    void ui1(MouseEvent event) {
        //lvui1.set;
        loadUI("../views/ui_1");

    }

    @FXML
    void ui2(MouseEvent event) {
        loadUI("../views/ui_2");
    }

    @FXML
    void ui3(MouseEvent event) {
        loadUI("../views/ui_3");
    }

    private void loadUI(String ui) {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource(ui + ".fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        borderpane.setCenter(root);
    }
}
