package org.example.sistemadematricula;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(
                HelloApplication.class.getResource("matricula-view.fxml")
        );

        Scene scene = new Scene(
                fxmlLoader.load(),
                1200,
                750
        );

        stage.setTitle("Sistema de Matrícula - CNFT");

        stage.setScene(scene);

        stage.setMinWidth(1000);
        stage.setMinHeight(650);

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}