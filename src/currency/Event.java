
import java.awt.event.*;
import java.util.*;
import javax.swing.JOptionPane;

class Event implements ActionListener {

    Currency cr;

    public Event(Currency cr) {
        this.cr = cr;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (cr.toContry.getSelectedItem() == "Select Contry") {
            JOptionPane.showMessageDialog(null, "Please Select Your Contry", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        if (cr.t1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Enter Your Number", "Warning", JOptionPane.WARNING_MESSAGE);

        }
        if (cr.toContry.getSelectedItem() == "Afghanistan") {
            double val = Double.parseDouble(cr.t1.getText().toString());
            double cur = val * 0.88;
            cr.t2.setText(String.valueOf(cur));
        }
        if (cr.toContry.getSelectedItem() == "Argentina") {
            double val = Double.parseDouble(cr.t1.getText().toString());
            double cur = val * 10.15;
            cr.t2.setText(String.valueOf(cur));
        }
        if (cr.toContry.getSelectedItem() == "Armenia") {
            double val = Double.parseDouble(cr.t1.getText().toString());
            double cur = val * 4.89;
            cr.t2.setText(String.valueOf(cur));
        }
        if (cr.toContry.getSelectedItem() == "Australia") {
            double val = Double.parseDouble(cr.t1.getText().toString());
            double cur = val * 0.019;
            cr.t2.setText(String.valueOf(cur));
        }
        if (cr.toContry.getSelectedItem() == "Brazil") {
            double val = Double.parseDouble(cr.t1.getText().toString());
            double cur = val * 0.060;
            cr.t2.setText(String.valueOf(cur));
        }
        if (cr.toContry.getSelectedItem() == "Canada") {
            double val = Double.parseDouble(cr.t1.getText().toString());
            double cur = val*0.016;
            cr.t2.setText(String.valueOf(cur));
        }
        if (cr.toContry.getSelectedItem() == "China") {
            double val = Double.parseDouble(cr.t1.getText().toString());
            double cur = val*0.087;
            cr.t2.setText(String.valueOf(cur));
        }
        if (cr.toContry.getSelectedItem() == "France") {
            double val = Double.parseDouble(cr.t1.getText().toString());
            double cur = val*0.011;
            cr.t2.setText(String.valueOf(cur));
        }
        if (cr.toContry.getSelectedItem() == "Germany") {
            double val = Double.parseDouble(cr.t1.getText().toString());
            double cur = val*0.011;
            cr.t2.setText(String.valueOf(cur));
        }
        if (cr.toContry.getSelectedItem() == "Hong Kong") {
            double val = Double.parseDouble(cr.t1.getText().toString());
            double cur = val*0.094;
            cr.t2.setText(String.valueOf(cur));
        }
        if (cr.toContry.getSelectedItem() == "India") {
            double val = Double.parseDouble(cr.t1.getText().toString());
            double cur = val*1;
            cr.t2.setText(String.valueOf(cur));
        }
        if (cr.toContry.getSelectedItem() == "Indonesia") {
            double val = Double.parseDouble(cr.t1.getText().toString());
            double cur = val*189.65;
            cr.t2.setText(String.valueOf(cur));
        }
        if (cr.toContry.getSelectedItem() == "Iran") {
            double val = Double.parseDouble(cr.t1.getText().toString());
            double cur = val*507.17;
            cr.t2.setText(String.valueOf(cur));
        }
        if (cr.toContry.getSelectedItem() == "Iraq") {
            double val = Double.parseDouble(cr.t1.getText().toString());
            double cur = val*15.77;
            cr.t2.setText(String.valueOf(cur));
        }
        if (cr.toContry.getSelectedItem() == "Japan") {
            double val = Double.parseDouble(cr.t1.getText().toString());
            double cur = val*1.82;
            cr.t2.setText(String.valueOf(cur));
        }
        if (cr.toContry.getSelectedItem() == "Korea") {
            double val = Double.parseDouble(cr.t1.getText().toString());
            double cur = val*16.12;
            cr.t2.setText(String.valueOf(cur));
        }
        if (cr.toContry.getSelectedItem() == "Kuwait") {
            double val = Double.parseDouble(cr.t1.getText().toString());
            double cur = val*0.0037;
            cr.t2.setText(String.valueOf(cur));
        }
        if (cr.toContry.getSelectedItem() == "Mexico") {
            double val = Double.parseDouble(cr.t1.getText().toString());
            double cur = val*0.21;
            cr.t2.setText(String.valueOf(cur));
        }
        if (cr.toContry.getSelectedItem() == "Nepal") {
            double val = Double.parseDouble(cr.t1.getText().toString());
            double cur = val*1.60;
            cr.t2.setText(String.valueOf(cur));
        }
        if (cr.toContry.getSelectedItem() == "New Zealand") {
            double val = Double.parseDouble(cr.t1.getText().toString());
            double cur = val*0.020;
            cr.t2.setText(String.valueOf(cur));
        }
        if (cr.toContry.getSelectedItem() == "Netherlands") {
            double val = Double.parseDouble(cr.t1.getText().toString());
            double cur = val*0.022;
            cr.t2.setText(String.valueOf(cur));
        }
        if (cr.toContry.getSelectedItem() == "Pakistan") {
            double val = Double.parseDouble(cr.t1.getText().toString());
            double cur = val*3.36;
            cr.t2.setText(String.valueOf(cur));
        }
        if (cr.toContry.getSelectedItem() == "Russia") {
            double val = Double.parseDouble(cr.t1.getText().toString());
            double cur = val*1.11;
            cr.t2.setText(String.valueOf(cur));
        }
        if (cr.toContry.getSelectedItem() == "Singapore") {
            double val = Double.parseDouble(cr.t1.getText().toString());
            double cur = val*0.016;
            cr.t2.setText(String.valueOf(cur));
        }
        if (cr.toContry.getSelectedItem() == "South Africa") {
            double val = Double.parseDouble(cr.t1.getText().toString());
            double cur = val*0.23;
            cr.t2.setText(String.valueOf(cur));
        }
        if (cr.toContry.getSelectedItem() == "Sri Lanka") {
            double val = Double.parseDouble(cr.t1.getText().toString());
            double cur = val*3.73;
            cr.t2.setText(String.valueOf(cur));
        }
       
        if (cr.toContry.getSelectedItem() == "Switzerland") {
            double val = Double.parseDouble(cr.t1.getText().toString());
            double cur = val*0.011;
            cr.t2.setText(String.valueOf(cur));
        }
        if (cr.toContry.getSelectedItem() == "Taiwan") {
            double val = Double.parseDouble(cr.t1.getText().toString());
            double cur = val*0.38;
            cr.t2.setText(String.valueOf(cur));
        }
        if (cr.toContry.getSelectedItem() == "Thailand") {
            double val = Double.parseDouble(cr.t1.getText().toString());
            double cur = val*0.43;
            cr.t2.setText(String.valueOf(cur));
        }
        if (cr.toContry.getSelectedItem() == "Turkey") {
            double val = Double.parseDouble(cr.t1.getText().toString());
            double cur = val*0.38;
            cr.t2.setText(String.valueOf(cur));
        }
        if (cr.toContry.getSelectedItem() == "Uganda") {
            double val = Double.parseDouble(cr.t1.getText().toString());
            double cur = val*47.42;
            cr.t2.setText(String.valueOf(cur));
        }
        if (cr.toContry.getSelectedItem() == "Zimbabwe") {
            double val = Double.parseDouble(cr.t1.getText().toString());
            double cur = val*0.28;
            cr.t2.setText(String.valueOf(cur));
        }
       
    }

}
