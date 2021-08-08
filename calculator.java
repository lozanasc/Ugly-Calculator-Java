import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.lang.*;

public class calculator{


		private JButton numberButton 
		(
		JButton numButton, 
		ImageIcon numIcon,
		int numValue,
		int buttonX,
		int buttonY,
		int buttonHeight,
		int buttonWidth,
		boolean isOpaque,
		boolean isFilled,
		boolean isBorderPainted)
		{
			numButton.setBounds(buttonX,buttonY,buttonHeight,buttonWidth);
			numButton.setOpaque(isOpaque);
			numButton.setContentAreaFilled(isFilled);
			numButton.setBorderPainted(isBorderPainted);
			numButton.setIcon(numIcon);
			numButton.addActionListener(new ActionListener(){  
				public void actionPerformed(ActionEvent e){
				tf.setText(tf.getText().concat(String.valueOf(numValue))); 
				}  
				});
			return numButton;
		};

		private JButton operatorButton 
		(
		JButton opButton, 
		ImageIcon numIcon,
		int numValue,
		int buttonX,
		int buttonY,
		int buttonHeight,
		int buttonWidth,
		boolean isOpaque,
		boolean isFilled,
		boolean isBorderPainted,
		int calculatingOperator,
		String stringOperator)
		{
			opButton.setBounds(buttonX,buttonY,buttonHeight,buttonWidth);
			opButton.setOpaque(isOpaque);
			opButton.setContentAreaFilled(isFilled);
			opButton.setBorderPainted(isBorderPainted);
			opButton.setIcon(numIcon);
			opButton.addActionListener(new ActionListener(){  
				public void actionPerformed(ActionEvent e){
					num = Double.parseDouble(tf.getText());
					calc=calculatingOperator;
					tf.setText("");
					lbl1.setText(num + stringOperator);
				}  
				});
			return opButton;
		};

		private double num, ans;
		private int calc;

		//Header Images
		private ImageIcon background = new ImageIcon("assets/bg.png"); 
		private ImageIcon ic1 = new ImageIcon("assets/math.png"); 
		//Button Images
		private ImageIcon icb10 = new ImageIcon("assets/operatoricons/add.png"); 
		private ImageIcon icb11 = new ImageIcon("assets/operatoricons/subt.png"); 
		private ImageIcon icb12 = new ImageIcon("assets/operatoricons/multi.png"); 
		private ImageIcon icb13 = new ImageIcon("assets/operatoricons/div.png"); 
		private ImageIcon icb14 = new ImageIcon("assets/extraicons/clear.png"); 
		private ImageIcon icb15 = new ImageIcon("assets/operatoricons/equal.png");
		private ImageIcon icb16 = new ImageIcon("assets/extraicons/delete.png");  
		private ImageIcon icb17 = new ImageIcon("assets/operatoricons/dot.png"); 

		/*Swing Components Declaration*/
		//Frame
		private JFrame myFrame = new JFrame();
		//Panel
		private JPanel myPanel = new JPanel();
		//Labels
		private JLabel bg = new JLabel(null,background,0);
		private JLabel icon1 = new JLabel(null,ic1,0);
		private JLabel lbl1 = new JLabel();
		//Textfields
		private JTextField tf = new JTextField();
		//Buttons
		private JButton n1 = new JButton();
		private JButton n2 = new JButton();
		private JButton n3 = new JButton();
		private JButton n4 = new JButton();
		private JButton n5 = new JButton();
		private JButton n6 = new JButton();
		private JButton n7 = new JButton();
		private JButton n8 = new JButton();
		private JButton n9 = new JButton();
		private JButton n0 = new JButton();
		private JButton add = new JButton();
		private JButton subt = new JButton();
		private JButton div = new JButton();
		private JButton multi = new JButton();
		private JButton cls = new JButton();
		private JButton eq = new JButton();
		private JButton del = new JButton();
		private JButton dot = new JButton();


	public void operations(){
		switch(calc){

			case 1: {
				ans = num + Double.parseDouble(tf.getText());
				tf.setText(Double.toString(ans));
				break;
			}
			case 2: {
				ans = num - Double.parseDouble(tf.getText());
				tf.setText(Double.toString(ans));
				break;
			}
			case 3: {
				ans = num / Double.parseDouble(tf.getText());
				tf.setText(Double.toString(ans));
				break;
			}
			case 4: {
				ans = num * Double.parseDouble(tf.getText());
				tf.setText(Double.toString(ans));
				break;
			}

		}
	}
		
	public calculator(){
		ui();
	}

