import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class yash {

    double total = 0.0;
    double total2 = 0.0;
    private char mathOperator;

    private  JPanel calculator;
    private JTextField text;
    private JButton B0;
    private JButton B7;
    private JButton B1;
    private JButton B4;
    private JButton B2;
    private JButton B5;
    private JButton B8;
    private JButton bDot;
    private JButton B3;
    private JButton B6;
    private JButton B9;
    private JButton bClear;
    private JButton bDivide;
    private JButton bPlus;
    private JButton bMinus;
    private JButton bMultiply;
    private JButton bEquals;

    public void operator(String btntext){
        mathOperator = btntext.charAt(0);
        total = total + Double.parseDouble(text.getText());
        text.setText("");
    }


    public yash() {
        B1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String B1test =text.getText() + B1.getText();
                text.setText(B1test);
            }
        });

        B2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String B2test =text.getText() + B2.getText();
                text.setText(B2test);
            }
        });

        B3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String B3test =text.getText() + B3.getText();
                text.setText(B3test);
            }
        });

        B4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String B4test =text.getText() + B4.getText();
                text.setText(B4test);
            }
        });

        B5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String B5test =text.getText() + B5.getText();
                text.setText(B5test);
            }
        });

        B6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String B6test =text.getText() + B6.getText();
                text.setText(B6test);
            }
        });

        B7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String B7test =text.getText() + B7.getText();
                text.setText(B7test);
            }
        });

//        B8.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String B8test =text.getText() + B8.getText();
//                text.setText(B8test);
//            }
//        });

        B8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String B8test =text.getText() + B8.getText();
                text.setText(B8test);
            }
        });

        B9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String B9test =text.getText() + B9.getText();
                text.setText(B9test);
            }
        });

        B0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String B0test =text.getText() + B0.getText();
                text.setText(B0test);
            }
        });

        bDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(text.getText().equals("")){
                    text.setText("0.");
                }else if(text.getText().contains(".")){
                    bDot.setEnabled(false);
                }else{
                    String value= text.getText()+ bDot.getText();
                    text.setText(value);

                }
                bDot.setEnabled(true);
            }
        });

        bClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total=0;
                text.setText("");
            }
        });

        bDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textValue = bDivide.getText();
                operator(textValue);
            }
        });

        bMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textValue = bMultiply.getText();
                operator(textValue);
            }
        });

        bMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textValue = bMinus.getText();
                operator(textValue);
            }
        });

        bPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String textValue = bPlus.getText();
            operator(textValue);
            }
        });

        bEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch(mathOperator){
                    case '+' :{
                        total2 = total + Double.parseDouble(text.getText());
                        break;
                    }
                    case '-' :{
                        total2 = total - Double.parseDouble(text.getText());
                        break;
                    }
                    case '/' :{
                        total2 = total / Double.parseDouble(text.getText());
                        break;
                    }
                    case '*' :{
                        total2 = total * Double.parseDouble(text.getText());
                        break;
                    }

                }


                text.setText(Double.toString(total2));
                total = 0;
            }
        });









    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public static void main(String[] args) {
         JFrame frame = new JFrame("MyCalculator");
         frame.setContentPane(new yash().calculator);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.pack();
         frame.setVisible(true);
    }
}
