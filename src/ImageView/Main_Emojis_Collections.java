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

public class Main_Emojis_Collections extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Change Emojis");
        Parent root = FXMLLoader.load(getClass().getResource("Stage_Emojis_Collections.fxml"));
        primaryStage.setScene(new Scene(root, 300, 475));

        primaryStage.show();

    }
}
