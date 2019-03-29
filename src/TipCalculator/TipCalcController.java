package TipCalculator;

import  javafx.scene.control.*;

import javafx.event.ActionEvent;

public class TipCalcController {
    public Label lbl_bill, lbl_tip_per, lbl_Total;
    public TextField txt_bill, txt_tip_per;

    float bill, tip, total_bill;

    public void calc (ActionEvent e){
        bill = Float.valueOf(txt_bill.getText());
        tip = bill * (Float.valueOf(txt_tip_per.getText()))/100;
        total_bill = bill + tip ;
        lbl_bill.setText("Bill Amount : "+bill);
        lbl_tip_per.setText("Tip Amount: "+tip);
        lbl_Total.setText("Total Amount: "+total_bill);
    }
}
