package Practice;

import java.awt.*;

public class LoginFrame extends Frame {
    LoginFrame(){

        this.setVisible(true);
        this.setSize(700,300);
        this.setTitle("Login Frame");
        this.setBackground(Color.white);

    }

    public void paint(Graphics g){
        Font font = new Font("arial" , Font.BOLD , 30);
        g.setFont(font);
        this.setForeground(Color.red);
        g.drawString("Golam Kibria Tuhin " , 100 , 200);
    }

}
