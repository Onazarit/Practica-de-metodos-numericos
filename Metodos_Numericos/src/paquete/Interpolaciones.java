package paquete;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Interpolaciones {
	
	public static void menu() { // Funcion del menu principal
		JFrame Menu = new JFrame("Menu Principal");
		
		JLabel l1, l2;
		l1 = new JLabel("Oscar Alberto Nazari Campos");
		l1.setBounds(45,10,300,30);
		l2 = new JLabel("Escoje una opción: ");
		l2.setBounds(75,50,300,30);
		
		JButton b1, b2, b3;
		b1 = new JButton("Interpolación lineal");
		b1.setBounds(40,100,200,30);
		b2 = new JButton("Lineal de LaGrange ");
		b2.setBounds(40,150,200,30);
		b3 = new JButton("Cuadrática de LagGrange");
		b3.setBounds(40,200,200,30);
		
		Menu.add(l1);Menu.add(l2);
		Menu.add(b1);Menu.add(b2);Menu.add(b3);
		Menu.setSize(300,300);
		Menu.setLayout(null);
		Menu.setVisible(true);
		
		 b1.addActionListener(new ActionListener(){  
			    public void actionPerformed(ActionEvent e){  
			    	Menu.dispose();
			    	interpolacionLineal();
			    }  
			    });
		 b2.addActionListener(new ActionListener(){  
			    public void actionPerformed(ActionEvent e){  
			    	Menu.dispose();   
			    }  
			    });  
		 b3.addActionListener(new ActionListener(){  
			    public void actionPerformed(ActionEvent e){  
			    	Menu.dispose();   
			    }  
			    });  
	}
	
	public static void interpolacionLineal() { // Funcion para Interpolacion Lineal
		JFrame menuIL= new JFrame("Interpolacion Lineal");
		
		JLabel l1, l2, l3 ,l4 ,l5, l6, l7;
		l1 = new JLabel("X = ");
		l1.setBounds(200,75,200,30);
		l2 = new JLabel("F(X) = ");
		l2.setBounds(190,115,200,30);
		l3 = new JLabel("X0 = ");
		l3.setBounds(25,200,100,20); // X0
		l4 = new JLabel("X1 = ");
		l4.setBounds(190,200,100,20);// X1
		l5 = new JLabel("F(X0) = ");
		l5.setBounds(10,230,100,20); // F(X0)
		l6 = new JLabel("F(X1) = ");
		l6.setBounds(175,230,100,20);
		l7 = new JLabel("Oscar Alberto Nazarit Campos");
		l7.setBounds(10,10,200,30);
		
		JTextField tf1, tf2, tf3, tf4, tf5, tf6;
		tf1 = new JTextField(""); // X TF
		tf1.setBounds(225,80,100,20);
		tf2 = new JTextField("");
		tf2.setBounds(225,120,100,20);
		tf3 = new JTextField("");
		tf3.setBounds(60,200,100,20); // X0 TF
		tf4 = new JTextField("");
		tf4.setBounds(225,200,100,20); // X1 TF
		tf5 = new JTextField("");
		tf5.setBounds(60,230,100,20); // F(X0) TF
		tf6 = new JTextField("");
		tf6.setBounds(225,230,100,20); // F(X1) TF
		
		JButton b1,b2,b3;
		b1 = new JButton("Calcular");
		b1.setBounds(10,80,150,25);
		b2 = new JButton("Limpiar valores");
		b2.setBounds(10,120,150,25);
		b3 = new JButton("Volver");
		b3.setBounds(220,15,100,25);
		
		
		menuIL.add(l1);menuIL.add(l2);menuIL.add(l3);menuIL.add(l4);menuIL.add(l5);menuIL.add(l6);menuIL.add(l7);
		
		menuIL.add(tf1);menuIL.add(tf2);menuIL.add(tf3);menuIL.add(tf4);menuIL.add(tf5);menuIL.add(tf6);
		
		menuIL.add(b1);menuIL.add(b2);menuIL.add(b3);
		
		menuIL.setSize(400,400);
		menuIL.setLayout(null);
		menuIL.setVisible(true);
		
		b2.addActionListener(new ActionListener(){  // Accion para limpiar valores
		    public void actionPerformed(ActionEvent e){  
		            tf1.setText(""); tf2.setText(""); tf3.setText("");
		            tf4.setText(""); tf5.setText(""); tf6.setText("");  
		            }  
		    }); 
		
		b1.addActionListener(new ActionListener(){  // Accion para hacer los calculos de FX
		    public void actionPerformed(ActionEvent e){  
		    	float x = Float.parseFloat(tf1.getText());
		    	float x0 = Float.parseFloat(tf3.getText());
		    	float x1 = Float.parseFloat(tf4.getText());
		    	float fx0 = Float.parseFloat(tf5.getText());
		    	float fx1 = Float.parseFloat(tf6.getText());
		    	float fx = fx0 + ((fx1-fx0)/(x1-x0)*(x-x0));
		    	tf2.setText(""+fx);
		    }  
		    }); 
		
		b3.addActionListener(new ActionListener(){  // Accion para volver al menu
		    public void actionPerformed(ActionEvent e){  
		            menuIL.dispose();
		            menu();
		    }  
		    }); 
	}
	
	public static void main(String[] args) {
		menu();
		
	}

}
