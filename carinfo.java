import javax.swing.*;
//import java.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.sql.*;
import java.util.*;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.awt.image.*;
public class carinfo extends JFrame implements ActionListener,MouseListener
{Font f1 = new Font("Arial",Font.BOLD,18);
Font f2 = new Font("Times New Roman",Font.PLAIN,14);
Font f3 = new Font("Times New Roman",Font.PLAIN,12);

JLabel l1= new JLabel("<html><font color='blue'>VOLKSWAGEN CAR INFO CENTRE</font></html>");
JLabel l2 = new JLabel("<html><font color='red'>Enter the details</font></html>");
JLabel l3 = new JLabel("<html><font color = 'black'>CAR NAME </font</html>");
JLabel l4 = new JLabel("<html><font color = 'black'>CAR MODEL </font</html>");
JLabel l5 = new JLabel("<html><font color = 'black'>FUEL </font</html>");
//JLabel l3 = new Jlabel("<html><font color = 'black'>CAR NAME </font</html>");




JComboBox carname = new JComboBox();
JComboBox carmodel = new JComboBox();
JComboBox fuel = new JComboBox();

JFrame fr1,fr2,fr3,fr4,fr5,fr6,fr7,fr8;
ImageIcon[] ii= new ImageIcon[4];
JLabel imagelabel;

JLabel i1=new JLabel("CAR NAME");
JLabel i2=new JLabel("CAR MODEL");
JLabel i3=new JLabel("FUEL");
JLabel i4=new JLabel("CAR SPECIFICATIONS");
JLabel i5=new JLabel("ENGINE CC");
JLabel i6=new JLabel("MILEGE");
JLabel i7=new JLabel("MAX TORQUE");
JLabel i8=new JLabel("MAX POWER");
JLabel i9=new JLabel("TRANSMISSION");
JLabel i10=new JLabel("EX-SHOWROOM PRICE");
JLabel i11=new JLabel("ON ROAD PRICE");
JLabel i12=new JLabel("EMI");
JLabel i13=new JLabel("NO OF CYLINDERS");
JLabel i14=new JLabel("PADDLE SHIFT");
JLabel i15=new JLabel("SAFETY");
JLabel i16=new JLabel("AIRBAGS");

JButton getinfo = new JButton("Get Info");
public void carinfo()
{
setLayout(null);

add(l1);
add(l2);
add(l3);
add(l4);
add(l5);


add(carname);
add(carmodel);
add(fuel);
add(getinfo);

carname.addItem(" ");
carname.addItem("POLO");
//carname.addItem("VENTO");
carname.addItem("JETTA");
carname.addItem("BEETLE");
carmodel.addItem(" ");
carmodel.addItem("bm1");
carmodel.addItem("he1");
fuel.addItem(" ");
fuel.addItem("PETROL");
fuel.addItem("DIESEL");
l3.setBounds(0,0,100,30);
carname.setBounds(100,0,100,30);
l4.setBounds(0,40,100,30);
carmodel.setBounds(100,40,100,30);
l5.setBounds(0,80,100,30);
fuel.setBounds(100,80,100,30);
getinfo.setBounds(100,120,80,40);

l1.setFont(f1);
l2.setFont(f2);
l3.setFont(f3);
l4.setFont(f3);
l5.setFont(f3);

getinfo.addActionListener(new Listener1());


}

public void actionPerformed(ActionEvent e)
{ 
//l15.setText(t1.getText());
// fr2.setVisible(true); 
}

@Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }





