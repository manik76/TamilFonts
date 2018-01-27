/*
       Project:  Iruthayathil Tamil
       Date:     21 July 2010
       Scope:    TamilEzthu-Uru
*/

import java.awt.*;
import java.io.*;
import java.util.*;
import java.net.*;

public class Splash extends Frame implements Runnable{

Image img1;

Splash()
{

setTitle("");
img1 = getImage("iruthayathiltamil.png",this);
setSize(520,288);
setVisible(true);

}

public void run()
{
    show();

    for(;;)
    {
        try{Thread.sleep(5000);}
        catch(InterruptedException e){;}
        break;
    }

    hide();

}

public static Image getImage(String name, Component cmp)
{

  Image img = null;
  URLClassLoader urlLoader = (URLClassLoader)cmp.getClass().getClassLoader();
  URL fileLoc  = urlLoader.findResource(name);
  img = cmp.getToolkit().createImage(fileLoc);
  return img;

}

public void paint(Graphics g)
{

   g.drawImage(img1,0,20,this);

}

public static void main(String arg[])
{

Thread sh = new Thread(new Splash());

sh.start();

sh.stop();

}



}





