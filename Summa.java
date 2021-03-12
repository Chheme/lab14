
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 class Summa extends Frame implements ActionListener {

     private JTextField textField1;
     private JTextField textField2;
     private JTextField textField3;
     private Button button1;
     private Button button2;
     private int sum;

    public Summa() {
        GridBagLayout gblWidgetPanel = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();

        JFrame frame = new JFrame();
        frame.setTitle("Sum of two digits");
        setLayout(null);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Label label1 = new Label("a");
        label1.setSize(10, 10);
        label1.setLocation(70, 70);
        frame.add(label1);

        Label label2 = new Label("b");
        label2.setSize(10, 10);
        label2.setLocation(70, 100);
        frame.add(label2);

        Label label3 = new Label("sum");
        label3.setSize(30, 10);
        label3.setLocation(70, 130);
        frame.add(label3);

        textField1 = new JTextField(10);
        textField1.setBounds(120, 68, 100, 18);
        textField1.addKeyListener(new BotSum());
        gblWidgetPanel.setConstraints(textField1, constraints);
        frame.add(textField1);

        textField2 = new JTextField();
        textField2.setBounds(120, 98, 100, 18);
        textField2.addKeyListener(new BotSum());
        frame.add(textField2);


        textField3 = new JTextField();
        textField3.setBounds(120, 128, 100, 18);
        textField3.addKeyListener(new BotSum());
        frame.add(textField3);


        Button button1 = new Button("Calculate");
        button1.setBounds(120, 160, 100, 25);
        button1.addActionListener(this);
        frame.add(button1);

        Button button2 = new Button("clear");
        button2.setBounds(120, 188, 100, 25);
        button2.addActionListener(this);
        frame.add(button2);


        Label p = new Label("");
        frame.add(p);

        frame.setSize(320, 280);
        frame.setVisible(true);
    }

    class BotSum extends KeyAdapter {

        public void keyReleased(KeyEvent e) {
            try {
            if (e.getKeyCode() != KeyEvent.VK_BACK_SPACE) {
                int a = Integer.parseInt(textField1.getText());
                int b = Integer.parseInt(textField2.getText());
               // textField3.setText(String.valueOf(a+b));
                sum=a+b;
            }  } catch (Exception ae) {
                System.out.println(ae);
            }
           // if (ae.getActionCommand().equals("Calculate")){
            //    textField3.setText(a+b);
            }}


//   }

       // @Override
         public void actionPerformed(ActionEvent ae) {
if (ae.getActionCommand().equals("Calculate")){
    textField3.setText(String.valueOf(sum));
           }
             if (ae.getActionCommand().equals("clear")){
                 textField1.setText("");
                 textField2.setText("");
                 textField3.setText("");
             }



         }


        public static void main(String[] args) {
new Summa();
        }


     }

    