	public void ui(){
		/*Component configuration*/

		//bg creation using jlabel
		bg.setBounds(0,0,300,400);

		//Icons using jlabel
		icon1.setBounds(0, 0, 100,100);

		//Labels
		lbl1.setBounds(100,0,200,15);
		lbl1.setForeground(Color.white);
		lbl1.setFont(new Font("Arial", Font.BOLD, 16));
		//Textfield
		tf.setHorizontalAlignment(SwingConstants.RIGHT);
		tf.setBounds(120,25,140,35);
		tf.setOpaque(false);
		tf.setForeground(Color.white);
		tf.setFont(new Font("Arial", Font.BOLD, 16));
		tf.setEditable(false);
		//Number Buttons
		numberButton(n1, new ImageIcon("assets/numbericons/1.png"),1,30,100,50,50,false,false,false);
		numberButton(n2, new ImageIcon("assets/numbericons/2.png"),2,90,100,50,50,false,false,false);
		numberButton(n3, new ImageIcon("assets/numbericons/3.png"),3,150,100,50,50,false,false,false);
		numberButton(n4, new ImageIcon("assets/numbericons/4.png"),4,210,100,50,50,false,false,false);
		numberButton(n5, new ImageIcon("assets/numbericons/5.png"),5,30,160,50,50,false,false,false);
		numberButton(n6, new ImageIcon("assets/numbericons/6.png"),6,90,160,50,50,false,false,false); 
		numberButton(n7, new ImageIcon("assets/numbericons/7.png"),7,150,160,50,50,false,false,false); 
		numberButton(n8, new ImageIcon("assets/numbericons/8.png"),8,210,160,50,50,false,false,false); 
		numberButton(n9, new ImageIcon("assets/numbericons/9.png"),9,30,220,50,50,false,false,false);
		numberButton(n0, new ImageIcon("assets/numbericons/0.png"),0,90,220,50,50,false,false,false);   
		// Delete / Clear
		cls.setBounds(150,220,50,50);
		cls.setOpaque(false);
		cls.setContentAreaFilled(false);
		cls.setBorderPainted(false);
		cls.setIcon(icb14);
		cls.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e){
tf.setText(""); 
        }  
    }); 
		//Equals button
		eq.setBounds(210,220,50,50);
		eq.setOpaque(false);
		eq.setContentAreaFilled(false);
		eq.setBorderPainted(false);
		eq.setIcon(icb15);
		eq.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e){
operations();
lbl1.setText("");
        }  
    }); 
		//Arithmetic Operators
		add.setBounds(30,280,50,50);
		add.setOpaque(false);
		add.setContentAreaFilled(false);
		add.setBorderPainted(false);
		add.setIcon(icb10);
		add.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e){
num = Double.parseDouble(tf.getText());
calc=1;
tf.setText("");
lbl1.setText(num + "+");
        }  
    }); 
		subt.setBounds(90,280,50,50);
		subt.setOpaque(false);
		subt.setContentAreaFilled(false);
		subt.setBorderPainted(false);
		subt.setIcon(icb11);
		subt.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e){
num = Double.parseDouble(tf.getText());
calc=2;
tf.setText("");
lbl1.setText(num + "-");
        }  
    }); 
		div.setBounds(150,280,50,50);
		div.setOpaque(false);
		div.setContentAreaFilled(false);
		div.setBorderPainted(false);
		div.setIcon(icb13);
		div.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e){
num = Double.parseDouble(tf.getText());
calc=3;
tf.setText("");
lbl1.setText(num + "/");
        }  
    }); 
		multi.setBounds(210,280,50,50);
		multi.setOpaque(false);
		multi.setContentAreaFilled(false);
		multi.setBorderPainted(false);
		multi.setIcon(icb12);
		multi.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e){
num = Double.parseDouble(tf.getText());
calc=4;
tf.setText("");
lbl1.setText(num + "*");
        }  
    }); 
		del.setBounds(125,65,35,35);
		del.setOpaque(false);
		del.setContentAreaFilled(false);
		del.setBorderPainted(false);
		del.setIcon(icb16);
		del.addActionListener(new ActionListener(){  
		public void actionPerformed(ActionEvent e){
		int length = tf.getText().length();
		int num = tf.getText().length()-1;
		String remain;
		if(length>0){
			StringBuilder back = new StringBuilder(tf.getText());
			back.deleteCharAt(num);
			remain=back.toString();
			tf.setText(remain);
		}
        }  
    	}); 

    	dot.setBounds(190,65,35,35);
		dot.setOpaque(false);
		dot.setContentAreaFilled(false);
		dot.setBorderPainted(false);
		dot.setIcon(icb17);
		dot.addActionListener(new ActionListener(){  
		public void actionPerformed(ActionEvent e){
		tf.setText(tf.getText()+"."); 
        }  
    	}); 



		/*Panel components*/
		myPanel.add(del);
		myPanel.add(dot);
		myPanel.add(lbl1);
		myPanel.add(eq);
		myPanel.add(cls);
		myPanel.add(multi);
		myPanel.add(div);
		myPanel.add(subt);
		myPanel.add(add);
		myPanel.add(n0);
		myPanel.add(n9);
		myPanel.add(n8);
		myPanel.add(n7);
		myPanel.add(n6);
		myPanel.add(n5);
		myPanel.add(n4);
		myPanel.add(n3);
		myPanel.add(n2);
		myPanel.add(n1);
		myPanel.add(tf);
		myPanel.add(icon1);
		myPanel.add(bg);
		
		/*Panel settings*/
		myPanel.setLayout(null);
		
		/*Frame Components*/
		myFrame.add(myPanel);

		/*Frame setting*/
		myFrame.setResizable(false);
		myFrame.setTitle("Calculator in Java");
		myFrame.setSize(300,400);
		myFrame.setVisible(true);
		myFrame.setLocationRelativeTo(null);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
		new calculator();
	}
}

