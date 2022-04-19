package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import model.Tour;

public class ItemController {

    @FXML
    private ImageView imgTour;

    @FXML
    private Label lName;

    @FXML
    private Label lPrice;

    @FXML
    private Text txtTour;

    private Tour tour;


    public void setData(Tour tour){
        this.tour = tour;
        lName.setText(tour.getName());
        lPrice.setText("" + tour.getPrice());
        Image image = new Image(getClass().getResourceAsStream(tour.getImgSrc()));
        imgTour.setImage(image);
    }







}
