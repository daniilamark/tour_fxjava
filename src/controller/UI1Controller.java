package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import model.Tour;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class UI1Controller implements Initializable {

    @FXML
    private GridPane grid;

    @FXML
    private ScrollPane scroll;


    private List<Tour> tours = new ArrayList<>();

    private List<Tour> getData() {
        List<Tour> tours = new ArrayList<>();
        Tour tour;

        for (int i = 0; i < 20; i++ ) {
            tour = new Tour();

            tour = new Tour();
            tour.setName("Эльбрус");
            tour.setPrice(2000);
            tour.setImgSrc("/img/el.jpg");

            tours.add(tour);

            tour = new Tour();
            tour.setName("байкал");
            tour.setPrice(4000);
            tour.setImgSrc("/img/baikal.jpg");

            tours.add(tour);
        }
        return tours;
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tours.addAll(getData());
        int column = 0;
        int row = 0;
        try {
            for (int i = 0; i < tours.size(); i++) {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("/views/item.fxml"));
                AnchorPane anchorPane = fxmlLoader.load();

                ItemController itemController = fxmlLoader.getController();
                itemController.setData(tours.get(i));

                if (column == 1){
                    column = 0;
                    row++;
                }
                grid.add(anchorPane, column++, row);
                GridPane.setMargin(anchorPane, new Insets(10));
            }
        } catch (IOException e) {
                e.printStackTrace();
        }
    }


}
