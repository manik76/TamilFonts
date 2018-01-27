/*

Peyar: tamilEzthu.java

Men-porul Alar: Ka. Manigandan

Thethi: 5/7/10

Ellaku:

Oru padam kodhuthu vital athilirunthu tamil ezthu-uru eduthu, koduka patta soll ezthum

*/

package co.in.dayam;

import javax.microedition.lcdui.*;
import java.io.*;
import java.util.*;


public class TamilEzthu{

static int ezthuuruAgalam = 60, ezthuuruNeelam = 40, parvaiPathi, padamPathi = 19;

static GameData gd;

static int ennikai=1, varisai = 0 , x3 = 0 , y3 = 0;

static int padamx=0, padamy=0, parvaix=0, parvaiy=0;

//no use for constructors in static

TamilEzthu()
{


}

public static void varaiEzthu(Graphics g)
{

gd = new GameData();


if(gd.uyerMey >= padamPathi)
{

padamx = (gd.uyerMey % 19)*ezthuuruAgalam;

padamy = (gd.uyerMey/ 19)*ezthuuruNeelam;

}
else
{

padamx = (gd.uyerMey ) * ezthuuruAgalam;

padamy = 0;

}

x3 = parvaix - padamx;
y3 = parvaiy - padamy;

  g.setClip(parvaix, parvaiy, ezthuuruAgalam, ezthuuruNeelam); 

  g.drawImage( gd.gameImage[1], x3 , y3 , g.TOP|g.LEFT);




}

public static void varaiSotrodar(Graphics g)
{

int athigaEzthu = 0;

gd = new GameData();

parvaix=0;

parvaiy=0;

x3 = 0 ;

y3 = 0;

// thirai alaviruku marum thanmai (dynamic change according to screen dimensions)

parvaiPathi = gd.screenWidth/ezthuuruAgalam;

athigaEzthu = gd.screenHeight/ezthuuruNeelam + gd.neendaPakkam*parvaiPathi;

for(int kuri = gd.neendaPakkam * parvaiPathi; kuri < (athigaEzthu) && kuri < gd.solAduku.length;
 kuri++)

{

System.out.println("step 2");


if(gd.solAduku[kuri] >= padamPathi)
{

padamx = (gd.solAduku[kuri] % 19)*ezthuuruAgalam;

padamy = (gd.solAduku[kuri] / 19)*ezthuuruNeelam;

}
else
{

padamx = (gd.solAduku[kuri] - 1)*ezthuuruAgalam;

padamy = 0;

}

x3 = parvaix - padamx;
y3 = parvaiy - padamy;

  g.setClip(parvaix, parvaiy, ezthuuruAgalam, ezthuuruNeelam); 

System.out.println("padamx padamy parvaix parvaiy "+padamx+","+padamy+", "+parvaix+", "+parvaiy);
System.out.println("x y page kuri sol "+x3+","+y3+", "+gd.neendaPakkam+", "+kuri+", "+gd.solAduku[kuri]);

g.drawImage(gd.gameImage[1], x3 , y3 , g.TOP|g.LEFT);

parvaix += ezthuuruAgalam;

if(parvaix > gd.screenWidth)
{

parvaiy += ezthuuruNeelam;
parvaix = 0;

}

}//end-for kuri

}//end-function varaiSotrodar


}//end-class