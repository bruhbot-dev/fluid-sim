import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.geom.Ellipse2D;

public class MyPanel extends JPanel implements ActionListener{

    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    Image square;
    Image backgroundImage;
    Timer timer;
    int xVelocity = 1;
    int yVelocity = 1;
    double x = 0;
    double y = 0;
    ball ball1;

    MyPanel(ball ball1){
        this.ball1 = ball1;

        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.white);
        
        timer = new Timer(1000, this);
        timer.start();
    }

    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2D =  (Graphics2D) g;
        Ellipse2D.Double shape = new Ellipse2D.Double(x, x, 50, 50);
        ((Graphics2D) g).draw(shape);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        x = x + ball1.getPosComp1();
        y = y + ball1.getPosComp2();
        System.out.println("repainted");
        System.out.println(x);
        repaint();
    }
}
