package gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Close extends WindowAdapter {

    @Override
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}

class Cal implements ActionListener {

    Frame f;
    MenuBar mb;
    MenuItem mi, mi1, mi2, mi3, mi4,mi6;
    Menu m1, m2, m3;
    TextField tf;
    Panel p1, p2;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24;
    String fv, sv, op, ccpsv; //final value,stoved value,oparaters .copy cut and past stoved value
    Double fdv, sdv, tot; //final double value,stoved double value,total
    String np = "+"; // + and -

    Cal() {
        f = new Frame();
        f.addWindowListener(new Close());
        f.setBackground(new Color(243, 243, 243));
        f.setTitle("Calculator");
        f.setResizable(false);
        f.setSize(300, 450);
        f.setLocationRelativeTo(null);
        Image icon = Toolkit.getDefaultToolkit().getImage("D:\\calculator\\img\\cal.png");
        f.setIconImage(icon);

        Font f3 = new Font("Viner Hand ITC", Font.BOLD, 36);

        mb = new MenuBar();

        m1 = new Menu("View");
        mi = new MenuItem("Dark");
        mi6 = new MenuItem("Light");

        m2 = new Menu("Edit");
        mi1 = new MenuItem("Copy");
        mi2 = new MenuItem("Cut");
        mi3 = new MenuItem("Past");

        m3 = new Menu("Other");
        mi4 = new MenuItem("Exit");

        m1.add(mi);
        m1.add(mi6);

        m2.add(mi1);
        m2.add(mi2);
        m2.add(mi3);
        m3.add(mi4);

        mb.add(m1);
        mb.add(m2);
        mb.add(m3);

        mi1.addActionListener(this);
        mi2.addActionListener(this);
        mi3.addActionListener(this);
        mi.addActionListener(this);
        mi6.addActionListener(this);
        mi4.addActionListener(this);
        f.setMenuBar(mb);

        p1 = new Panel();
        p2 = new Panel();
        GridLayout g1 = new GridLayout(6, 4, 4, 4);
        p2.setLayout(g1);
        p2.setBackground(new Color(243, 243, 243));

        tf = new TextField(13);
        tf.setFont(f3);
        tf.setEditable(true);
        tf.setForeground(new Color(35, 34, 34));
        tf.setBackground(new Color(234, 229, 229));
        tf.setText("0");

        p1.add(tf);

        b1 = Button("1");
        b2 = Button("2");
        b3 = Button("3");
        b4 = Button("4");
        b5 = Button("5");
        b6 = Button("6");
        b7 = Button("7");
        b8 = Button("8");
        b9 = Button("9");
        b10 = Button("0");
        b11 = Button4("+/-");
        b12 = Button(".");
        b13 = Button1("=");
        b14 = Button5("+");
        b15 = Button5("-");
        b16 = Button5("×");
        b17 = Button5("÷");
        b18 = Button2("1/x");
        b19 = Button2("²√x ");
        b20 = Button2(" x²");
        b21 = Button3("<=");
        b22 = Button2("%");
        b23 = Button3("CE");
        b24 = Button3("C");

        p2.add(b22);
        p2.add(b23);
        p2.add(b24);

        p2.add(b21);

        p2.add(b18);
        p2.add(b19);
        p2.add(b20);
        p2.add(b17);

        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(b16);

        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(b15);

        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b14);

        p2.add(b11);
        p2.add(b10);
        p2.add(b12);
        p2.add(b13);

        f.add(p1, BorderLayout.NORTH);
        f.add(p2, BorderLayout.CENTER);

