package FileHandling;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main_FileHandling extends Application

    {

        public static void main(String[] args) {
        launch(args);
    }

        @Override
        public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("RAF file");
        Parent root = FXMLLoader.load(getClass().getResource("Stage_FileHandling.fxml"));
        primaryStage.setScene(new Scene(root, 525, 500));
        primaryStage.show();
    }
    }