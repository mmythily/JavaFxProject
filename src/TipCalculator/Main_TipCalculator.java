package TipCalculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main_TipCalculator extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Tip Calculator");
        Parent root = FXMLLoader.load(getClass().getResource("TipCalculatorStage.fxml"));
        primaryStage.setScene(new Scene(root, 300, 475));

        primaryStage.show();

    }
}
