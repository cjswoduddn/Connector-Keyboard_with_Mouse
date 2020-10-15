import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    GUI(){
        setTitle("GUI");
        this.setLayout(new FlowLayout());
        JButton jButton = new JButton("종료");
        jButton.addActionListener(new ActionListener() {
                                      @Override
                                      public void actionPerformed(ActionEvent e) {
                                          System.exit(0);
                                      }
                                  });
        add(jButton);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);
    }
}
