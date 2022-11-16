// Lab06vst.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*;


public class Lab06vst extends Applet
{

    public void paint(Graphics g) {

            // Draw Grid
            g.drawRect(10, 10, 780, 580);
            g.drawLine(400, 10, 400, 590);
            g.drawLine(10, 300, 790, 300);



            // Draw Random Lines
        for (int k = 0; k <= 100; k++) {
            Random rand = new Random();
            int x1 = rand.nextInt(380) + 10;
            int y1 = rand.nextInt(280) + 10;
            int x2 = rand.nextInt(380) + 10;
            int y2 = rand.nextInt(280) + 10;
            g.drawLine(x1, y1, x2, y2);

            Random color1 = new Random();
            int red = color1.nextInt(256);
            int blue = color1.nextInt(256);
            int green = color1.nextInt(256);
            g.setColor(new Color(red,green,blue));

        }

            // Draw Random Squares
        for (int k = 0; k <= 100; k++) {
            Random rand = new Random();
            int x1 = rand.nextInt(330) + 410;
            int y1 = rand.nextInt(240) + 10;
            int width = 50;
            int height = 50;
            g.fillRect(x1, y1, width, height);

            Random color2 = new Random();
            int red = color2.nextInt(256);
            int blue = color2.nextInt(256);
            int green = color2.nextInt(256);
            g.setColor(new Color(red,green,blue));

        }

            // Draw Random Circles
        for(int k = 0; k <= 100; k++){
            Random rand = new Random();
            int x1 = rand.nextInt(185) + 10;
            int y1 = rand.nextInt(65)+ 320;
            int width = rand.nextInt(200);
            int height = width;

            Random color3 = new Random();
            int red = color3.nextInt(256);
            int blue = color3.nextInt(256);
            int green = color3.nextInt(256);
            g.setColor(new Color(red,green,blue));

            g.drawOval(x1,y1,width,height);
        }




        // Draw 3-D Box


        }

    }




    
 