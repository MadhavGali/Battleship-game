import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmptyWindow implements ActionListener
{
  	static int count;
  	static boolean flag = false;
  	
  	
  	
  	public static void main(String[] args) 
  	{
		String name;
		String opponent;
		
		int column = 6;
		int row = 6;
		
		AddI obj = (AddI)Naming.lookup("Add1");
		
		name = sc.nextLine();
		
		obj.setName1(name);
		
		obj.initialize(row,column);
		
		JFrame frame = new JFrame("Empty Window");
		JPanel panel = new JPanel();
		JLabel lab1 = new JLabel("User Name");
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		
		GridLayout experimentLayout = new GridLayout(6,6,0,0);
		GridLayout experimentLayout2 = new GridLayout(2,3,10,10);
		panel.setLayout(experimentLayout);
		panel1.setLayout(experimentLayout);
		
		JButton b1 = new JButton("1");
		b1.addActionListener(new ActionListener()
		{	public void actionPerformed(ActionEvent e)
			{
				b1.setEnabled(false);
				b1.setText("o");
				obj.ship(0,0);
				count++;
				if(count >= 14)
				{
					flag = true;
				}
			}
		
		}); 
		JButton b2 = new JButton("2");
		b2.addActionListener(new ActionListener()
		{	public void actionPerformed(ActionEvent e)
			{
				b2.setEnabled(false);
				b2.setText("o");
				obj.ship(0,1);
				count++;
				if(count >= 14)
				{
					flag = true;
				}
			}
		
		});
		JButton b3 = new JButton("3");
		b3.addActionListener(new ActionListener()
		{	public void actionPerformed(ActionEvent e)
			{
				b3.setEnabled(false);
				b3.setText("o");
				obj.ship(0,2);
				count++;
				if(count >= 14)
				{
					flag = true;
				}
			}
		
		});
		JButton b4 = new JButton("4");
		b4.addActionListener(new ActionListener()
		{	public void actionPerformed(ActionEvent e)
			{
				b4.setEnabled(false);
				b4.setText("o");
				obj.ship(0,3);
				count++;
				if(count >= 14)
				{
					flag = true;
				}
			}
		
		});
		JButton b5 = new JButton("5");
		b5.addActionListener(new ActionListener()
		{	public void actionPerformed(ActionEvent e)
			{
				b5.setEnabled(false);
				b5.setText("o");
				obj.ship(0,4);
				count++;
				if(count >= 14)
				{
					flag = true;
				}
			}
		
		});
		JButton b6 = new JButton("6");
		b6.addActionListener(new ActionListener()
		{	public void actionPerformed(ActionEvent e)
			{
				b6.setEnabled(false);
				b6.setText("o");
				obj.ship(0,5);
				count++;
				if(count >= 14)
				{
					flag = true;
				}
			}
		
		});
		JButton b7 = new JButton("7");
		b7.addActionListener(new ActionListener()
		{	public void actionPerformed(ActionEvent e)
			{
				b7.setEnabled(false);
				b7.setText("o");
				obj.ship(1,0);
				count++;
				if(count >= 14)
				{
					flag = true;
				}
			}
		
		});
		JButton b8 = new JButton("8");
		b8.addActionListener(new ActionListener()
		{	public void actionPerformed(ActionEvent e)
			{
				b8.setEnabled(false);
				b8.setText("o");
				obj.ship(1,1);
				count++;
				if(count >= 14)
				{
					flag = true;
				}
			}
		
		});
		JButton b9 = new JButton("9");
		b9.addActionListener(new ActionListener()
		{	public void actionPerformed(ActionEvent e)
			{
				b9.setEnabled(false);
				b9.setText("o");
				obj.ship(1,2);
				count++;
				if(count >= 14)
				{
					flag = true;
				}
			}
		
		});
		JButton b10 = new JButton("10");
		b10.addActionListener(new ActionListener()
		{	public void actionPerformed(ActionEvent e)
			{
				b10.setEnabled(false);
				b10.setText("o");
				obj.ship(1,3);
				count++;
				if(count >= 14)
				{
					flag = true;
				}
			}
		
		});
		JButton b11 = new JButton("11");
		b11.addActionListener(new ActionListener()
		{	public void actionPerformed(ActionEvent e)
			{
				b11.setEnabled(false);
				b11.setText("o")
				obj.ship(1,4);
				count++;
				if(count >= 14)
				{
					flag = true;
				}
			}
		
		});
		JButton b12 = new JButton("12");
		b12.addActionListener(new ActionListener()
		{	public void actionPerformed(ActionEvent e)
			{
				b12.setEnabled(false);
				b12.setText("o");
				obj.ship(1,5);
				count++;
				if(count >= 14)
				{
					flag = true;
				}
			}
		
		});
		JButton b13 = new JButton("13");
		b13.addActionListener(new ActionListener()
		{	public void actionPerformed(ActionEvent e)
			{
				b13.setEnabled(false);
				b13.setText("o");
				obj.ship(2,0);
				count++;
				if(count >= 14)
				{
					flag = true;
				}
			}
		
		});
		JButton b14 = new JButton("14");
		b14.addActionListener(new ActionListener()
		{	public void actionPerformed(ActionEvent e)
			{
				b14.setEnabled(false);
				b14.setText("o");
				obj.ship(2,1);
				count++;
				if(count >= 14)
				{
					flag = true;
				}
			}
		
		});
		JButton b15 = new JButton("15");
		b15.addActionListener(new ActionListener()
		{	public void actionPerformed(ActionEvent e)
			{
				b15.setEnabled(false);
				b15.setText("o");
				obj.ship(2,2);
				count++;
				if(count >= 14)
				{
					flag = true;
				}
			}
		
		});
		JButton b16 = new JButton("16");
		b16.addActionListener(new ActionListener()
		{	public void actionPerformed(ActionEvent e)
			{
				b16.setEnabled(false);
				b16.setText("o");
				obj.ship(2,3);
				count++;
				if(count >= 14)
				{
					flag = true;
				}
			}
		
		});
		JButton b17 = new JButton("17");
		b17.addActionListener(new ActionListener()
		{	public void actionPerformed(ActionEvent e)
			{
				b17.setEnabled(false);
				b17.setText("o");
				obj.ship(2,4);
				count++;
				if(count >= 14)
				{
					flag = true;
				}
			}
		
		});
		JButton b18 = new JButton("18");
		b18.addActionListener(new ActionListener()
		{	public void actionPerformed(ActionEvent e)
			{
				b18.setEnabled(false);
				b18.setText("o");
				obj.ship(2,5);
				count++;
				if(count >= 14)
				{
					flag = true;
				}
			}
		
		});
		JButton b19 = new JButton("19");
		b19.addActionListener(new ActionListener()
		{	public void actionPerformed(ActionEvent e)
			{
				b19.setEnabled(false);
				b19.setText("o");
				obj.ship(3,0);
				count++;
				if(count >= 14)
				{
					flag = true;
				}
			}
		
		});
		JButton b20 = new JButton("20");
		b20.addActionListener(new ActionListener()
		{	public void actionPerformed(ActionEvent e)
			{
				b20.setEnabled(false);
				b20.setText("o");
				obj.ship(3,1);
				count++;
				if(count >= 14)
				{
					flag = true;
				}
			}
		
		});
		JButton b21 = new JButton("21");
		b21.addActionListener(new ActionListener()
		{	public void actionPerformed(ActionEvent e)
			{
				b21.setEnabled(false);
				b21.setText("o");
				obj.ship(3,2);
				count++;
				if(count >= 14)
				{
					flag = true;
				}
			}
		
		});
		JButton b22 = new JButton("22");
		b22.addActionListener(new ActionListener()
		{	public void actionPerformed(ActionEvent e)
			{
				b22.setEnabled(false);
				b22.setText("o");
				obj.ship(3,3);
				count++;
				if(count >= 14)
				{
					flag = true;
				}
			}
		
		});
		JButton b23 = new JButton("23");
		b23.addActionListener(new ActionListener()
		{	public void actionPerformed(ActionEvent e)
			{
				b23.setEnabled(false);
				b23.setText("o");
				obj.ship(3,4);
				count++;
				if(count >= 14)
				{
					flag = true;
				}
			}
		
		});
		JButton b24 = new JButton("24");
		b24.addActionListener(new ActionListener()
		{	public void actionPerformed(ActionEvent e)
			{
				b24.setEnabled(false);
				b24.setText("o");
				obj.ship(3,5);
				count++;
				if(count >= 14)
				{
					flag = true;
				}
			}
		
		});
		JButton b25 = new JButton("25");
		b25.addActionListener(new ActionListener()
		{	public void actionPerformed(ActionEvent e)
			{
				b25.setEnabled(false);
				b25.setText("o");
				obj.ship(4,0);
				count++;
				if(count >= 14)
				{
					flag = true;
				}
			}
		
		});
		JButton b26 = new JButton("26");
		b26.addActionListener(new ActionListener()
		{	public void actionPerformed(ActionEvent e)
			{
				b26.setEnabled(false);
				b26.setText("o");
				obj.ship(4,1);
				count++;
				if(count >= 14)
				{
					flag = true;
				}
			}
		
		});
		JButton b27 = new JButton("27");
		b27.addActionListener(new ActionListener()
		{	public void actionPerformed(ActionEvent e)
			{
				b27.setEnabled(false);
				b27.setText("o");
				obj.ship(4,2);
				count++;
				if(count >= 14)
				{
					flag = true;
				}
			}
		
		});
		JButton b28 = new JButton("28");
		b28.addActionListener(new ActionListener()
		{	public void actionPerformed(ActionEvent e)
			{
				b28.setEnabled(false);
				b28.setText("o");
				obj.ship(4,3);
				count++;
				if(count >= 14)
				{
					flag = true;
				}
			}
		
		});
		JButton b29 = new JButton("29");
		b29.addActionListener(new ActionListener()
		{	public void actionPerformed(ActionEvent e)
			{
				b29.setEnabled(false);
				b29.setText("o");
				obj.ship(4,4);
				count++;
				if(count >= 14)
				{
					flag = true;
				}
			}
		
		});
		JButton b30 = new JButton("30");
		b30.addActionListener(new ActionListener()
		{	public void actionPerformed(ActionEvent e)
			{
				b30.setEnabled(false);
				b30.setText("o");
				obj.ship(4,5);
				count++;
				if(count >= 14)
				{
					flag = true;
				}
			}
		
		});
		JButton b31 = new JButton("31");
		b31.addActionListener(new ActionListener()
		{	public void actionPerformed(ActionEvent e)
			{
				b31.setEnabled(false);
				b31.setText("o");
				obj.ship(5,0);
				count++;
				if(count >= 14)
				{
					flag = true;
				}
			}
		
		});
		JButton b32 = new JButton("32");
		b32.addActionListener(new ActionListener()
		{	public void actionPerformed(ActionEvent e)
			{
				b32.setEnabled(false);
				b32.setText("o");
				obj.ship(5,1);
				count++;
				if(count >= 14)
				{
					flag = true;
				}
			}
		
		});
		JButton b33 = new JButton("33");
		b33.addActionListener(new ActionListener()
		{	public void actionPerformed(ActionEvent e)
			{
				b33.setEnabled(false);
				b33.setText("o");
				obj.ship(5,2);
				count++;
				if(count >= 14)
				{
					flag = true;
				}
			}
		
		});
		JButton b34 = new JButton("34");
		b34.addActionListener(new ActionListener()
		{	public void actionPerformed(ActionEvent e)
			{
				b34.setEnabled(false);
				b34.setText("o");
				obj.ship(5,3);
				count++;
				if(count >= 14)
				{
					flag = true;
				}
			}
		
		});
		JButton b35 = new JButton("35");
		b35.addActionListener(new ActionListener()
		{	public void actionPerformed(ActionEvent e)
			{
				b35.setEnabled(false);
				b35.setText("o");
				obj.ship(5,4);
				count++;
				if(count >= 14)
				{
					flag = true;
				}
			}
		
		});
		JButton b36 = new JButton("36");
		b36.addActionListener(new ActionListener()
		{	public void actionPerformed(ActionEvent e)
			{
				b36.setEnabled(false);
				b36.setText("o");
				obj.ship(5,5);
				count++;
				if(count >= 14)
				{
					flag = true;
				}
			}
		
		});
		JButton b101 = new JButton("1");
		JButton b102 = new JButton("2");
		JButton b103 = new JButton("3");
		JButton b104 = new JButton("4");
		JButton b105 = new JButton("5");
		JButton b106 = new JButton("6");
		JButton b107 = new JButton("7");
		JButton b108 = new JButton("8");
		JButton b109 = new JButton("9");
		JButton b110 = new JButton("10");
		JButton b111 = new JButton("11");
		JButton b112 = new JButton("12");
		JButton b113 = new JButton("13");
		JButton b114 = new JButton("14");
		JButton b115 = new JButton("15");
		JButton b116 = new JButton("16");
		JButton b117 = new JButton("17");
		JButton b118 = new JButton("18");
		JButton b119 = new JButton("19");
		JButton b120 = new JButton("20");
		JButton b121 = new JButton("21");
		JButton b122 = new JButton("22");
		JButton b123 = new JButton("23");
		JButton b124 = new JButton("24");
		JButton b125 = new JButton("25");
		JButton b126 = new JButton("26");
		JButton b127 = new JButton("27");
		JButton b128 = new JButton("28");
		JButton b129 = new JButton("29");
		JButton b130 = new JButton("30");
		JButton b131 = new JButton("31");
		JButton b132 = new JButton("32");
		JButton b133 = new JButton("33");
		JButton b134 = new JButton("34");
		JButton b135 = new JButton("35");
		JButton b136 = new JButton("36");
	
		JTextField userText = new JTextField(6);
		
		JTextField userText1 = new JTextField(7); 
		
		JButton b2135 = new JButton("Click here to start the game");
		b2135.addActionListener(new ActionListener()
		{	public void actionPerformed(ActionEvent e)
			{
				b2135.setEnabled(false);
			}
		
		});
		JButton b2136 = new JButton("Click here to end the game");
		b2136.addActionListener(new ActionListener()
		{	public void actionPerformed(ActionEvent e)
			{
				b2136.setEnabled(false);
			}
		
		});
		JLabel lab4 = new JLabel("Please enter your name");
		JLabel lab6 = new JLabel("Place your ships here");
		JLabel lab5 = new JLabel("Second player name is");
		JLabel lab7 = new JLabel("Hit your opponent ships here");
		JLabel lab8 = new JLabel("Player 2 placed all his ships");
		JLabel lab9 = new JLabel("You won");
		GridLayout experimentLayout4 = new GridLayout(4,1,0,0);
		panel2.setLayout(experimentLayout4);
		panel2.add(lab4);
		panel2.add(userText);
		panel2.add(lab8);
		panel2.add(lab6);
		panel3.setLayout(experimentLayout4);
		panel3.add(lab5);
		panel3.add(userText1);
		panel3.add(lab9);
		panel3.add(lab7);
		
	
		panel4.add(b2135);
		
		panel5.add(b2136);
		
		
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);
		panel.add(b6);
		panel.add(b7);
		panel.add(b8);
		panel.add(b9);
		panel.add(b10);
		panel.add(b11);
		panel.add(b12);
		panel.add(b13);
		panel.add(b14);
		panel.add(b15);
		panel.add(b16);
		panel.add(b17);
		panel.add(b18);
		panel.add(b19);
		panel.add(b20);
		panel.add(b21);
		panel.add(b22);
		panel.add(b23);
		panel.add(b24);
		panel.add(b25);
		panel.add(b26);
		panel.add(b27);
		panel.add(b28);
		panel.add(b29);
		panel.add(b30);
		panel.add(b31);
		panel.add(b32);
		panel.add(b33);
		panel.add(b34);
		panel.add(b35);
		panel.add(b36);
		
		panel1.add(b101);
		panel1.add(b102);
		panel1.add(b103);
		panel1.add(b104);
		panel1.add(b105);
		panel1.add(b106);
		panel1.add(b107);
		panel1.add(b108);
		panel1.add(b109);
		panel1.add(b110);
		panel1.add(b111);
		panel1.add(b112);
		panel1.add(b113);
		panel1.add(b114);
		panel1.add(b115);
		panel1.add(b116);
		panel1.add(b117);
		panel1.add(b118);
		panel1.add(b119);
		panel1.add(b120);
		panel1.add(b121);
		panel1.add(b122);
		panel1.add(b123);
		panel1.add(b124);
		panel1.add(b125);
		panel1.add(b126);
		panel1.add(b127);
		panel1.add(b128);
		panel1.add(b129);
		panel1.add(b130);
		panel1.add(b131);
		panel1.add(b132);
		panel1.add(b133);
		panel1.add(b134);
		panel1.add(b135);
		panel1.add(b136);
		frame.add(panel4);
		frame.add(panel2);
		frame.add(panel3);
		frame.add(panel5);
		frame.add(panel);
		
		frame.add(panel1);
		
		frame.setLayout(experimentLayout2);

		
  		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  		frame.setSize(800,800);
  		frame.setVisible(true);
  		System.out.println(count);
  		
  		while(true)
  		{
  			System.out.print(count);
  			while(flag == true)
  			{
  				b1.setEnabled(false);
  				b2.setEnabled(false);
  				b3.setEnabled(false);
  				b4.setEnabled(false);
  				b5.setEnabled(false);
  				b6.setEnabled(false);
  				b7.setEnabled(false);
  				b8.setEnabled(false);
  				b9.setEnabled(false);
  				b10.setEnabled(false);
  				b11.setEnabled(false);
  				b12.setEnabled(false);
  				b13.setEnabled(false);
  				b14.setEnabled(false);
  				b15.setEnabled(false);
  				b16.setEnabled(false);
  				b17.setEnabled(false);
  				b18.setEnabled(false);
  				b19.setEnabled(false);
  				b20.setEnabled(false);
  				b21.setEnabled(false);
  				b22.setEnabled(false);
  				b23.setEnabled(false);
  				b24.setEnabled(false);
  				b25.setEnabled(false);
  				b26.setEnabled(false);
  				b27.setEnabled(false);
  				b28.setEnabled(false);
  				b29.setEnabled(false);
  				b30.setEnabled(false);
  				b31.setEnabled(false);
  				b32.setEnabled(false);
  				b33.setEnabled(false);
				b34.setEnabled(false);
				b35.setEnabled(false);
				b36.setEnabled(false);
			}
		}
    }
   
  }
  

        