package FileChooser;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main_FileChooser extends Application

{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("File Chooser");
        Parent root = FXMLLoader.load(getClass().getResource("Stage_FileChooser.fxml"));
        primaryStage.setScene(new Scene(root, 525, 500));
        primaryStage.show();
    }
}