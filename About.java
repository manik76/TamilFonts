/*
       Project:  Iruthayathil Tamil
       Date:     21 July 2010
       Scope:    TamilEzthu-Uru
*/

import java.awt.*;
import java.io.*;
import java.util.*;
import java.net.*;

public class About extends Frame{

Image img1;

About()
{

  img1 = getImage("thayarippu.png", this);
  setTitle("Padaippu");

}

public void paint(Graphics g)
{

  g.drawImage(img1,0,0, this);

}


public static Image getImage(String name, Component cmp)
{

  Image img = null;
  URLClassLoader urlLoader = (URLClassLoader)cmp.getClass().getClassLoader();
  URL fileLoc  = urlLoader.findResource(name);
  img = cmp.getToolkit().createImage(fileLoc);
  return img;

}


public boolean handleEvent(Event evt){

 if(evt.id == Event.WINDOW_DESTROY)
    {
          hide();
    }
 return super.handleEvent(evt);

}

}





