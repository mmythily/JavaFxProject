package FontEditor_Mythily;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.text.*;
import javafx.stage.Stage;


public class Controller_FontEditor_Mythily {
    public TextField text_data_Mythily;
    public ComboBox fontName_Mythily, fontStyle_Mythily, fontSize_Mythily,
            underlineStyle_Mythily, fontColor_Mythily;
    public Button btn_cancel_Mythily;

    public void changeFontName_Mythily(ActionEvent e){
        ComboBox fname_Mythily = (ComboBox)e.getSource();
        String name_Mythily = fname_Mythily.getSelectionModel().getSelectedItem().toString();
        switch (name_Mythily){
            case "Heveltica":
                text_data_Mythily.setFont(Font.font("Heveltica",12));
                break;
            case "Comic Sans MS":
                text_data_Mythily.setFont(Font.font("Comic Sans MS",12));
                break;
            case "Tahoma":
                text_data_Mythily.setFont(Font.font("Tahoma",12));
                break;
            case "Trebuchet MS":
                text_data_Mythily.setFont(Font.font("Trebuchet MS",12));
                break;
        }
    }

    public void changeFontStyle_Mythily(ActionEvent e){
        ComboBox fstyle_Mythily = (ComboBox)e.getSource();
        String style_Mythily = fstyle_Mythily.getSelectionModel().getSelectedItem().toString();
        switch (style_Mythily){
            case "Regular":
                text_data_Mythily.setFont(Font.font("Regular", FontPosture.REGULAR,12));
                break;
            case "Italic":
                text_data_Mythily.setFont(Font.font("-fx-font-style:italic"));
                break;
            case "Bold":
                text_data_Mythily.setFont(Font.font("Bold", FontWeight.BOLD,12));
                break;
            case "Bold Italic":
                text_data_Mythily.setFont(Font.font("Bold Italic",FontWeight.BOLD,12));
                break;
        }
    }

    public void changeFontSize_Mythily(ActionEvent e) {
        ComboBox fsize_Mythily = (ComboBox) e.getSource();
        String size_Mythily = fsize_Mythily.getSelectionModel().getSelectedItem().toString();
        switch (size_Mythily) {
            case "6":
                text_data_Mythily.setFont(Font.font("Heveltica",6));
                break;
            case "10":
                text_data_Mythily.setFont(Font.font("Heveltica",10));
                break;
            case "14":
                text_data_Mythily.setFont(Font.font("Heveltica",14));
                break;
            case "18":
                text_data_Mythily.setFont(Font.font("Heveltica",18));
                break;
        }
    }
    public void changeFontColor_Mythily(ActionEvent e) {
        ComboBox fcolor_Mythily = (ComboBox) e.getSource();
        String color_Mythily = fcolor_Mythily.getSelectionModel().getSelectedItem().toString();

        switch (color_Mythily){
            case "Red":
                text_data_Mythily.setStyle("-fx-text-inner-color:red");
                break;
            case "Green":
                text_data_Mythily.setStyle("-fx-text-inner-color:green");
                break;
            case "Blue":
                text_data_Mythily.setStyle("-fx-text-inner-color:blue");
                break;
        }
    }

    public void changeUnderline_Mythily(ActionEvent e) {
        ComboBox und_Mythily = (ComboBox) e.getSource();
        String unds_Mythily = und_Mythily.getSelectionModel().getSelectedItem().toString();

        switch (unds_Mythily){
            case "none":
                text_data_Mythily.setStyle("-fx-underline:false");
                break;
            case "Underline":
                text_data_Mythily.setStyle("-fx-underline:true");
                break;
            case "Strikethrough":
                text_data_Mythily.setStyle("-fx-strikethrough:true");
                break;
        }
    }

    public void reset_Mythily(ActionEvent e){


    }

    public void close_Mythily(ActionEvent e) {
        Stage stage_Mythily = (Stage)btn_cancel_Mythily.getScene().getWindow();
        stage_Mythily.close();
    }

}