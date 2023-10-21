import java.awt.*; 
class Drawings extends Canvas 
{ 
 	public void paint(Graphics g) 
 	{ 
		g.fillRoundRect(50,50,50,50,20,10);
 		g.fillArc(0,0,100,50,90,45);//l,t,w,h -> start-degree
 	} 
 	public static void main(String[] args) 
 	{ 
 		Drawings m=new Drawings(); 
 		Frame f=new Frame("Shapes"); 
 		f.add(m); 
 		f.setSize(300,450); 
 		f.setVisible(true); 
 	} 
}
