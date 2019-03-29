package ChooseColorEffects;

import javafx.scene.input.MouseEvent;
import javafx.scene.text.*;
import javafx.scene.control.*;


public class Controller_Effects {

    public RadioButton optRed, optGreen, optBlue;
    public TextField text_data;

    public void changeColor(MouseEvent e){
        RadioButton radioButton = (RadioButton)e.getSource();

        switch (radioButton.getText()){
            case "Red":
                if(radioButton.isSelected()){
                    text_data.setStyle("-fx-text-inner-color:red");
                }
                break;
            case "Green":
                if(radioButton.isSelected()){
                    text_data.setStyle("-fx-text-inner-color:green");
                }
                break;
            case "Blue":
                if(radioButton.isSelected()){
                    text_data.setStyle("-fx-text-inner-color:blue");
                }
                break;
        }
    }

    public void changeSize(MouseEvent e){
        RadioButton radButton = (RadioButton)e.getSource();

        switch (radButton.getText()){
            case "4":
                if(radButton.isSelected()){
                    text_data.setFont(Font.font("Arial",4));
                    //text_data.setStyle("-fx-text-weight:bold");
                    //text_data.setStyle("-fx-text-style:italic");
                }
                break;
            case "16":
                if(radButton.isSelected()){
                    text_data.setFont(Font.font("Calibri",16));
                }
                break;
            case "24":
                if(radButton.isSelected()){
                    text_data.setFont(Font.font("Arial",24));
                }
                break;


        }
    }

   // Color red = Color.rgb((int)(Math.random()*255),(int)(Math.random()*0),(int)(Math.random()*0));
    //Color green = Color.rgb((int)(Math.random()*0),(int)(Math.random()*255),(int)(Math.random()*0));
    //Color blue = Color.rgb((int)(Math.random()*0),(int)(Math.random()*0),(int)(Math.random()*255));

}
