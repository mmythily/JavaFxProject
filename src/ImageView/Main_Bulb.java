package ImageView;
/**
 * March 11 2019
 *
 */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main_Bulb extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Turn on the Bulb");
        Parent root = FXMLLoader.load(getClass().getResource("Stage_Bulb.fxml"));
        primaryStage.setScene(new Scene(root, 300, 475));

        primaryStage.show();

    }
}
