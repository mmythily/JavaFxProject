package sample;

import javafx.scene.input.MouseEvent;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

public class Controller {

    public Label lbl_t1;
    public Label lbl_t2;
    public AnchorPane lay_ap;





    public void mouseMove(MouseEvent obj){
        Color c = Color.rgb((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
        //Color c1 = Color.rgb((int)(Math.random()*255),(int)(Math.random()*10),(int)(Math.random()*10));
        lbl_t1.setTextFill(c);
        //lbl_t2.setTextFill(c1);
        //lbl_t2.setText(obj.getX()+" "+obj.getY());

    }
    public void mouseClick(){
        lbl_t2.setText("You clicked!");
    }

    public void drawCircle(MouseEvent e){
        Color col = Color.rgb((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
        Circle c = new Circle (e.getX(),e.getY(),5);
        c.setFill(col);
        lay_ap.getChildren().add(c);
    }

    public void drawLine(MouseEvent l){
        Color col = Color.rgb((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
        Line c = new Line (0,l.getY(),l.getX(),0);
        c.setStroke(col);
        lay_ap.getChildren().add(c);
    }
}
