package ChooseColorEffects;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main_FlowPane extends Application {
    public static void main(String[] args) {
        launch(args)/*launch arguments*/;
    }

    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Stage_Effects.fxml"));
        primaryStage.setScene(new Scene(root, 400, 400));
        primaryStage.setTitle(" Color Editor");
        primaryStage.show();
    }
}
