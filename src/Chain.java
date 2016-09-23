import java.awt.*; 
import java.awt.event.*;  
import javax.swing.*; 
import java.awt.BorderLayout; 
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.border.EmptyBorder;
import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.awt.Dimension;

class Chain extends JFrame implements ActionListener{

JFrame f;
JPanel p,p1,p2,p3,p31,p32,p33,p34,p4,p5;
JLabel lb[]=new JLabel[210];
JLabel l1,l11,l2,l21,l22,l23,l24,l25,l26,l3,l31,l32,l33,l34,l35,l36,l37,l4,l41,l42,l43,l44,l45,l46,l5;
JButton bb[]=new JButton[210];
JButton b1,b2,b3,b4,b5;
Icon i21,i22,i23,i24,i41,i42,i43,i44;
int v[]=new int[210];
int cl[]=new int[210];
int value, player=1;
String color="R";
int clr=333;
int nochange=0;
Icon img0=new ImageIcon("0.png");
Icon img11=new ImageIcon("11.gif");
Icon img12=new ImageIcon("12.gif");
Icon img13=new ImageIcon("13.gif");
Icon img14=new ImageIcon("14.jpg");
Icon img21=new ImageIcon("21.gif");
Icon img22=new ImageIcon("22.gif");
Icon img23=new ImageIcon("23.gif");
Icon img24=new ImageIcon("24.jpg");

Chain()
{
	f=new JFrame("Chain Reaction");
	p= new JPanel();
	p1= new JPanel();
	p2= new JPanel();
	
	p3= new JPanel();
	p31= new JPanel();
	p32= new JPanel();
	p33= new JPanel();
	p4= new JPanel();
	
	//initial color set 333
	for(int i=1;i<=200;i++)
	{
		cl[i]=333;
	}
	
	//panel p
	
	for(int i=1;i<=200;i++)
	{
	//lb[i]=new JLabel();
	String s1="0";

	bb[i]=new JButton(img0);
	
	
	//lb[i].setText(s);
	bb[i].addActionListener(this);
	//lb[i].addActionListener(this);
	//bb[i].setBounds(0,0,50,50);
	bb[i].setBackground(new Color (255,255,255));
	p.add(bb[i]);
	//p.add(lb[i]);
	
	}
	 
	p.setLayout(new GridLayout(10,20));
	p.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	
	//panel p1
	l11=new JLabel();
	//l11.setText("<html><p style='color:red; font-family: Agency FB; font-size:25px; padding:2px;'>Chain Reaction</p><html>");
	ImageIcon i12=(new ImageIcon("01.png"));
	l11.setIcon(i12);
	p1.add(l11);
	//p1.setBackground(new Color (135,206,235));
	
	
	//panel p2
	l21=new JLabel();
	l22=new JLabel();
	l23=new JLabel();
	l24=new JLabel();
	l25=new JLabel();
	l26=new JLabel();
	
	/*i21=new ImageIcon(((new ImageIcon("p1.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
	i22=new ImageIcon(((new ImageIcon("p2.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
	i23=new ImageIcon(((new ImageIcon("p1.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
	i24=new ImageIcon(((new ImageIcon("p2.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));*/
	
	l21.setIcon(img11);
	l22.setIcon(img12);
	l23.setIcon(img13);
	l24.setIcon(img21);
	l25.setIcon(img22);
	l26.setIcon(img23);
	
	//i21.addActionListener(this);
	
	p2.add(l21);
	p2.add(l22);
	p2.add(l23);
	p2.add(l26);
	p2.add(l25);
	p2.add(l24);
	
	p2.setBorder(new EmptyBorder(50, 10, 50, 10));
	p2.setLayout(new GridLayout(6,1));
	
	//panel p3
	
	l3=new JLabel();
	l31=new JLabel();
	l32=new JLabel();
	l33=new JLabel();
	l34=new JLabel();
	l35=new JLabel();
	l36=new JLabel();
	l37=new JLabel();
	
	
	l3.setText("<html><p style='Background-color:red; color:#ffff; font-family: Agency FB; font-size:10px; width:1366; padding:5px; text-align:center;'>&copy All Rights Reserverd by Kapil Saini</p><html>");
	l3.setBackground(new Color (135,206,235));
	
	ImageIcon i36=new ImageIcon(((new ImageIcon("footer.png")).getImage()).getScaledInstance(1200, 80, java.awt.Image.SCALE_SMOOTH));
	l31.setIcon(i36);
	/*l32.setText("Player 1 Status= "+"01");
	l33.setText("Player 2 Status= "+"02");
	l34.setText("Player 3 Status= "+"03");
	l35.setText("Player 4 Status= "+"04");
	
	l31.setBackground(new Color (135,206,235));*/
	
	//p32.add(l32);
	//p32.add(l33);
	//p32.add(l34);
	//p32.add(l35);
	p32.setLayout(new GridLayout(2,2));
	
	b3=new JButton("Restart Game");
	//b3.setBorder(new EmptyBorder(5, 100, 5, 100));
	
	l36.setText("Game Status: ");
	l37.setText("Going On");
	
	//p31.add(l36);
	//p31.add(l37);
	
	//p33.add(p31);
	p33.add(p32);
	p33.add(b3);
	p33.setLayout(new GridLayout(1,3));
	p33.setBorder(new EmptyBorder(5, 50, 5, 50));
	
	//p3.add(l31);
	//p3.add(p33);
	p3.add(l31);
	
	//panel p4
	l41=new JLabel();
	l42=new JLabel();
	l43=new JLabel();
	l44=new JLabel();
	l45=new JLabel();
	l46=new JLabel();
	
	i41=new ImageIcon(((new ImageIcon("p1.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
	i42=new ImageIcon(((new ImageIcon("p2.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
	i43=new ImageIcon(((new ImageIcon("p1.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
	i44=new ImageIcon(((new ImageIcon("p2.png")).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
	
	l41.setIcon(img11);
	l42.setIcon(img12);
	l43.setIcon(img13);
	l44.setIcon(img21);
	l45.setIcon(img22);
	l46.setIcon(img23);
	
	p4.add(l41);
	p4.add(l42);
	p4.add(l43);
	p4.add(l46);
	p4.add(l45);
	p4.add(l44);
	
	p4.setBorder(new EmptyBorder(50, 10, 50, 10));
	p4.setLayout(new GridLayout(6,1));
	
	//frame
	f.add(p,BorderLayout.CENTER); 
	f.add(p1,BorderLayout.NORTH); 
	f.add(p2,BorderLayout.EAST); 
	f.add(p3,BorderLayout.SOUTH); 
	f.add(p4,BorderLayout.WEST); 

	f.pack();
	f.setVisible(true);
	f.setSize(1366,730);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setExtendedState(6);
	f.setVisible(true);
	f.setIconImage(new ImageIcon("23.gif").getImage());
}

public void actionPerformed(ActionEvent e){
	
	//reset button****
	if(e.getSource()==b3)
	{
		for(int i=1;i<=200;i++){
			v[i]=0;
			cl[i]=333;
			player=1;
			bb[i].setText("0");
		}
	}
System.out.println("Player= "+player);

//player 1 select **********	
if(player==1)
{
	color="R";
	
	for(int i=1;i<=200;i++){
	if(e.getSource()==bb[i]&&(cl[i]==111||cl[i]==333)){
		value=i;
		System.out.println("button select= "+i);
		v[i]++;
		cl[i]=111;
		//String s2=""+v[i];
		//bb[i]=new JButton(set.Text(s2));
		System.out.println("button "+i+" Value= "+v[i]);
		//bb[i].setText(""+v[i]+" "+cl[i]);
		setimg(i,player,v[i]);
		
	}
	
	}
	
	//corner point
	if(value==1||value==20||value==181||value==200)
	{
		System.out.println("Corner Selected");
		if(v[value]==2)
			{
				System.out.println("corner blast");
				
				v[value]=0;
				cl[value]=333;
				System.out.println("button "+value+" Value= "+v[value]);
				//bb[value].setText(""+v[value]);
				bb[value].setIcon(img0);
				if(value==1)
				{
					v[value+1]++;
					v[value+20]++;
					change(value+1, value+20,0,0,player);
				}
				if(value==20)
				{
					v[value-1]++;
					v[value+20]++;
					change(value-1, value+20,0,0,player);
				}
				if(value==181)
				{
					v[value+1]++;
					v[value-20]++;
					change(value+1, value-20,0,0,player);
				}
				if(value==200)
				{
					v[value-1]++;
					v[value-20]++;
					change(value-1, value-20,0,0,player);
				}
			}
	}
	
	//left side points
		else if(value==21||value==41||value==61||value==91||value==101||value==121||value==141||value==161)
		{
			System.out.println("left side Selected");
			if(v[value]==3)
			{
				System.out.println("left side blast");
					v[value]=0;
					cl[value]=333;
					System.out.println("button "+value+" Value= "+v[value]);
					//bb[value].setText(""+v[value]);
					bb[value].setIcon(img0);
					v[value+1]++;
					v[value-20]++;
					v[value+20]++;
					change(value-20,value+1,value+20,0,player);
		}
		}
		
		//top side points
		else if(value==2||value==3||value==4||value==5||value==6||value==7||value==8||value==9||value==10||value==11||value==12||value==13||value==14||value==15||value==16||value==17||value==18||value==19)
		{
			System.out.println("up side Selected");
			if(v[value]==3)
			{
				System.out.println("up side blast");
					v[value]=0;
					cl[value]=333;
					System.out.println("button "+value+" Value= "+v[value]);
					//bb[value].setText(""+v[value]);
					bb[value].setIcon(img0);
					v[value+1]++;
					v[value-1]++;
					v[value+20]++;
					change(value+1,value-1,value+20,0,player);
		}
		}
		
		
		//right side points
		else if(value==40||value==60||value==80||value==100||value==120||value==140||value==160||value==180)
		{
			System.out.println("right side Selected");
			if(v[value]==3)
			{
				System.out.println("right side blast");
					v[value]=0;
					cl[value]=333;
					System.out.println("button "+value+" Value= "+v[value]);
					//bb[value].setText(""+v[value]);
					bb[value].setIcon(img0);
					v[value-1]++;
					v[value-20]++;
					v[value+20]++;
					change(value-1,value-20,value+20,0,player);
		}
		}
		
		//bottom side points
		else if(value==182||value==183||value==184||value==185||value==186||value==187||value==188||value==189||value==190||value==191||value==192||value==193||value==194||value==195||value==196||value==197||value==198||value==199)
		{
			System.out.println("down side Selected");
			if(v[value]==3)
			{
				System.out.println("down side blast");
					v[value]=0;
					cl[value]=333;
					System.out.println("button "+value+" Value= "+v[value]);
					//bb[value].setText(""+v[value]);
					bb[value].setIcon(img0);
					v[value-1]++;
					v[value+1]++;
					v[value-20]++;
					change(value-1,value+1,value-20,0,player);
		}
		}
		else
		{
			System.out.println("mid 0 Selected");
			if(v[value]>=4)
			{
				System.out.println("mid blast");
				v[value]=0;
				cl[value]=333;
				System.out.println("button "+value+" Value= "+v[value]);
				//bb[value].setText(""+v[value]);
					bb[value].setIcon(img0);
					v[value-1]++;
					v[value+1]++;
					v[value-20]++;
					v[value+20]++;
					change(value-1,value+1,value-20,value+20,player);
			}
		}
		
		player=2;
		
	}
	
	//player 2 ***************
	else{
		
		color="G";
	
	for(int i=1;i<=200;i++){
	if(e.getSource()==bb[i]&&(cl[i]==222||cl[i]==333)){
		value=i;
		System.out.println("button select= "+i);
		v[i]++;
		cl[i]=222;
		//String s2=""+v[i];
		//bb[i]=new JButton(set.Text(s2));
		System.out.println("button "+i+" Value= "+v[i]);
		//bb[i].setText(""+v[i]+" "+cl[i]);
		setimg(i,player,v[i]);
	}
	//corner point
	
	}
	if(value==1||value==20||value==181||value==200)
	{
		System.out.println("Corner Selected");
		if(v[value]==2)
			{
				System.out.println("corner blast");
				
				v[value]=0;
				cl[value]=333;
				System.out.println("button "+value+" Value= "+v[value]);
				//bb[value].setText(""+v[value]);
				bb[value].setIcon(img0);
				if(value==1)
				{
					v[value+1]++;
					v[value+20]++;
					change(value+1, value+20,0,0,player);
				}
				if(value==20)
				{
					v[value-1]++;
					v[value+20]++;
					change(value-1, value+20,0,0,player);
				}
				if(value==181)
				{
					v[value+1]++;
					v[value-20]++;
					change(value+1, value-20,0,0,player);
				}
				if(value==200)
				{
					v[value-1]++;
					v[value-20]++;
					change(value-1, value-20,0,0,player);
				}
			}
	}
	
	//left side points
		else if(value==21||value==41||value==61||value==91||value==101||value==121||value==141||value==161)
		{
			System.out.println("left side Selected");
			if(v[value]==3)
			{
				System.out.println("left side blast");
					v[value]=0;
					cl[value]=333;
					System.out.println("button "+value+" Value= "+v[value]);
					//bb[value].setText(""+v[value]);
					bb[value].setIcon(img0);
					v[value+1]++;
					v[value-20]++;
					v[value+20]++;
					change(value-20,value+1,value+20,0,player);
		}
		}
		
		//top side points
		else if(value==2||value==3||value==4||value==5||value==6||value==7||value==8||value==9||value==10||value==11||value==12||value==13||value==14||value==15||value==16||value==17||value==18||value==19)
		{
			System.out.println("up side Selected");
			if(v[value]==3)
			{
				System.out.println("up side blast");
					v[value]=0;
					cl[value]=333;
					System.out.println("button "+value+" Value= "+v[value]);
					//bb[value].setText(""+v[value]);
					bb[value].setIcon(img0);
					v[value+1]++;
					v[value-1]++;
					v[value+20]++;
					change(value+1,value-1,value+20,0,player);
		}
		}
		
		
		//right side points
		else if(value==40||value==60||value==80||value==100||value==120||value==140||value==160||value==180)
		{
			System.out.println("right side Selected");
			if(v[value]==3)
			{
				System.out.println("right side blast");
					v[value]=0;
					cl[value]=333;
					System.out.println("button "+value+" Value= "+v[value]);
					//bb[value].setText(""+v[value]);
					bb[value].setIcon(img0);
					v[value-1]++;
					v[value-20]++;
					v[value+20]++;
					change(value-1,value-20,value+20,0,player);
		}
		}
		
		//bottom side points
		else if(value==182||value==183||value==184||value==185||value==186||value==187||value==188||value==189||value==190||value==191||value==192||value==193||value==194||value==195||value==196||value==197||value==198||value==199)
		{
			System.out.println("down side Selected");
			if(v[value]==3)
			{
				System.out.println("down side blast");
					v[value]=0;
					cl[value]=333;
					System.out.println("button "+value+" Value= "+v[value]);
					//bb[value].setText(""+v[value]);
					bb[value].setIcon(img0);
					v[value-1]++;
					v[value+1]++;
					v[value-20]++;
					change(value-1,value+1,value-20,0,player);
		}
		}
		else
		{
			System.out.println("mid 0 Selected");
			if(v[value]>=4)
			{
				System.out.println("mid blast");
				v[value]=0;
				cl[value]=333;
				System.out.println("button "+value+" Value= "+v[value]);
				//bb[value].setText(""+v[value]);
				bb[value].setIcon(img0);
					v[value-1]++;
					v[value+1]++;
					v[value-20]++;
					v[value+20]++;
					change(value-1,value+1,value-20,value+20,player);
			}
		}
		player=1;
	}	
	
}

void change(int a,int b, int c, int d, int player){
	if(player==1)
	{
		cl[a]=111;
		cl[b]=111;
		cl[c]=111;
		cl[d]=111;
	}
	else{
		cl[a]=222;
		cl[b]=222;
		cl[c]=222;
		cl[d]=222;
	}
	
	if(a!=0)
	{
	System.out.println("button "+a+" Value= "+v[a]);
	//bb[a].setText(""+v[a]+" "+cl[a]);
	setimg(a,player,v[a]);
	}
	if(b!=0)
	{
	System.out.println("button "+b+" Value= "+v[b]);
	//bb[b].setText(""+v[b]+" "+cl[b]);
	setimg(b,player,v[b]);
	}
	if(c!=0)
	{
	System.out.println("button "+c+" Value= "+v[c]);
	//bb[c].setText(""+v[c]+" "+cl[c]);
	setimg(c,player,v[c]);
	}
	if(d!=0)
	{
	System.out.println("button "+d+" Value= "+v[d]);
	setimg(d,player,v[d]);
	//bb[d].setText(""+v[d]+" "+cl[d]);
	}
	
	
	
	//again check (a)
	System.out.println("a= "+a);
	value=a;
	if(value==1||value==20||value==181||value==200)
	{
		System.out.println("Corner Selected");
		if(v[value]==2)
			{
				System.out.println("corner blast");
				
				v[value]=0;
				cl[value]=333;
				bb[value].setIcon(img0);
				System.out.println("button "+value+" Value= "+v[value]);
				if(value==1)
				{
					v[value+1]++;
					v[value+20]++;
					change(value+1, value+20,0,0,player);
				}
				if(value==20)
				{
					v[value-1]++;
					v[value+20]++;
					change(value-1, value+20,0,0,player);
				}
				if(value==181)
				{
					v[value+1]++;
					v[value-20]++;
					change(value+1, value-20,0,0,player);
				}
				if(value==200)
				{
					v[value-1]++;
					v[value-20]++;
					change(value-1, value-20,0,0,player);
				}
			}
	}
	
	//left side points
		else if(value==21||value==41||value==61||value==91||value==101||value==121||value==141||value==161)
		{
			System.out.println("left side Selected");
			if(v[value]==3)
			{
				System.out.println("left side blast");
					v[value]=0;
					cl[value]=333;
					bb[value].setIcon(img0);
					System.out.println("button "+value+" Value= "+v[value]);
					v[value+1]++;
					v[value-20]++;
					v[value+20]++;
					change(value-20,value+1,value+20,0,player);
		}
		}
		
		//top side points
		else if(value==2||value==3||value==4||value==5||value==6||value==7||value==8||value==9||value==10||value==11||value==12||value==13||value==14||value==15||value==16||value==17||value==18||value==19)
		{
			System.out.println("up side Selected");
			if(v[value]==3)
			{
				System.out.println("up side blast");
					v[value]=0;
					cl[value]=333;
					bb[value].setIcon(img0);
					System.out.println("button "+value+" Value= "+v[value]);
					v[value+1]++;
					v[value-1]++;
					v[value+20]++;
					change(value+1,value-1,value+20,0,player);
		}
		}
		
		
		//right side points
		else if(value==40||value==60||value==80||value==100||value==120||value==140||value==160||value==180)
		{
			System.out.println("right side Selected");
			if(v[value]==3)
			{
				System.out.println("right side blast");
					v[value]=0;
					cl[value]=333;
					bb[value].setIcon(img0);
					System.out.println("button "+value+" Value= "+v[value]);
					v[value-1]++;
					v[value-20]++;
					v[value+20]++;
					change(value-1,value-20,value+20,0,player);
		}
		}
		
		//bottom side points
		else if(value==182||value==183||value==184||value==185||value==186||value==187||value==188||value==189||value==190||value==191||value==192||value==193||value==194||value==195||value==196||value==197||value==198||value==199)
		{
			System.out.println("down side Selected");
			if(v[value]==3)
			{
				System.out.println("down side blast");
					v[value]=0;
					cl[value]=333;
					bb[value].setIcon(img0);
					System.out.println("button "+value+" Value= "+v[value]);
					v[value-1]++;
					v[value+1]++;
					v[value-20]++;
					change(value-1,value+1,value-20,0,player);
		}
		}
		else
		{
			if(a!=0)
			{
			System.out.println("mid 0 Selected");
			if(v[value]>=4)
			{
				System.out.println("mid blast");
				v[value]=0;
				cl[value]=333;
				bb[value].setIcon(img0);
				System.out.println("button "+value+" Value= "+v[value]);
					v[value-1]++;
					v[value+1]++;
					v[value-20]++;
					v[value+20]++;
					change(value-1,value+1,value-20,value+20,player);
			}
			}
		}
		
		//again check (b)
	System.out.println("b= "+b);
	value=b;
	if(value==1||value==20||value==181||value==200)
	{
		System.out.println("Corner Selected");
		if(v[value]==2)
			{
				System.out.println("corner blast");
				
				v[value]=0;
				cl[value]=333;
				bb[value].setIcon(img0);
				System.out.println("button "+value+" Value= "+v[value]);
				if(value==1)
				{
					v[value+1]++;
					v[value+20]++;
					change(value+1, value+20,0,0,player);
				}
				if(value==20)
				{
					v[value-1]++;
					v[value+20]++;
					change(value-1, value+20,0,0,player);
				}
				if(value==181)
				{
					v[value+1]++;
					v[value-20]++;
					change(value+1, value-20,0,0,player);
				}
				if(value==200)
				{
					v[value-1]++;
					v[value-20]++;
					change(value-1, value-20,0,0,player);
				}
			}
	}
	
	//left side points
		else if(value==21||value==41||value==61||value==91||value==101||value==121||value==141||value==161)
		{
			System.out.println("left side Selected");
			if(v[value]==3)
			{
				System.out.println("left side blast");
					v[value]=0;
					cl[value]=333;
					bb[value].setIcon(img0);
					System.out.println("button "+value+" Value= "+v[value]);
					v[value+1]++;
					v[value-20]++;
					v[value+20]++;
					change(value-20,value+1,value+20,0,player);
		}
		}
		
		//top side points
		else if(value==2||value==3||value==4||value==5||value==6||value==7||value==8||value==9||value==10||value==11||value==12||value==13||value==14||value==15||value==16||value==17||value==18||value==19)
		{
			System.out.println("up side Selected");
			if(v[value]==3)
			{
				System.out.println("up side blast");
					v[value]=0;
					cl[value]=333;
					bb[value].setIcon(img0);
					System.out.println("button "+value+" Value= "+v[value]);
					v[value+1]++;
					v[value-1]++;
					v[value+20]++;
					change(value+1,value-1,value+20,0,player);
		}
		}
		
		
		//right side points
		else if(value==40||value==60||value==80||value==100||value==120||value==140||value==160||value==180)
		{
			System.out.println("right side Selected");
			if(v[value]==3)
			{
				System.out.println("right side blast");
					v[value]=0;
					cl[value]=333;
					bb[value].setIcon(img0);
					System.out.println("button "+value+" Value= "+v[value]);
					v[value-1]++;
					v[value-20]++;
					v[value+20]++;
					change(value-1,value-20,value+20,0,player);
		}
		}
		
		//bottom side points
		else if(value==182||value==183||value==184||value==185||value==186||value==187||value==188||value==189||value==190||value==191||value==192||value==193||value==194||value==195||value==196||value==197||value==198||value==199)
		{
			System.out.println("down side Selected");
			if(v[value]==3)
			{
				System.out.println("down side blast");
					v[value]=0;
					cl[value]=333;
					bb[value].setIcon(img0);
					System.out.println("button "+value+" Value= "+v[value]);
					v[value-1]++;
					v[value+1]++;
					v[value-20]++;
					change(value-1,value+1,value-20,0,player);
		}
		}
		else
		{
			if(b!=0)
			{
			System.out.println("mid 0 Selected");
			if(v[value]>=4)
			{
				System.out.println("mid blast");
				v[value]=0;
				cl[value]=333;
				bb[value].setIcon(img0);
				System.out.println("button "+value+" Value= "+v[value]);
					v[value-1]++;
					v[value+1]++;
					v[value-20]++;
					v[value+20]++;
					change(value-1,value+1,value-20,value+20,player);
			}
			}
		}
		
		//again check (c)
	System.out.println("c= "+c);
	value=c;
	if(value==1||value==20||value==181||value==200)
	{
		System.out.println("Corner Selected");
		if(v[value]==2)
			{
				System.out.println("corner blast");
				
				v[value]=0;
				cl[value]=333;
				bb[value].setIcon(img0);
				System.out.println("button "+value+" Value= "+v[value]);
				if(value==1)
				{
					v[value+1]++;
					v[value+20]++;
					change(value+1, value+20,0,0,player);
				}
				if(value==20)
				{
					v[value-1]++;
					v[value+20]++;
					change(value-1, value+20,0,0,player);
				}
				if(value==181)
				{
					v[value+1]++;
					v[value-20]++;
					change(value+1, value-20,0,0,player);
				}
				if(value==200)
				{
					v[value-1]++;
					v[value-20]++;
					change(value-1, value-20,0,0,player);
				}
			}
	}
	
	//left side points
		else if(value==21||value==41||value==61||value==91||value==101||value==121||value==141||value==161)
		{
			System.out.println("left side Selected");
			if(v[value]==3)
			{
				System.out.println("left side blast");
					v[value]=0;
					cl[value]=333;
					bb[value].setIcon(img0);
					System.out.println("button "+value+" Value= "+v[value]);
					v[value+1]++;
					v[value-20]++;
					v[value+20]++;
					change(value-20,value+1,value+20,0,player);
		}
		}
		
		//top side points
		else if(value==2||value==3||value==4||value==5||value==6||value==7||value==8||value==9||value==10||value==11||value==12||value==13||value==14||value==15||value==16||value==17||value==18||value==19)
		{
			System.out.println("up side Selected");
			if(v[value]==3)
			{
				System.out.println("up side blast");
					v[value]=0;
					cl[value]=333;
					bb[value].setIcon(img0);
					System.out.println("button "+value+" Value= "+v[value]);
					v[value+1]++;
					v[value-1]++;
					v[value+20]++;
					change(value+1,value-1,value+20,0,player);
		}
		}
		
		
		//right side points
		else if(value==40||value==60||value==80||value==100||value==120||value==140||value==160||value==180)
		{
			System.out.println("right side Selected");
			if(v[value]==3)
			{
				System.out.println("right side blast");
					v[value]=0;
					cl[value]=333;
					bb[value].setIcon(img0);
					System.out.println("button "+value+" Value= "+v[value]);
					v[value-1]++;
					v[value-20]++;
					v[value+20]++;
					change(value-1,value-20,value+20,0,player);
		}
		}
		
		//bottom side points
		else if(value==182||value==183||value==184||value==185||value==186||value==187||value==188||value==189||value==190||value==191||value==192||value==193||value==194||value==195||value==196||value==197||value==198||value==199)
		{
			System.out.println("down side Selected");
			if(v[value]==3)
			{
				System.out.println("down side blast");
					v[value]=0;
					cl[value]=333;
					bb[value].setIcon(img0);
					System.out.println("button "+value+" Value= "+v[value]);
					v[value-1]++;
					v[value+1]++;
					v[value-20]++;
					change(value-1,value+1,value-20,0,player);
		}
		}
		else
		{
			if(c!=0)
			{
			System.out.println("mid 0 Selected");
			if(v[value]>=4)
			{
				System.out.println("mid blast");
				v[value]=0;
				cl[value]=333;
				bb[value].setIcon(img0);
				System.out.println("button "+value+" Value= "+v[value]);
					v[value-1]++;
					v[value+1]++;
					v[value-20]++;
					v[value+20]++;
					change(value-1,value+1,value-20,value+20,player);
			}
			}
		}
		
		//again check (d)
	System.out.println("d= "+d);
	value=d;
	if(value==1||value==20||value==181||value==200)
	{
		System.out.println("Corner Selected");
		if(v[value]==2)
			{
				System.out.println("corner blast");
				
				v[value]=0;
				cl[value]=333;
				bb[value].setIcon(img0);
				System.out.println("button "+value+" Value= "+v[value]);
				if(value==1)
				{
					v[value+1]++;
					v[value+20]++;
					change(value+1, value+20,0,0,player);
				}
				if(value==20)
				{
					v[value-1]++;
					v[value+20]++;
					change(value-1, value+20,0,0,player);
				}
				if(value==181)
				{
					v[value+1]++;
					v[value-20]++;
					change(value+1, value-20,0,0,player);
				}
				if(value==200)
				{
					v[value-1]++;
					v[value-20]++;
					change(value-1, value-20,0,0,player);
				}
			}
	}
	
	//left side points
		else if(value==21||value==41||value==61||value==91||value==101||value==121||value==141||value==161)
		{
			System.out.println("left side Selected");
			if(v[value]==3)
			{
				System.out.println("left side blast");
					v[value]=0;
					cl[value]=333;
					bb[value].setIcon(img0);
					System.out.println("button "+value+" Value= "+v[value]);
					v[value+1]++;
					v[value-20]++;
					v[value+20]++;
					change(value-20,value+1,value+20,0,player);
		}
		}
		
		//top side points
		else if(value==2||value==3||value==4||value==5||value==6||value==7||value==8||value==9||value==10||value==11||value==12||value==13||value==14||value==15||value==16||value==17||value==18||value==19)
		{
			System.out.println("up side Selected");
			if(v[value]==3)
			{
				System.out.println("up side blast");
					v[value]=0;
					cl[value]=333;
					bb[value].setIcon(img0);
					System.out.println("button "+value+" Value= "+v[value]);
					v[value+1]++;
					v[value-1]++;
					v[value+20]++;
					change(value+1,value-1,value+20,0,player);
		}
		}
		
		
		//right side points
		else if(value==40||value==60||value==80||value==100||value==120||value==140||value==160||value==180)
		{
			System.out.println("right side Selected");
			if(v[value]==3)
			{
				System.out.println("right side blast");
					v[value]=0;
					cl[value]=333;
					bb[value].setIcon(img0);
					System.out.println("button "+value+" Value= "+v[value]);
					v[value-1]++;
					v[value-20]++;
					v[value+20]++;
					change(value-1,value-20,value+20,0,player);
		}
		}
		
		//bottom side points
		else if(value==182||value==183||value==184||value==185||value==186||value==187||value==188||value==189||value==190||value==191||value==192||value==193||value==194||value==195||value==196||value==197||value==198||value==199)
		{
			System.out.println("down side Selected");
			if(v[value]==3)
			{
				System.out.println("down side blast");
					v[value]=0;
					cl[value]=333;
					bb[value].setIcon(img0);
					System.out.println("button "+value+" Value= "+v[value]);
					v[value-1]++;
					v[value+1]++;
					v[value-20]++;
					change(value-1,value+1,value-20,0,player);
		}
		}
		else
		{
			if(d!=0)
			{
			System.out.println("mid 0 Selected");
			if(v[value]>=4)
			{
				System.out.println("mid blast");
				v[value]=0;
				cl[value]=333;
				bb[value].setIcon(img0);
				System.out.println("button "+value+" Value= "+v[value]);
					v[value-1]++;
					v[value+1]++;
					v[value-20]++;
					v[value+20]++;
					change(value-1,value+1,value-20,value+20,player);
			}
			}
		}
		
		if(player==1)
		{
			player=2;
		}
		else{
			player=1;
		}
}

void setimg(int pos, int player, int value){
	if(player==1)
	{
		if(value==1)
		{
			bb[pos].setIcon(img11);
		}
		if(value==2)
		{
			bb[pos].setIcon(img12);
		}
		if(value==3)
		{
			bb[pos].setIcon(img13);
		}
		if(value>=4)
		{
			bb[pos].setIcon(img14);
		}
	}
	if(player==2)
	{
		if(value==1)
		{
			bb[pos].setIcon(img21);
		}
		if(value==2)
		{
			bb[pos].setIcon(img22);
		}
		if(value==3)
		{
			bb[pos].setIcon(img23);
		}
		if(value>=4)
		{
			bb[pos].setIcon(img24);
		}
	}
}

public static void main(String s[])
{
	new Chain();
}

}