        f.setVisible(true);

    }

    private Button Button(String label) {//b1-b10 and b12
        Button b = new Button(label);
        b.setBackground(new Color(229, 229, 229));
        b.setForeground(new Color(44, 44, 44));
        b.setFont(new Font("Calibri", Font.BOLD, 30));
        b.addActionListener(this);
        return b;
    }

    private Button Button1(String label) {//b13
        Button b = new Button(label);
        b.setBackground(new Color(130, 186, 198));
        b.setForeground(new Color(35, 34, 34));
        b.setFont(new Font("Calibri", Font.BOLD, 20));
        b.addActionListener(this);
        return b;
    }

    private Button Button2(String label) {//b18-b20 and b22
        Button b = new Button(label);
        b.setBackground(new Color(210, 209, 209));
        b.setForeground(new Color(35, 34, 34));
        b.setFont(new Font("Calibri", Font.BOLD, 15));
        b.addActionListener(this);
        return b;
    }

    private Button Button3(String label) {//b21 ,b23,b26
        Button b = new Button(label);
        b.setBackground(new Color(175, 206, 196));
        b.setForeground(new Color(35, 34, 34));
        b.setFont(new Font("Calibri", Font.BOLD, 18));
        b.addActionListener(this);
        return b;
    }

    private Button Button4(String label) {//b11
        Button b = new Button(label);
        b.setBackground(new Color(229, 229, 229));
        b.setForeground(new Color(35, 34, 34));
        b.setFont(new Font("Calibri", Font.BOLD, 17));
        b.addActionListener(this);
        return b;
    }

    private Button Button5(String label) {//b14-b17
        Button b = new Button(label);
        b.setBackground(new Color(210, 209, 209));
        b.setForeground(new Color(35, 34, 34));
        b.setFont(new Font("Calibri", Font.PLAIN, 30));
        b.addActionListener(this);
        return b;
    }

    @Override
    public void actionPerformed(ActionEvent d) {

        if (tf.getText().equals("0")) {
            tf.setText("");
        }

        Object o = d.getSource();

        if (o.equals(b1)) {//1
            tf.setText(tf.getText() + b1.getLabel());
        } else if (o.equals(b2)) {//2
            tf.setText(tf.getText() + b2.getLabel());

        } else if (o.equals(b3)) {//3
            tf.setText(tf.getText() + b3.getLabel());

        } else if (o.equals(b4)) {//4
            tf.setText(tf.getText() + b4.getLabel());

        } else if (o.equals(b5)) {//5
            tf.setText(tf.getText() + b5.getLabel());

        } else if (o.equals(b6)) {//6
            tf.setText(tf.getText() + b6.getLabel());

        } else if (o.equals(b7)) {//7
            tf.setText(tf.getText() + b7.getLabel());

        } else if (o.equals(b8)) {//8
            tf.setText(tf.getText() + b8.getLabel());

        } else if (o.equals(b9)) {//9
            tf.setText(tf.getText() + b9.getLabel());

        } else if (o.equals(b10)) {//0
            tf.setText(tf.getText() + b10.getLabel());

        } else if (o.equals(b12)) {//.
            tf.setText(tf.getText() + b12.getLabel());

        } else if (o.equals(b14)) { //+

            fv = tf.getText();
            op = b14.getLabel();
            tf.setText("");

        } else if (o.equals(b15)) { //-

            fv = tf.getText();
            op = b15.getLabel();
            tf.setText("");

        } else if (o.equals(b16)) { //*

            fv = tf.getText();
            op = b16.getLabel();
            tf.setText("");

        } else if (o.equals(b17)) { //---

            fv = tf.getText();
            op = b17.getLabel();
            tf.setText("");

        } else if (o.equals(b22)) {//%
            fv = tf.getText();
            op = b17.getLabel();
            tf.setText("");

        } else if (o.equals(b11)) {//+/-

            if (np.equals("+")) {
                np = "-";
                tf.setText(np + tf.getText());

            } else {
                np = "+";
                tf.setText(tf.getText().substring(1));
            }
        } else if (o.equals(b18)) {//1/x
            fdv = Double.parseDouble(tf.getText());
            tf.setText("" + 1 / fdv);

        } else if (o.equals(b19)) {//2/x
            fdv = Double.parseDouble(tf.getText());
            Double dms = Math.sqrt(fdv);
            tf.setText("" + dms);

        } else if (o.equals(b20)) { //X2
            fdv = Double.parseDouble(tf.getText());
            tf.setText("" + fdv * fdv);

        } else if (o.equals(b23)) {//CE
            tf.setText("");
            sv = "";
            sdv = null;

        } else if (o.equals(b24)) {//C
            tf.setText("");
            fv = "";
            sv = "";
            op = "";
            fdv = null;
            sdv = null;
            tot = null;

        } else if (o.equals(b21)) {//<--

            tf.setText(tf.getText().substring(0, tf.getText().length() - 1));

        } else if (o.equals(b13)) { //=
            sv = tf.getText();

            fdv = Double.parseDouble(fv);//string value convert to double
            sdv = Double.parseDouble(sv);
            tf.setText("");
            if (op.equals("+")) {
                tot = fdv + sdv;
                tf.setText(tot + "");

            } else if (op.equals("-")) {
                tot = fdv - sdv;
                tf.setText(tot + "");

            } else if (op.equals("×")) {
                tot = fdv * sdv;
                tf.setText(tot + "");

            } else if (op.equals("÷")) {
                tot = fdv / sdv;
                tf.setText(tot + "");

            } else if (op.equals("%")) {
                tot = fdv * sdv / 100;
                tf.setText(tot + "");
            }

        }

        if (d.getSource() == mi) {
            p1.setBackground(new Color(62,61,60));
            p2.setBackground(new Color(62,61,60));

            tf.setForeground(new Color(236, 231, 233));
            tf.setBackground(new Color(60,60,60));
          

            b1.setBackground(new Color(88, 88, 88));
            b1.setForeground(new Color(236, 231, 233));
            b1.setFont(new Font("Calibri", Font.BOLD, 30));
            b2.setBackground(new Color(88, 88, 88));
            b2.setForeground(new Color(236, 231, 233));
            b3.setBackground(new Color(88, 88, 88));
            b3.setForeground(new Color(236, 231, 233));
            b3.setFont(new Font("Calibri", Font.BOLD, 30));
            b4.setBackground(new Color(88, 88, 88));
            b4.setForeground(new Color(236, 231, 233));
            b4.setFont(new Font("Calibri", Font.BOLD, 30));
            b5.setBackground(new Color(88, 88, 88));
            b5.setForeground(new Color(236, 231, 233));
            b5.setFont(new Font("Calibri", Font.BOLD, 30));
            b6.setBackground(new Color(88, 88, 88));
            b6.setForeground(new Color(236, 231, 233));
            b6.setFont(new Font("Calibri", Font.BOLD, 30));
            b7.setBackground(new Color(88, 88, 88));
            b7.setForeground(new Color(236, 231, 233));
            b7.setFont(new Font("Calibri", Font.BOLD, 30));
            b8.setBackground(new Color(88, 88, 88));
            b8.setForeground(new Color(236, 231, 233));
            b8.setFont(new Font("Calibri", Font.BOLD, 30));
            b9.setBackground(new Color(88, 88, 88));
            b9.setForeground(new Color(236, 231, 233));
            b9.setFont(new Font("Calibri", Font.BOLD, 30));
            b10.setBackground(new Color(88, 88, 88));
            b10.setForeground(new Color(236, 231, 233));
            b10.setFont(new Font("Calibri", Font.BOLD, 30));
            b12.setBackground(new Color(88, 88, 88));
            b12.setForeground(new Color(236, 231, 233));
            b12.setFont(new Font("Calibri", Font.BOLD, 30));

            b11.setForeground(new Color(236, 231, 233));
            b11.setFont(new Font("Calibri", Font.BOLD, 17));
            b11.setBackground(new Color(88, 88, 88));

            b13.setBackground(new Color(195, 136, 25));
            b13.setForeground(new Color(236, 231, 233));
            b13.setFont(new Font("Calibri", Font.BOLD, 20));

            b21.setBackground(new Color(209, 158, 61));
            b21.setForeground(new Color(251, 251, 251));
            b21.setFont(new Font("Calibri", Font.BOLD, 18));
            b23.setBackground(new Color(209, 158, 61));
            b23.setForeground(new Color(251, 251, 251));
            b23.setFont(new Font("Calibri", Font.BOLD, 18));
            b24.setBackground(new Color(209, 158, 61));
            b24.setForeground(new Color(251, 251, 251));
            b24.setFont(new Font("Calibri", Font.BOLD, 18));

            b14.setBackground(new Color(56, 56, 56));
            b14.setForeground(new Color(251, 251, 251));
            b14.setFont(new Font("Calibri", Font.PLAIN, 30));
            b15.setBackground(new Color(56, 56, 56));
            b15.setForeground(new Color(251, 251, 251));
            b15.setFont(new Font("Calibri", Font.PLAIN, 30));
            b16.setBackground(new Color(56, 56, 56));
            b16.setForeground(new Color(251, 251, 251));
            b16.setFont(new Font("Calibri", Font.PLAIN, 30));
            b17.setBackground(new Color(56, 56, 56));
            b17.setForeground(new Color(251, 251, 251));
            b17.setFont(new Font("Calibri", Font.PLAIN, 30));

            b18.setBackground(new Color(56, 56, 56));
            b18.setForeground(new Color(251, 251, 251));
            b18.setFont(new Font("Calibri", Font.BOLD, 15));
            b19.setBackground(new Color(56, 56, 56));
            b19.setForeground(new Color(251, 251, 251));
            b19.setFont(new Font("Calibri", Font.BOLD, 15));
            b20.setBackground(new Color(56, 56, 56));
            b20.setForeground(new Color(251, 251, 251));
            b20.setFont(new Font("Calibri", Font.BOLD, 15));
            b22.setBackground(new Color(56, 56, 56));
            b22.setForeground(new Color(251, 251, 251));
            b22.setFont(new Font("Calibri", Font.BOLD, 15));

        }
        if ((d.getSource() == mi6)) {
            p1.setBackground(new Color(243, 243, 243));
            p2.setBackground(new Color(243, 243, 243));

            tf.setForeground(new Color(35, 34, 34));
            tf.setBackground(new Color(234, 229, 229));

            b1.setBackground(new Color(229, 229, 229));
            b1.setForeground(new Color(35, 34, 34));
            b1.setFont(new Font("Calibri", Font.BOLD, 30));
            b2.setBackground(new Color(229, 229, 229));
            b2.setForeground(new Color(35, 34, 34));
            b3.setBackground(new Color(229, 229, 229));
            b3.setForeground(new Color(35, 34, 34));
            b3.setFont(new Font("Calibri", Font.BOLD, 30));
            b4.setBackground(new Color(229, 229, 229));
            b4.setForeground(new Color(35, 34, 34));
            b4.setFont(new Font("Calibri", Font.BOLD, 30));
            b5.setBackground(new Color(229, 229, 229));
            b5.setForeground(new Color(35, 34, 34));
            b5.setFont(new Font("Calibri", Font.BOLD, 30));
            b6.setBackground(new Color(229, 229, 229));
            b6.setForeground(new Color(35, 34, 34));
            b6.setFont(new Font("Calibri", Font.BOLD, 30));
            b7.setBackground(new Color(229, 229, 229));
            b7.setForeground(new Color(35, 34, 34));
            b7.setFont(new Font("Calibri", Font.BOLD, 30));
            b8.setBackground(new Color(229, 229, 229));
            b8.setForeground(new Color(35, 34, 34));
            b8.setFont(new Font("Calibri", Font.BOLD, 30));
            b9.setBackground(new Color(229, 229, 229));
            b9.setForeground(new Color(35, 34, 34));
            b9.setFont(new Font("Calibri", Font.BOLD, 30));
            b10.setBackground(new Color(229, 229, 229));
            b10.setForeground(new Color(44, 44, 44));
            b10.setFont(new Font("Calibri", Font.BOLD, 30));
            b12.setBackground(new Color(229, 229, 229));
            b12.setForeground(new Color(44, 44, 44));
            b12.setFont(new Font("Calibri", Font.BOLD, 30));

            b11.setFont(new Font("Calibri", Font.BOLD, 17));
            b11.setBackground(new Color(229, 229, 229));
            b11.setForeground(new Color(35, 34, 34));

            b13.setBackground(new Color(130, 186, 198));
            b13.setForeground(new Color(35, 34, 34));
            b13.setFont(new Font("Calibri", Font.BOLD, 20));

            b21.setBackground(new Color(175, 206, 196));
            b21.setForeground(new Color(35, 34, 34));
            b21.setFont(new Font("Calibri", Font.BOLD, 18));
            b23.setBackground(new Color(175, 206, 196));
            b23.setForeground(new Color(35, 34, 34));
            b23.setFont(new Font("Calibri", Font.BOLD, 18));
            b24.setBackground(new Color(175, 206, 196));
            b24.setForeground(new Color(35, 34, 34));
            b24.setFont(new Font("Calibri", Font.BOLD, 18));

            b14.setBackground(new Color(210, 209, 209));
            b14.setForeground(new Color(35, 34, 34));
            b14.setFont(new Font("Calibri", Font.PLAIN, 30));
            b15.setBackground(new Color(210, 209, 209));
            b15.setForeground(new Color(35, 34, 34));
            b15.setFont(new Font("Calibri", Font.PLAIN, 30));
            b16.setBackground(new Color(210, 209, 209));
            b16.setForeground(new Color(35, 34, 34));
            b16.setFont(new Font("Calibri", Font.PLAIN, 30));
            b17.setBackground(new Color(210, 209, 209));
            b17.setForeground(new Color(35, 34, 34));
            b17.setFont(new Font("Calibri", Font.PLAIN, 30));

            b18.setBackground(new Color(210, 209, 209));
            b18.setForeground(new Color(35, 34, 34));
            b18.setFont(new Font("Calibri", Font.BOLD, 15));
            b19.setBackground(new Color(210, 209, 209));
            b19.setForeground(new Color(35, 34, 34));
            b19.setFont(new Font("Calibri", Font.BOLD, 15));
            b20.setBackground(new Color(210, 209, 209));
            b20.setForeground(new Color(35, 34, 34));
            b20.setFont(new Font("Calibri", Font.BOLD, 15));
            b22.setBackground(new Color(210, 209, 209));
            b22.setForeground(new Color(35, 34, 34));
            b22.setFont(new Font("Calibri", Font.BOLD, 15));

        }

        if (d.getSource() == mi4) {

            System.exit(0);
        }

        if (d.getSource() == mi1) {//copy

            ccpsv = tf.getText();
        }
        if (d.getSource() == mi2) {//cut
            ccpsv = tf.getText();
            tf.setText("");
        }
        if (d.getSource() == mi3) {//past
            tf.setText(ccpsv);
        }

    }

}

public class Calculator {

    public static void main(String[] args) {
        new Cal();
    }

}
