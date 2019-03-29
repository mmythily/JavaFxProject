package DrawShapes_ListView;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * March 11 2019
 * Create a ListView to hold Shapes as its items:
 * = Circle , THen when you click, it should draw circle
 * =Line
 * =Point
 * +Rectangle
 */
public class Main_Shapes extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Shape Selector");
        Parent root = FXMLLoader.load(getClass().getResource("Stage_Shapes.fxml"));
        primaryStage.setScene(new Scene(root, 500, 500));

        primaryStage.show();
    }
}
