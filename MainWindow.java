/*
       Project:  Iruthayathil Tamil
       Date:     21 July 2010
       Scope:    TamilEzthu-Uru
*/

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.*;



public class MainWindow extends Frame implements Runnable, KeyListener{


String fileName;

Ezthu ezthu;


int munnarNilai = 0;

int cursorIdx = 0;




MenuBar mbar = new MenuBar();

Menu     file            = new Menu("\u0B85\u0B86\u0B87\u0B88");
MenuItem newer             = new MenuItem("Ezthu");
MenuItem open            = new MenuItem("Padi");
MenuItem save             = new MenuItem("Padivi");
MenuItem exit            = new MenuItem("Veliyae");

Menu     help            = new Menu("Udavi");
MenuItem about            = new MenuItem("Padaippu");

Thread thwarp, thweft, thwarpweft;

Help hlp;
About abt;

int uyerMey, uyerMeyNilai, uyerMeyNilai2;

final JFileChooser fc = new JFileChooser();

MainWindow(){

     mbar.add(file);
     mbar.add(help);
     file.add(newer);
     file.add(open);
     file.add(save);
     file.add(exit);
     help.add(about);

     addKeyListener(this);
     setMenuBar(mbar);
     setSize(1024,768);
}

public void run()
{
 show();     
 for(;;)
      {
	try{Thread.sleep(1000);}	         
	catch(InterruptedException e){}
      }
}

public void paint(Graphics g)
{

//     setBackground(Color.gray);
     setTitle("Idayathil Tamil");
  
}


public boolean action(Event evt, Object arg){

     String label = (String)arg;
     

     if(evt.target instanceof MenuItem)
        {
           if(label.equals("Ezthu"))
             {

               ezthu = new Ezthu();
               ezthu.show(); 

             }
           if(label.equals("Padivi"))
             {

             }
           if(label.equals("Padi"))
             {

                   int returnVal = fc.showOpenDialog(this);

                   if (returnVal == JFileChooser.APPROVE_OPTION) 
                      {
                              File file = fc.getSelectedFile();
                              fileName = file.getName();
                      }

             }

           if(label.equals("Veliyae"))
             {
                 hide();
                 System.exit(0);
             }

           if(label.equals("Udavi"))
             {
               hlp = new Help();
               hlp.show();               
             }

           if(label.equals("Padaippu"))
             {
                   abt = new About();
                   abt.setSize(240,292);
                   abt.show();
              
             }



        }
        return true;
}

public void keyPressed(KeyEvent evt)
{

System.out.println("Key Pressed " + evt.getKeyCode());

}


public void keyReleased(KeyEvent evt)
{

int keyCode = 0;

keyCode = evt.getKeyCode();
          
        switch(keyCode)
          { 
            case 65:
                      
                      uyerMey = 247;
                      uyermeyNilai2 = 0;
                      break;
   
            case 66:
                      uyermeyNilai++;
                      if(uyermeyNilai >= 3)
                      uyermeyNilai = 0;
                      break;

            case 67:
                      uyerMey = (uyerMeyNilai  + keyCode - 65 + 1) * 19+ uyerMeyNilai2; 
                      uyerMeyNilai2 = 0;
                      break;

            case 68:
                      
                      uyerMey = (uyerMeyNilai + keyCode - 65 + 3) * 19 + uyerMeyNilai2 ;
                      uyerMeyNilai2 = 0;
                      break;

            case 69:
                      uyerMey = (uyerMeyNilai + keyCode - 65 + 5) * 19 + uyerMeyNilai2 ;
                      uyerMeyNilai2 = 0;
                      break;
            case 70:
                      uyerMey = (uyerMeyNilai + keyCode - 65 + 7) * 19 + uyerMeyNilai2 ;
                      uyerMeyNilai2 = 0;
                      break;

            case 71:
                      uyerMey = uyerMeyNilai  + keyCode - 65 - 3; 
                      uyerMeyNilai2 = uyerMey;
                      break;


            case 72:
                      uyerMey =  uyerMeyNilai  + keyCode - 65 - 1; 
                      uyerMeyNilai2 = uyerMey;
                      break;

            case 73:
                      uyerMey =  uyerMeyNilai  + keyCode - 65 + 1; 
                      uyerMeyNilai2 = uyerMey;
                      break;

            case 74:
                      uyerMey = uyerMeyNilai  + keyCode - 65 + 3; 
                      uyerMeyNilai2 = uyerMey;
                      break;

            case 75:
                      uyerMey = uyerMeyNilai  + keyCode - 65  + 5; 
                      uyerMeyNilai2 = uyerMey;
                      break;

            case 76:
                      uyerMey = uyerMeyNilai  + keyCode - 65  + 7; 
                      uyerMeyNilai2 = uyerMey;
                      break;
             
          }   

System.out.println("cursorIdx" + cursorIdx);

}

public void keyTyped(KeyEvent evt)
{
}




public boolean handleEvent(Event evt){



      if(evt.id == Event.WINDOW_DESTROY)
             {
                hide();
                System.exit(0);
             }
      if(evt.id == Event.KEY_PRESS)
      {
            System.out.println("key pressed 123");
      }
      return super.handleEvent(evt);
}

}
