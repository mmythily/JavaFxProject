package FontEditor_Mythily;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main_FontEditor_Mythily extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Font Editor");
        Parent root = FXMLLoader.load(getClass().getResource("Stage_FontEditor_Mythily.fxml"));
        primaryStage.setScene(new Scene(root, 600, 500));
        primaryStage.show();
    }
}
