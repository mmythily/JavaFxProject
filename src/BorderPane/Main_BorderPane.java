package BorderPane;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main_BorderPane extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("BorderPane");
        Parent root = FXMLLoader.load(getClass().getResource("Stage_BorderPane.fxml"));
        primaryStage.setScene(new Scene(root, 525, 500));
        primaryStage.show();
    }
}