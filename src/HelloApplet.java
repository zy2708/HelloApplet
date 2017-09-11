import java.applet.Applet;
import java.awt.Graphics;
public class HelloApplet extends Applet {
    public void paint(Graphics g){
        g.drawLine(300,50,300,350);
        g.drawLine(400,50,400,350);
        g.drawLine(200,150,500,150);
        g.drawLine(200,250,500,250);
        g.drawLine(220,270,280,330);
        g.drawLine(220,330,280,270);
        g.drawLine(320,270,380,330);
        g.drawLine(320,330,380,270);
        g.drawLine(320,70,380,130);
        g.drawLine(320,130,380,70);
        g.drawLine(320,170,380,230);
        g.drawLine(320,230,380,170);
        g.drawOval(420,270,60,60);
        g.drawOval(220,70,60,60);
        g.drawOval(420,70,60,60);
    }
}