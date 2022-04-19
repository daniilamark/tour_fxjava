package main;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class SideBar extends Application {
    private double x, y;

    @Override
    public void start(Stage stage) throws IOException {
        stage.getIcons().add(new Image("https://cdn-icons.flaticon.com/png/512/4283/premiumFamilyBudget/4283171.png?token=exp=1649234715~hmac=118030c80b07123780aaf46ac7302fa3"));
        Parent root = FXMLLoader.load(getClass().getResource("../views/sidebar.fxml"));

        Scene scene = new Scene(root);
        //scene.setFill(Color.TRANSPARENT);
        /*
        root.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                x = mouseEvent.getSceneX();
                y = mouseEvent.getSceneY();
            }
        });

        root.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                stage.setX(mouseEvent.getScreenX() - x);
                stage.setY(mouseEvent.getScreenY() - y);
            }
        });


         */
        stage.getIcons().add(new Image("img/e.png"));
        stage.setScene(scene);
        //stage.initStyle(StageStyle.TRANSPARENT);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}