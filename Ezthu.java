import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class Ezthu extends Frame implements KeyListener{


public void Ezthu()
{

addKeyListener(this);

}

public void keyPressed(KeyEvent evt)
{

System.out.println("Key Pressed " + evt.getKeyCode());

}


public void keyReleased(KeyEvent evt)
{

System.out.println("Key Released " + evt.getKeyCode());

}

public void keyTyped(KeyEvent evt)
{
}


}