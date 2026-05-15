import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    Cookies logic = new Cookies();
    Color JColor = new Color(525, 64, 345);
    JFrame frame;
    JButton CButton;
    JButton Button;
    JPanel panel;
    JLabel CountLabel;
    Image Icon = new Image("Cookies.png");

    public GUI() {
        frame = new JFrame("COOKI COOKI");
        CButton = new JButton(Icon);
        CButton.setPreferredSize(new Dimension(500,500));
        CButton.addActionListener(e -> {
            logic.Click();
            Label();
        });
        Button = new JButton("Price for Upgrade "+logic.getcost());
        Button.addActionListener(e -> {
        if(logic.buyButton()){
            Label();
            Button.setText("Price for Upgrade "+logic.getcost());
        }
        else{
            JOptionPane.showMessageDialog(frame,
                    "Sorry, but you are required to give me" + logic.getcost() + " cookies.",;
        }
        });
      
        CountLabel = new JLabel("Number of Cookies"+logic.getCount()+", "+logic.getCookiesClick());

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5)); 
        panel.setLayout(new GridLayout(3, 2));
        panel.setBackground(JColor);
        panel.add(CButton);
        panel.add(Button);
        panel.add(CountLabel);

        frame.add(panel, BorderLayout.CENTER);
        frame.setIconImage(Icon.getImage());
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

public void Label(){
        CountLabel.setText("Cookies: "+logic.getCount()+", "+logic.getCookiesClick());
}
  
    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
