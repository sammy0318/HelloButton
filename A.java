package application;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class A {
    public static void main(String[] args) {
       
        JFrame frame = new JFrame("Hello Ji Button Example");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);

        
        JButton button = new JButton("Click Me jii");
        button.setBounds(130, 80, 120, 50); 

       
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              
                JOptionPane.showMessageDialog(frame, "Hello Ji");
            }
        });

        
        frame.add(button);

       
        frame.setVisible(true);
    }
}