class Listener1 implements ActionListener 
{ 
public void actionPerformed(ActionEvent e) 
{ 
if(e.getSource() ==  getinfo) 
{
 String s1=(String)carname.getSelectedItem();
String s2=(String)carmodel.getSelectedItem();
String s3=(String)fuel.getSelectedItem();
JFrame fr1 = new JFrame();
JFrame fr2 = new JFrame();
JFrame fr3 = new JFrame();
JFrame fr4 = new JFrame();
JFrame fr5 = new JFrame();
JFrame fr6 = new JFrame();
if(s1=="POLO")
{
if(s2=="bm1")
{
if(s3=="PETROL")
{
fr1.setLayout(null);


JLabel i1a=new JLabel("POLO");
JLabel i2a=new JLabel("bm1");
JLabel i3a=new JLabel("PETROL");
//JLabel i4=new JLabel("CAR SPECIFICATIONS");
JLabel i5a=new JLabel("1498 CC");
JLabel i6a=new JLabel("14.5 kmpl");
JLabel i7a=new JLabel("250Nm");
JLabel i8a=new JLabel("MAX POWER");
JLabel i9a=new JLabel("MANUAL");
JLabel i10a=new JLabel("5.43Lac");
JLabel i11a=new JLabel("7.18Lac");
JLabel i12a=new JLabel("Rs.11,789");
JLabel i13a=new JLabel("3");
JLabel i14a=new JLabel("N");
JLabel i15a=new JLabel("ABS,Child Safety Locks");
JLabel i16a=new JLabel("2");

fr1.add(i1);
fr1.add(i2);
fr1.add(i3);
fr1.add(i4);
fr1.add(i5);
fr1.add(i6);
fr1.add(i7);
fr1.add(i8);
fr1.add(i9);
fr1.add(i10);
fr1.add(i11);
fr1.add(i12);
fr1.add(i13);
fr1.add(i14);
fr1.add(i15);
fr1.add(i16);

fr1.add(i1a);
fr1.add(i2a);
fr1.add(i3a);
//fr1.add(i4a);
fr1.add(i5a);
fr1.add(i6a);
fr1.add(i7a);
fr1.add(i8a);
fr1.add(i9a);
fr1.add(i10a);
fr1.add(i11a);
fr1.add(i12a);
fr1.add(i13a);
fr1.add(i14a);
fr1.add(i15a);
fr1.add(i16a);

JLabel change = new JLabel("VIEW THE CAR IMAGES");
fr1.add(change);
change.setBounds(0,0,200,100);
change.addMouseListener(new MouseListener()
{
public void mouseClicked(MouseEvent me)
{

JFrame jf= new JFrame();
jf.setVisible(true);
jf.setSize(1000,1000);
jf.setLayout(null);
JLabel newimg = new JLabel("NEXT");
jf.add(newimg);
newimg.setBounds(0,0,100,100);
newimg.addMouseListener(new MouseListener()
{
public void mouseClicked(MouseEvent m)
{
for(int i=0;i<4;i++)
{
 ii[i] = new ImageIcon("G:\\polo\\polo" + Integer.toString(i+1) + ".png");
}
imagelabel=new JLabel(ii[new Random().nextInt(4)]);
Random r = new Random();
int i = r.nextInt(4);
while(imagelabel.getIcon().toString() == ii[i].toString())
{
i = r.nextInt(4);
}
imagelabel.setIcon(ii[i]);
jf.add(imagelabel);


}
public void mouseExited(MouseEvent m)
{}
public void mouseEntered(MouseEvent m)
{}
public void mouseReleased(MouseEvent m)
{}
public void mousePressed(MouseEvent m)
{}});
}
public void mouseExited(MouseEvent me)
{}
public void mouseEntered(MouseEvent me)
{}
public void mouseReleased(MouseEvent me)
{}
public void mousePressed(MouseEvent me)
{}
});
//});
fr1.setVisible(true);
fr1.setSize(1000,1000);
}
}
}
if(s1=="POLO")
{
if(s2=="he1")
{
if(s3=="PETROL")
{
fr2.setLayout(null);

JLabel j1a=new JLabel("POLO");
JLabel j2a=new JLabel("he1");
JLabel j3a=new JLabel("PETROL");
//JLabel i4=new JLabel("CAR SPECIFICATIONS");
JLabel j5a=new JLabel("1500 CC");
JLabel j6a=new JLabel("15.5 kmpl");
JLabel j7a=new JLabel("252Nm");
JLabel j8a=new JLabel("MAX POWER");
JLabel j9a=new JLabel("AUTOMATIC");
JLabel j10a=new JLabel("6.43Lac");
JLabel j11a=new JLabel("8.18Lac");
JLabel j12a=new JLabel("Rs.19,789");
JLabel j13a=new JLabel("3");
JLabel j14a=new JLabel("N");
JLabel j15a=new JLabel("ABS,Child Safety Locks");
JLabel j16a=new JLabel("4");



fr2.add(i1);
fr2.add(i2);
fr2.add(i3);
fr2.add(i4);
fr2.add(i5);
fr2.add(i6);
fr2.add(i7);
fr2.add(i8);
fr2.add(i9);
fr2.add(i10);
fr2.add(i11);
fr2.add(i12);
fr2.add(i13);
fr2.add(i14);
fr2.add(i15);
fr2.add(i16);

fr2.add(j1a);
fr2.add(j2a);
fr2.add(j3a);
//fr1.add(i4a);
fr2.add(j5a);
fr2.add(j6a);
fr2.add(j7a);
fr2.add(j8a);
fr2.add(j9a);
fr2.add(j10a);
fr2.add(j11a);
fr2.add(j12a);
fr2.add(j13a);
fr2.add(j14a);
fr2.add(j15a);
fr2.add(j16a);
JLabel change = new JLabel("VIEW THE CAR IMAGES");
add(change);
change.addMouseListener(new MouseListener()
{
public void mouseClicked(MouseEvent me)
{

JFrame jf= new JFrame();
jf.setLayout(null);
JLabel newimg = new JLabel("NEXT");
jf.add(newimg);
newimg.addMouseListener(new MouseListener()
{
public void mouseClicked(MouseEvent m)
{
for(int i=0;i<4;i++)
{
 ii[i] = new ImageIcon("G:\\polo\\polo" + Integer.toString(i+1) + ".png");
}
imagelabel=new JLabel(ii[new Random().nextInt(4)]);
Random r = new Random();
int i = r.nextInt(4);
while(imagelabel.getIcon().toString() == ii[i].toString())
{
i = r.nextInt(4);
}
imagelabel.setIcon(ii[i]);
jf.add(imagelabel);
jf.setVisible(true);
jf.setSize(1000,1000);
}
public void mouseExited(MouseEvent m)
{}
public void mouseEntered(MouseEvent m)
{}
public void mouseReleased(MouseEvent m)
{}
public void mousePressed(MouseEvent m)
{}});
}
public void mouseExited(MouseEvent me)
{}
public void mouseEntered(MouseEvent me)
{}
public void mouseReleased(MouseEvent me)
{}
public void mousePressed(MouseEvent me)
{}
});
fr2.setVisible(true);
fr2.setSize(1000,1000);

}}}

if(s1=="POLO")
{
if(s2=="he1")
{
if(s3=="DIESEL")
{
fr3.setLayout(null);

JLabel j1a=new JLabel("POLO");
JLabel j2a=new JLabel("he1");
JLabel j3a=new JLabel("DIESEL");
//JLabel i4=new JLabel("CAR SPECIFICATIONS");
JLabel j5a=new JLabel("1500 CC");
JLabel j6a=new JLabel("18.5 kmpl");
JLabel j7a=new JLabel("252Nm");
JLabel j8a=new JLabel("MAX POWER");
JLabel j9a=new JLabel("AUTOMATIC");
JLabel j10a=new JLabel("7.43Lac");
JLabel j11a=new JLabel("9.18Lac");
JLabel j12a=new JLabel("Rs.29,789");
JLabel j13a=new JLabel("3");
JLabel j14a=new JLabel("N");
JLabel j15a=new JLabel("ABS,Child Safety Locks");
JLabel j16a=new JLabel("4");



fr3.add(i1);
fr3.add(i2);
fr3.add(i3);
fr3.add(i4);
fr3.add(i5);
fr3.add(i6);
fr3.add(i7);
fr3.add(i8);
fr3.add(i9);
fr3.add(i10);
fr3.add(i11);
fr3.add(i12);
fr3.add(i13);
fr3.add(i14);
fr3.add(i15);
fr3.add(i16);

fr3.add(j1a);
fr3.add(j2a);
fr3.add(j3a);
//fr1.add(i4a);
fr3.add(j5a);
fr3.add(j6a);
fr3.add(j7a);
fr3.add(j8a);
fr3.add(j9a);
fr3.add(j10a);
fr3.add(j11a);
fr3.add(j12a);
fr3.add(j13a);
fr3.add(j14a);
fr3.add(j15a);
fr3.add(j16a);
JLabel change = new JLabel("VIEW THE CAR IMAGES");
add(change);
change.addMouseListener(new MouseListener()
{
public void mouseClicked(MouseEvent me)
{

JFrame jf= new JFrame();
jf.setLayout(null);
JLabel newimg = new JLabel("NEXT");
jf.add(newimg);
newimg.addMouseListener(new MouseListener()
{
public void mouseClicked(MouseEvent m)
{
for(int i=0;i<4;i++)
{
 ii[i] = new ImageIcon("G:\\polo\\polo" + Integer.toString(i+1) + ".png");
}
imagelabel=new JLabel(ii[new Random().nextInt(4)]);
Random r = new Random();
int i = r.nextInt(4);
while(imagelabel.getIcon().toString() == ii[i].toString())
{
i = r.nextInt(4);
}
imagelabel.setIcon(ii[i]);
jf.add(imagelabel);
jf.setVisible(true);
jf.setSize(1000,1000);
}
public void mouseExited(MouseEvent m)
{}
public void mouseEntered(MouseEvent m)
{}
public void mouseReleased(MouseEvent m)
{}
public void mousePressed(MouseEvent m)
{}});
}
public void mouseExited(MouseEvent me)
{}
public void mouseEntered(MouseEvent me)
{}
public void mouseReleased(MouseEvent me)
{}
public void mousePressed(MouseEvent me)
{}
});
fr3.setVisible(true);
fr3.setSize(1000,1000);

}}}

if(s1=="POLO")
{
if(s2=="bm1")
{
if(s3=="DIESEL")
{
fr4.setLayout(null);


JLabel i1a=new JLabel("POLO");
JLabel i2a=new JLabel("bm1");
JLabel i3a=new JLabel("DIESEL");
//JLabel i4=new JLabel("CAR SPECIFICATIONS");
JLabel i5a=new JLabel("1498 CC");
JLabel i6a=new JLabel("17.5 kmpl");
JLabel i7a=new JLabel("250Nm");
JLabel i8a=new JLabel("MAX POWER");
JLabel i9a=new JLabel("MANUAL");
JLabel i10a=new JLabel("5.43Lac");
JLabel i11a=new JLabel("8.18Lac");
JLabel i12a=new JLabel("Rs.31,789");
JLabel i13a=new JLabel("3");
JLabel i14a=new JLabel("N");
JLabel i15a=new JLabel("ABS,Child Safety Locks");
JLabel i16a=new JLabel("2");

fr4.add(i1);
fr4.add(i2);
fr4.add(i3);
fr4.add(i4);
fr4.add(i5);
fr4.add(i6);
fr4.add(i7);
fr4.add(i8);
fr4.add(i9);
fr4.add(i10);
fr4.add(i11);
fr4.add(i12);
fr4.add(i13);
fr4.add(i14);
fr4.add(i15);
fr4.add(i16);

fr4.add(i1a);
fr4.add(i2a);
fr4.add(i3a);
//fr1.add(i4a);
fr4.add(i5a);
fr4.add(i6a);
fr4.add(i7a);
fr4.add(i8a);
fr4.add(i9a);
fr4.add(i10a);
fr4.add(i11a);
fr4.add(i12a);
fr4.add(i13a);
fr4.add(i14a);
fr4.add(i15a);
fr4.add(i16a);
JLabel change = new JLabel("VIEW THE CAR IMAGES");
add(change);
change.addMouseListener(new MouseListener()
{
public void mouseClicked(MouseEvent me)
{

JFrame jf= new JFrame();
jf.setLayout(null);
JLabel newimg = new JLabel("NEXT");
jf.add(newimg);
newimg.addMouseListener(new MouseListener()
{
public void mouseClicked(MouseEvent m)
{
for(int i=0;i<4;i++)
{
 ii[i] = new ImageIcon("G:\\polo\\polo" + Integer.toString(i+1) + ".png");
}
imagelabel=new JLabel(ii[new Random().nextInt(4)]);
Random r = new Random();
int i = r.nextInt(4);
while(imagelabel.getIcon().toString() == ii[i].toString())
{
i = r.nextInt(4);
}
imagelabel.setIcon(ii[i]);
jf.add(imagelabel);
jf.setVisible(true);
jf.setSize(1000,1000);
}
public void mouseExited(MouseEvent m)
{}
public void mouseEntered(MouseEvent m)
{}
public void mouseReleased(MouseEvent m)
{}
public void mousePressed(MouseEvent m)
{}});
}
public void mouseExited(MouseEvent me)
{}
public void mouseEntered(MouseEvent me)
{}
public void mouseReleased(MouseEvent me)
{}
public void mousePressed(MouseEvent me)
{}
});
fr4.setVisible(true);
fr4.setSize(1000,1000);
}
}
}

if(s1=="JETTA")
{
if(s2=="bm1")
{
if(s3=="PETROL")
{
fr1.setLayout(null);


JLabel i1a=new JLabel("JETTA");
JLabel i2a=new JLabel("bm1");
JLabel i3a=new JLabel("PETROL");
//JLabel i4=new JLabel("CAR SPECIFICATIONS");
JLabel i5a=new JLabel("1498 CC");
JLabel i6a=new JLabel("11.5 kmpl");
JLabel i7a=new JLabel("280Nm");
JLabel i8a=new JLabel("MAX POWER");
JLabel i9a=new JLabel("MANUAL");
JLabel i10a=new JLabel("25.43Lac");
JLabel i11a=new JLabel("27.18Lac");
JLabel i12a=new JLabel("Rs.31,789");
JLabel i13a=new JLabel("4");
JLabel i14a=new JLabel("N");
JLabel i15a=new JLabel("ABS,Child Safety Locks,Reverse camera");
JLabel i16a=new JLabel("4");

fr1.add(i1);
fr1.add(i2);
fr1.add(i3);
fr1.add(i4);
fr1.add(i5);
fr1.add(i6);
fr1.add(i7);
fr1.add(i8);
fr1.add(i9);
fr1.add(i10);
fr1.add(i11);
fr1.add(i12);
fr1.add(i13);
fr1.add(i14);
fr1.add(i15);
fr1.add(i16);

fr1.add(i1a);
fr1.add(i2a);
fr1.add(i3a);
//fr1.add(i4a);
fr1.add(i5a);
fr1.add(i6a);
fr1.add(i7a);
fr1.add(i8a);
fr1.add(i9a);
fr1.add(i10a);
fr1.add(i11a);
fr1.add(i12a);
fr1.add(i13a);
fr1.add(i14a);
fr1.add(i15a);
fr1.add(i16a);
JLabel change = new JLabel("VIEW THE CAR IMAGES");
add(change);
change.addMouseListener(new MouseListener()
{
public void mouseClicked(MouseEvent me)
{

JFrame jf= new JFrame();
jf.setLayout(null);
JLabel newimg = new JLabel("NEXT");
jf.add(newimg);
newimg.addMouseListener(new MouseListener()
{
public void mouseClicked(MouseEvent m)
{
for(int i=0;i<4;i++)
{
 ii[i] = new ImageIcon("G:\\jetta\\jetta" + Integer.toString(i+1) + ".png");
}
imagelabel=new JLabel(ii[new Random().nextInt(4)]);
Random r = new Random();
int i = r.nextInt(4);
while(imagelabel.getIcon().toString() == ii[i].toString())
{
i = r.nextInt(4);
}
imagelabel.setIcon(ii[i]);
jf.add(imagelabel);
jf.setVisible(true);
jf.setSize(1000,1000);
}
public void mouseExited(MouseEvent m)
{}
public void mouseEntered(MouseEvent m)
{}
public void mouseReleased(MouseEvent m)
{}
public void mousePressed(MouseEvent m)
{}});
}
public void mouseExited(MouseEvent me)
{}
public void mouseEntered(MouseEvent me)
{}
public void mouseReleased(MouseEvent me)
{}
public void mousePressed(MouseEvent me)
{}
});
fr1.setVisible(true);
fr1.setSize(1000,1000);
}
}
}

if(s1=="JETTA")
{
if(s2=="he1")
{
if(s3=="PETROL")
{
fr2.setLayout(null);

JLabel j1a=new JLabel("JETTA");
JLabel j2a=new JLabel("he1");
JLabel j3a=new JLabel("PETROL");
//JLabel i4=new JLabel("CAR SPECIFICATIONS");
JLabel j5a=new JLabel("1500 CC");
JLabel j6a=new JLabel("11.5 kmpl");
JLabel j7a=new JLabel("252Nm");
JLabel j8a=new JLabel("MAX POWER");
JLabel j9a=new JLabel("AUTOMATIC");
JLabel j10a=new JLabel("26.43Lac");
JLabel j11a=new JLabel("29.18Lac");
JLabel j12a=new JLabel("Rs.39,789");
JLabel j13a=new JLabel("3");
JLabel j14a=new JLabel("N");
JLabel j15a=new JLabel("ABS,Child Safety Locks,Reverse Camera,Paeking sensors");
JLabel j16a=new JLabel("4");



fr2.add(i1);
fr2.add(i2);
fr2.add(i3);
fr2.add(i4);
fr2.add(i5);
fr2.add(i6);
fr2.add(i7);
fr2.add(i8);
fr2.add(i9);
fr2.add(i10);
fr2.add(i11);
fr2.add(i12);
fr2.add(i13);
fr2.add(i14);
fr2.add(i15);
fr2.add(i16);

fr2.add(j1a);
fr2.add(j2a);
fr2.add(j3a);
//fr1.add(i4a);
fr2.add(j5a);
fr2.add(j6a);
fr2.add(j7a);
fr2.add(j8a);
fr2.add(j9a);
fr2.add(j10a);
fr2.add(j11a);
fr2.add(j12a);
fr2.add(j13a);
fr2.add(j14a);
fr2.add(j15a);
fr2.add(j16a);
JLabel change = new JLabel("VIEW THE CAR IMAGES");
add(change);
change.addMouseListener(new MouseListener()
{
public void mouseClicked(MouseEvent me)
{

JFrame jf= new JFrame();
jf.setLayout(null);
JLabel newimg = new JLabel("NEXT");
jf.add(newimg);
newimg.addMouseListener(new MouseListener()
{
public void mouseClicked(MouseEvent m)
{
for(int i=0;i<4;i++)
{
 ii[i] = new ImageIcon("G:\\jetta\\jetta" + Integer.toString(i+1) + ".png");
}
imagelabel=new JLabel(ii[new Random().nextInt(4)]);
Random r = new Random();
int i = r.nextInt(4);
while(imagelabel.getIcon().toString() == ii[i].toString())
{
i = r.nextInt(4);
}
imagelabel.setIcon(ii[i]);
jf.add(imagelabel);
jf.setVisible(true);
jf.setSize(1000,1000);
}
public void mouseExited(MouseEvent m)
{}
public void mouseEntered(MouseEvent m)
{}
public void mouseReleased(MouseEvent m)
{}
public void mousePressed(MouseEvent m)
{}});
}
public void mouseExited(MouseEvent me)
{}
public void mouseEntered(MouseEvent me)
{}
public void mouseReleased(MouseEvent me)
{}
public void mousePressed(MouseEvent me)
{}
});
fr2.setVisible(true);
fr2.setSize(1000,1000);

}}}

if(s1=="JETTA")
{
if(s2=="he1")
{
if(s3=="DIESEL")
{
fr3.setLayout(null);

JLabel j1a=new JLabel("JETTA");
JLabel j2a=new JLabel("he1");
JLabel j3a=new JLabel("DIESEL");
//JLabel i4=new JLabel("CAR SPECIFICATIONS");
JLabel j5a=new JLabel("1500 CC");
JLabel j6a=new JLabel("18.5 kmpl");
JLabel j7a=new JLabel("252Nm");
JLabel j8a=new JLabel("MAX POWER");
JLabel j9a=new JLabel("AUTOMATIC");
JLabel j10a=new JLabel("28.43Lac");
JLabel j11a=new JLabel("31.18Lac");
JLabel j12a=new JLabel("Rs.45,789");
JLabel j13a=new JLabel("4");
JLabel j14a=new JLabel("N");
JLabel j15a=new JLabel("ABS,Child Safety Locks,Reverse Camera,Parking sensor");
JLabel j16a=new JLabel("4");



fr3.add(i1);
fr3.add(i2);
fr3.add(i3);
fr3.add(i4);
fr3.add(i5);
fr3.add(i6);
fr3.add(i7);
fr3.add(i8);
fr3.add(i9);
fr3.add(i10);
fr3.add(i11);
fr3.add(i12);
fr3.add(i13);
fr3.add(i14);
fr3.add(i15);
fr3.add(i16);

fr3.add(j1a);
fr3.add(j2a);
fr3.add(j3a);
//fr1.add(i4a);
fr3.add(j5a);
fr3.add(j6a);
fr3.add(j7a);
fr3.add(j8a);
fr3.add(j9a);
fr3.add(j10a);
fr3.add(j11a);
fr3.add(j12a);
fr3.add(j13a);
fr3.add(j14a);
fr3.add(j15a);
fr3.add(j16a);
JLabel change = new JLabel("VIEW THE CAR IMAGES");
add(change);
change.addMouseListener(new MouseListener()
{
public void mouseClicked(MouseEvent me)
{

JFrame jf= new JFrame();
jf.setLayout(null);
JLabel newimg = new JLabel("NEXT");
jf.add(newimg);
newimg.addMouseListener(new MouseListener()
{
public void mouseClicked(MouseEvent m)
{
for(int i=0;i<4;i++)
{
 ii[i] = new ImageIcon("G:\\jetta\\jetta" + Integer.toString(i+1) + ".png");
}
imagelabel=new JLabel(ii[new Random().nextInt(4)]);
Random r = new Random();
int i = r.nextInt(4);
while(imagelabel.getIcon().toString() == ii[i].toString())
{
i = r.nextInt(4);
}
imagelabel.setIcon(ii[i]);
jf.add(imagelabel);
jf.setVisible(true);
jf.setSize(1000,1000);
}
public void mouseExited(MouseEvent m)
{}
public void mouseEntered(MouseEvent m)
{}
public void mouseReleased(MouseEvent m)
{}
public void mousePressed(MouseEvent m)
{}});
}
public void mouseExited(MouseEvent me)
{}
public void mouseEntered(MouseEvent me)
{}
public void mouseReleased(MouseEvent me)
{}
public void mousePressed(MouseEvent me)
{}
});
fr3.setVisible(true);
fr3.setSize(1000,1000);

}}}

if(s1=="JETTA")
{
if(s2=="bm1")
{
if(s3=="DIESEL")
{
fr4.setLayout(null);


JLabel i1a=new JLabel("JETTA");
JLabel i2a=new JLabel("bm1");
JLabel i3a=new JLabel("DIESEL");
//JLabel i4=new JLabel("CAR SPECIFICATIONS");
JLabel i5a=new JLabel("1500 CC");
JLabel i6a=new JLabel("17.5 kmpl");
JLabel i7a=new JLabel("250Nm");
JLabel i8a=new JLabel("MAX POWER");
JLabel i9a=new JLabel("MANUAL");
JLabel i10a=new JLabel("27.43Lac");
JLabel i11a=new JLabel("30.18Lac");
JLabel i12a=new JLabel("Rs.41,789");
JLabel i13a=new JLabel("3");
JLabel i14a=new JLabel("N");
JLabel i15a=new JLabel("ABS,Child Safety Locks,Reverse Camera");
JLabel i16a=new JLabel("2");

fr4.add(i1);
fr4.add(i2);
fr4.add(i3);
fr4.add(i4);
fr4.add(i5);
fr4.add(i6);
fr4.add(i7);
fr4.add(i8);
fr4.add(i9);
fr4.add(i10);
fr4.add(i11);
fr4.add(i12);
fr4.add(i13);
fr4.add(i14);
fr4.add(i15);
fr4.add(i16);

fr4.add(i1a);
fr4.add(i2a);
fr4.add(i3a);
//fr1.add(i4a);
fr4.add(i5a);
fr4.add(i6a);
fr4.add(i7a);
fr4.add(i8a);
fr4.add(i9a);
fr4.add(i10a);
fr4.add(i11a);
fr4.add(i12a);
fr4.add(i13a);
fr4.add(i14a);
fr4.add(i15a);
fr4.add(i16a);
JLabel change = new JLabel("VIEW THE CAR IMAGES");
add(change);
change.addMouseListener(new MouseListener()
{
public void mouseClicked(MouseEvent me)
{

JFrame jf= new JFrame();
jf.setLayout(null);
JLabel newimg = new JLabel("NEXT");
add(newimg);
newimg.addMouseListener(new MouseListener()
{
public void mouseClicked(MouseEvent m)
{
for(int i=0;i<4;i++)
{
 ii[i] = new ImageIcon("G:\\jetta\\jetta" + Integer.toString(i+1) + ".png");
}
imagelabel=new JLabel(ii[new Random().nextInt(4)]);
Random r = new Random();
int i = r.nextInt(4);
while(imagelabel.getIcon().toString() == ii[i].toString())
{
i = r.nextInt(4);
}
imagelabel.setIcon(ii[i]);
jf.add(imagelabel);
jf.setVisible(true);
jf.setSize(1000,1000);
}
public void mouseExited(MouseEvent m)
{}
public void mouseEntered(MouseEvent m)
{}
public void mouseReleased(MouseEvent m)
{}
public void mousePressed(MouseEvent m)
{}});
}
public void mouseExited(MouseEvent me)
{}
public void mouseEntered(MouseEvent me)
{}
public void mouseReleased(MouseEvent me)
{}
public void mousePressed(MouseEvent me)
{}
});

fr4.setVisible(true);
fr4.setSize(1000,1000);
}
}
}



if(s1=="BEETLE")
{
if(s2=="bm1")
{
if(s3=="PETROL")
{
fr1.setLayout(null);


JLabel i1a=new JLabel("BEETLE");
JLabel i2a=new JLabel("bm1");
JLabel i3a=new JLabel("PETROL");
//JLabel i4=new JLabel("CAR SPECIFICATIONS");
JLabel i5a=new JLabel("1550 CC");
JLabel i6a=new JLabel("11.5 kmpl");
JLabel i7a=new JLabel("280Nm");
JLabel i8a=new JLabel("MAX POWER");
JLabel i9a=new JLabel("MANUAL");
JLabel i10a=new JLabel("32.43Lac");
JLabel i11a=new JLabel("25.18Lac");
JLabel i12a=new JLabel("Rs.41,789");
JLabel i13a=new JLabel("4");
JLabel i14a=new JLabel("N");
JLabel i15a=new JLabel("ABS,Child Safety Locks,Reverse camera");
JLabel i16a=new JLabel("4");

fr1.add(i1);
fr1.add(i2);
fr1.add(i3);
fr1.add(i4);
fr1.add(i5);
fr1.add(i6);
fr1.add(i7);
fr1.add(i8);
fr1.add(i9);
fr1.add(i10);
fr1.add(i11);
fr1.add(i12);
fr1.add(i13);
fr1.add(i14);
fr1.add(i15);
fr1.add(i16);

fr1.add(i1a);
fr1.add(i2a);
fr1.add(i3a);
//fr1.add(i4a);
fr1.add(i5a);
fr1.add(i6a);
fr1.add(i7a);
fr1.add(i8a);
fr1.add(i9a);
fr1.add(i10a);
fr1.add(i11a);
fr1.add(i12a);
fr1.add(i13a);
fr1.add(i14a);
fr1.add(i15a);
fr1.add(i16a);

JLabel change = new JLabel("VIEW THE CAR IMAGES");
add(change);
change.addMouseListener(new MouseListener()
{
public void mouseClicked(MouseEvent me)
{

JFrame jf= new JFrame();
jf.setLayout(null);
JLabel newimg = new JLabel("NEXT");
jf.add(newimg);
newimg.addMouseListener(new MouseListener()
{
public void mouseClicked(MouseEvent m)
{
for(int i=0;i<4;i++)
{
 ii[i] = new ImageIcon("G:\\beetle\\beetle" + Integer.toString(i+1) + ".png");
}
imagelabel=new JLabel(ii[new Random().nextInt(4)]);
Random r = new Random();
int i = r.nextInt(4);
while(imagelabel.getIcon().toString() == ii[i].toString())
{
i = r.nextInt(4);
}
imagelabel.setIcon(ii[i]);
jf.add(imagelabel);
jf.setVisible(true);
jf.setSize(1000,1000);
}
public void mouseExited(MouseEvent m)
{}
public void mouseEntered(MouseEvent m)
{}
public void mouseReleased(MouseEvent m)
{}
public void mousePressed(MouseEvent m)
{}});
}
public void mouseExited(MouseEvent me)
{}
public void mouseEntered(MouseEvent me)
{}
public void mouseReleased(MouseEvent me)
{}
public void mousePressed(MouseEvent me)
{}
});
fr1.setVisible(true);
fr1.setSize(1000,1000);
}
}
}

if(s1=="BEETLE")
{
if(s2=="he1")
{
if(s3=="PETROL")
{
fr2.setLayout(null);

JLabel j1a=new JLabel("BEETLE");
JLabel j2a=new JLabel("he1");
JLabel j3a=new JLabel("PETROL");
//JLabel i4=new JLabel("CAR SPECIFICATIONS");
JLabel j5a=new JLabel("1500 CC");
JLabel j6a=new JLabel("12.5 kmpl");
JLabel j7a=new JLabel("252Nm");
JLabel j8a=new JLabel("MAX POWER");
JLabel j9a=new JLabel("AUTOMATIC");
JLabel j10a=new JLabel("33.43Lac");
JLabel j11a=new JLabel("36.18Lac");
JLabel j12a=new JLabel("Rs.49,789");
JLabel j13a=new JLabel("5");
JLabel j14a=new JLabel("N");
JLabel j15a=new JLabel("ABS,Child Safety Locks,Reverse Camera,Paeking sensors");
JLabel j16a=new JLabel("4");



fr2.add(i1);
fr2.add(i2);
fr2.add(i3);
fr2.add(i4);
fr2.add(i5);
fr2.add(i6);
fr2.add(i7);
fr2.add(i8);
fr2.add(i9);
fr2.add(i10);
fr2.add(i11);
fr2.add(i12);
fr2.add(i13);
fr2.add(i14);
fr2.add(i15);
fr2.add(i16);

fr2.add(j1a);
fr2.add(j2a);
fr2.add(j3a);
//fr1.add(i4a);
fr2.add(j5a);
fr2.add(j6a);
fr2.add(j7a);
fr2.add(j8a);
fr2.add(j9a);
fr2.add(j10a);
fr2.add(j11a);
fr2.add(j12a);
fr2.add(j13a);
fr2.add(j14a);
fr2.add(j15a);
fr2.add(j16a);
JLabel change = new JLabel("VIEW THE CAR IMAGES");
add(change);
change.addMouseListener(new MouseListener()
{
public void mouseClicked(MouseEvent me)
{

JFrame jf= new JFrame();
jf.setLayout(null);
JLabel newimg = new JLabel("NEXT");
jf.add(newimg);
newimg.addMouseListener(new MouseListener()
{
public void mouseClicked(MouseEvent m)
{
for(int i=0;i<4;i++)
{
 ii[i] = new ImageIcon("G:\\beetle\\beetle" + Integer.toString(i+1) + ".png");
}
imagelabel=new JLabel(ii[new Random().nextInt(4)]);
Random r = new Random();
int i = r.nextInt(4);
while(imagelabel.getIcon().toString() == ii[i].toString())
{
i = r.nextInt(4);
}
imagelabel.setIcon(ii[i]);
jf.add(imagelabel);
jf.setVisible(true);
jf.setSize(1000,1000);
}
public void mouseExited(MouseEvent m)
{}
public void mouseEntered(MouseEvent m)
{}
public void mouseReleased(MouseEvent m)
{}
public void mousePressed(MouseEvent m)
{}});
}
public void mouseExited(MouseEvent me)
{}
public void mouseEntered(MouseEvent me)
{}
public void mouseReleased(MouseEvent me)
{}
public void mousePressed(MouseEvent me)
{}
});
fr2.setVisible(true);
fr2.setSize(1000,1000);

}}}

if(s1=="BEETLE")
{
if(s2=="he1")
{
if(s3=="DIESEL")
{
fr3.setLayout(null);

JLabel j1a=new JLabel("BEETLE");
JLabel j2a=new JLabel("he1");
JLabel j3a=new JLabel("DIESEL");
//JLabel i4=new JLabel("CAR SPECIFICATIONS");
JLabel j5a=new JLabel("1500 CC");
JLabel j6a=new JLabel("14.5 kmpl");
JLabel j7a=new JLabel("252Nm");
JLabel j8a=new JLabel("MAX POWER");
JLabel j9a=new JLabel("AUTOMATIC");
JLabel j10a=new JLabel("34.43Lac");
JLabel j11a=new JLabel("37.18Lac");
JLabel j12a=new JLabel("Rs.51,789");
JLabel j13a=new JLabel("4");
JLabel j14a=new JLabel("N");
JLabel j15a=new JLabel("ABS,Child Safety Locks,Reverse Camera,Parking sensor");
JLabel j16a=new JLabel("4");



fr3.add(i1);
fr3.add(i2);
fr3.add(i3);
fr3.add(i4);
fr3.add(i5);
fr3.add(i6);
fr3.add(i7);
fr3.add(i8);
fr3.add(i9);
fr3.add(i10);
fr3.add(i11);
fr3.add(i12);
fr3.add(i13);
fr3.add(i14);
fr3.add(i15);
fr3.add(i16);

fr3.add(j1a);
fr3.add(j2a);
fr3.add(j3a);
//fr1.add(i4a);
fr3.add(j5a);
fr3.add(j6a);
fr3.add(j7a);
fr3.add(j8a);
fr3.add(j9a);
fr3.add(j10a);
fr3.add(j11a);
fr3.add(j12a);
fr3.add(j13a);
fr3.add(j14a);
fr3.add(j15a);
fr3.add(j16a);
JLabel change = new JLabel("VIEW THE CAR IMAGES");
add(change);
change.addMouseListener(new MouseListener()
{
public void mouseClicked(MouseEvent me)
{

JFrame jf= new JFrame();
jf.setLayout(null);
JLabel newimg = new JLabel("NEXT");
jf.add(newimg);
newimg.addMouseListener(new MouseListener()
{
public void mouseClicked(MouseEvent m)
{
for(int i=0;i<4;i++)
{
 ii[i] = new ImageIcon("G:\\beetle\\beetle" + Integer.toString(i+1) + ".png");
}
imagelabel=new JLabel(ii[new Random().nextInt(4)]);
Random r = new Random();
int i = r.nextInt(4);
while(imagelabel.getIcon().toString() == ii[i].toString())
{
i = r.nextInt(4);
}
imagelabel.setIcon(ii[i]);
jf.add(imagelabel);
jf.setVisible(true);
jf.setSize(1000,1000);
}
public void mouseExited(MouseEvent m)
{}
public void mouseEntered(MouseEvent m)
{}
public void mouseReleased(MouseEvent m)
{}
public void mousePressed(MouseEvent m)
{}});
}
public void mouseExited(MouseEvent me)
{}
public void mouseEntered(MouseEvent me)
{}
public void mouseReleased(MouseEvent me)
{}
public void mousePressed(MouseEvent me)
{}
});

fr3.setVisible(true);
fr3.setSize(1000,1000);

}}}

if(s1=="BEETLE")
{
if(s2=="bm1")
{
if(s3=="DIESEL")
{
fr4.setLayout(null);


JLabel i1a=new JLabel("BEETLE");
JLabel i2a=new JLabel("bm1");
JLabel i3a=new JLabel("DIESEL");
//JLabel i4=new JLabel("CAR SPECIFICATIONS");
JLabel i5a=new JLabel("1500 CC");
JLabel i6a=new JLabel("15.5 kmpl");
JLabel i7a=new JLabel("250Nm");
JLabel i8a=new JLabel("MAX POWER");
JLabel i9a=new JLabel("MANUAL");
JLabel i10a=new JLabel("35.43Lac");
JLabel i11a=new JLabel("38.18Lac");
JLabel i12a=new JLabel("Rs.55,789");
JLabel i13a=new JLabel("3");
JLabel i14a=new JLabel("N");
JLabel i15a=new JLabel("ABS,Child Safety Locks,Reverse Camera");
JLabel i16a=new JLabel("2");

fr4.add(i1);
fr4.add(i2);
fr4.add(i3);
fr4.add(i4);
fr4.add(i5);
fr4.add(i6);
fr4.add(i7);
fr4.add(i8);
fr4.add(i9);
fr4.add(i10);
fr4.add(i11);
fr4.add(i12);
fr4.add(i13);
fr4.add(i14);
fr4.add(i15);
fr4.add(i16);

fr4.add(i1a);
fr4.add(i2a);
fr4.add(i3a);
//fr1.add(i4a);
fr4.add(i5a);
fr4.add(i6a);
fr4.add(i7a);
fr4.add(i8a);
fr4.add(i9a);
fr4.add(i10a);
fr4.add(i11a);
fr4.add(i12a);
fr4.add(i13a);
fr4.add(i14a);
fr4.add(i15a);
fr4.add(i16a);

JLabel change = new JLabel("VIEW THE CAR IMAGES");
add(change);
change.addMouseListener(new MouseListener()
{
public void mouseClicked(MouseEvent me)
{
JFrame jf= new JFrame();
jf.setLayout(null);
JLabel newimg = new JLabel("NEXT");
jf.add(newimg);
newimg.addMouseListener(new MouseListener()
{
public void mouseClicked(MouseEvent m)
{
for(int i=0;i<4;i++)
{
 ii[i] = new ImageIcon("G:\\beetle\\beetle" + Integer.toString(i+1) + ".png");
}
imagelabel=new JLabel(ii[new Random().nextInt(4)]);
Random r = new Random();
int i = r.nextInt(4);
while(imagelabel.getIcon().toString() == ii[i].toString())
{
i = r.nextInt(4);
}
imagelabel.setIcon(ii[i]);
jf.add(imagelabel);
jf.setVisible(true);
jf.setSize(1000,1000);
}
public void mouseExited(MouseEvent m)
{}
public void mouseEntered(MouseEvent m)
{}
public void mouseReleased(MouseEvent m)
{}
public void mousePressed(MouseEvent m)
{}});
}
public void mouseExited(MouseEvent me)
{}
public void mouseEntered(MouseEvent me)
{}
public void mouseReleased(MouseEvent me)
{}
public void mousePressed(MouseEvent me)
{}
});

fr4.setVisible(true);
fr4.setSize(1000,1000);
}
}
}

}}}
/*
public void itemStateChanged(ItemEvent ie)
{
repaint();
}
*/
public static void main(String args[])
{
  carinfo ci=new carinfo();
ci.carinfo();
  ci.setSize(new Dimension(1000,1000));
  ci.setTitle("Volkswagen Car Info Centre");
  ci.setVisible(true);
}
}


