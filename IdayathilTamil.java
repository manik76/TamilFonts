/*
       Project:  Iruthayathil Tamil
       Date:     21 July 2010
       Scope:    TamilEzthu-Uru
*/


import java.awt.*;

public class IdayathilTamil{

Thread thmainwindow, thsplash;

IdayathilTamil()
{

  Thread thsplash = new Thread(new Splash());
  thsplash.start();

  Thread thmainwindow = new Thread(new MainWindow());
  thmainwindow.start();

  
}

public static void main(String args[])
{

     IdayathilTamil idayathilTamil = new IdayathilTamil();
    
}

}