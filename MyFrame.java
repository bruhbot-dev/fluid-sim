import java.awt.*;
import javax.swing.*;


public class MyFrame extends JFrame{
    MyPanel Panel;
    private ball ball1;

    MyFrame(ball ball1){
        this.ball1 =  ball1;
        Panel =  new MyPanel(ball1);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(Panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
