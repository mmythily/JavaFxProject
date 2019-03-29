package DrawShapes_ListView;


import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

public class Controller_Shapes {
    public ListView list_shapes;
    public HBox hbox;

    public void changeMode(MouseEvent e){
        list_shapes.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }

    public void drawShape(MouseEvent e){
        ListView lst = (ListView)e.getSource();
        ObservableList<String> list = lst.getSelectionModel().getSelectedItems();
        hbox.getChildren().clear();
        for(String i:list){
            switch (i){
                case "Circle":
                    Circle c = new Circle(100,100,40);
                    c.setFill(Color.RED);
                    hbox.getChildren().add(c);
                    break;
                case "Line":
                    Line l = new Line(50,50,100,100);
                    l.setStroke(Color.CORAL);
                    hbox.getChildren().add(l);
                    break;
                case "Point":
                    Line p = new Line(59,59,60,60);
                    p.setStroke(Color.CORAL);
                    hbox.getChildren().add(p);
                    break;
                case "Rectangle":
                    Rectangle r = new Rectangle(50,50,100,80);
                    r.setFill(Color.GOLD);
                    hbox.getChildren().add(r);
                    break;



            }
        }
    }

}
