//Random Access File

package FileHandling;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Controller_FileHandling {
    public TextField txt_Name, txt_Street, txt_City, txt_State;
    public Button btn_add, btn_update, btn_next, btn_previous, btn_first, btn_last;
    public Label lbl_status;

    RandomAccessFile raf;
    String name, street,city, state;
    static int count = -1; //indicates file is empty

    public void load(MouseEvent e) throws FileNotFoundException {
        raf = new RandomAccessFile("emp.dat","rw");


        btn_add.setOnAction(event -> {
            name = txt_Name.getText();
            city = txt_City.getText();
            street = txt_Street.getText();
            state = txt_Street.getText();
            String data = name+", "+street+", "+city+", "+state;
            try {
                //save(name, city, street, state);
                save(data);

            }catch (IOException obj){
            }
        }); //instead of onAction="#save"
        btn_update.setOnAction(event -> {

            update();
        });
        btn_next.setOnAction(event -> {
            try{
                next();
            }
            catch (IOException e1){}
        });
        btn_previous.setOnAction(event -> {
            try{
                previous();
            }
            catch (IOException e1){}
        });
        btn_first.setOnAction(event -> {
            try{
                showfirst();
            }
            catch (IOException e1){}
        });
        btn_last.setOnAction(event -> {
            try{
                showlast();
            }
            catch (IOException e1){}
        });
    }
    //for adding items
    //public void save (String name,String street,String city,String state) throws IOException {
    public void save (String data) throws IOException {

            count++;
        raf.seek(raf.length());//jump to location
        //raf.writeUTF(name+",");
        //raf.writeUTF(street+",");
        //raf.writeUTF(city+",");
        //raf.writeUTF(state);
        raf.writeBytes(data);

        raf.writeBytes(System.lineSeparator());
        clear();
        lbl_status.setText("Status:Data added successfully");
    }
    public void update(){

    }
    public void next() throws IOException{
        ArrayList<String> list = new ArrayList<>();
        raf.seek(0);
        String data = "";
        while ((data = raf.readLine())!=null){
            list.add(data);
        }
        if (count < 0)
            count = 0;
        else if (count >= list.size()){
            count-=1;}
        String d[] =list.get(count).split(",");
        txt_Name.setText(d[0]);
        txt_Street.setText(d[1]);
        txt_City.setText(d[2]);
        txt_State.setText(d[3]);
        count++;

    }
    public void previous () throws IOException{
        ArrayList<String> list = new ArrayList<>();
        raf.seek(0);
        String data = "";
        while ((data = raf.readLine())!=null){
            list.add(data);
        }
        if (count < 0)
            count = 0;
        else if (count >= list.size()-1){
            count-=2;
        }
        String d[] =list.get(count).split(",");
        txt_Name.setText(d[0]);
        txt_Street.setText(d[1]);
        txt_City.setText(d[2]);
        txt_State.setText(d[3]);
        count--;

    }
    public void showfirst () throws IOException{
        //if i am at very first record, count = 0
        count = 0;
        raf.seek(0);
        String[] data = raf.readLine().split(",");
        txt_Name.setText(data[0]);
        txt_Street.setText(data[1]);
        txt_City.setText(data[2]);
        txt_State.setText(data[3]);
    }
    public void showlast ()throws IOException{
        raf.seek(0);
        String temp, data="";
        count=0;
        while((temp=raf.readLine())!=null){
            count++;
            data = temp;
        }
        String d[] = data.split(",");
        txt_Name.setText(d[0]);
        txt_Street.setText(d[1]);
        txt_City.setText(d[2]);
        txt_State.setText(d[3]);
    }

    public void clear(){
        txt_Name.clear();
        txt_City.clear();
        txt_Street.clear();
        txt_State.clear();
    }

}
