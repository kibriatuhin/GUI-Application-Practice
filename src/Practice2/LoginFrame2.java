package Practice2;

import java.awt.*;

public class LoginFrame2 extends Frame {
    public LoginFrame2(){
        this.setVisible(true);
        this.setTitle("Login frame");
        this.setSize(500 , 500);
        this.setBackground(Color.blue);
    }
    public void paint(Graphics g){
        Font font = new Font("arial" , Font.BOLD , 30);
        g.setFont(font);
        this.setForeground(Color.white);
        g.drawString("Golam Kibria Tuhin" , 100 , 100);

    }
}
