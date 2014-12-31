import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Tic_Tac 
{
	JFrame jfr;
	JButton jb[];
	JMenuBar menuBar;
	JMenu menu, submenu;
	JMenuItem menuItem,exit,menuItem1;
	int player=1,i,first_time=0;
	int arr[];		
	Tic_Tac()
	{
		final String player1 = JOptionPane.showInputDialog("First Player Name(Starts First):");
		final String player2 = JOptionPane.showInputDialog("Second Player Name:");	
		jb=new JButton[9];
		jfr= new JFrame("TIC TAC TOE (" + player1 + " Vs " + player2 + " )");
		arr=new int[50];
		for(i=0;i<10;i++)
		{
			arr[i]=0;
			// System.out.println(arr[i]);
		}
		jfr.setLayout(null);
		for(i=0;i<9;i++)
		{
			jb[i]=new JButton(String.valueOf(i));
			jfr.add(jb[i]);
		}
		jfr.setLayout(new  GridLayout(3,3,0,0));
		menuBar = new JMenuBar();
	menu = new JMenu("Menu");
	menu.setMnemonic(KeyEvent.VK_M);
	menuBar.add(menu);
	menuItem = new JMenuItem("Restart",KeyEvent.VK_R);
	menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
	menu.add(menuItem);
	//a group of radio button menu items
	/*menu.addSeparator();
	ButtonGroup group = new ButtonGroup();
	rbMenuItem = new JRadioButtonMenuItem("A radio button menu item");
	rbMenuItem.setSelected(true);
	rbMenuItem.setMnemonic(KeyEvent.VK_R);
	group.add(rbMenuItem);
	menu.add(rbMenuItem);
	//a submenu
	menu.addSeparator();
	submenu = new JMenu("A submenu");
	submenu.setMnemonic(KeyEvent.VK_S);
	menuItem = new JMenuItem("An item in the submenu");
	menuItem.setAccelerator(KeyStroke.getKeyStroke(
        KeyEvent.VK_2, ActionEvent.ALT_MASK));
	submenu.add(menuItem);
	menuItem = new JMenuItem("Another item");
	submenu.add(menuItem);
	menu.add(submenu);*/
	exit=new JMenuItem("Exit");
	 menu.add(exit);
	//Build second menu in the menu bar.
	 menu = new JMenu("Help");
	 menu.setMnemonic(KeyEvent.VK_N);
	 menuBar.add(menu);
	jfr.setJMenuBar(menuBar);
	menuItem1=new JMenuItem("About Game",KeyEvent.VK_A);
	menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
	menu.add(menuItem1);
		jfr.setSize(400,400);
		jfr.setVisible(true);
		jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		exit.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		});

		menuItem.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e)
			{
				for(i=0;i<10;i++)
				{
					arr[i]=0;
					jb[i].setText(String.valueOf(i));
					jb[i].setForeground(Color.BLACK);
				}

			}
		});
		
		menuItem1.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e)
			{
				 String pt1 = "<html><body width='";
                String pt2 =
                    "'><h1>HOW TO PLAY!</h1>" +
                    "<p>Tic-tac-toe (or Noughts and crosses, Xs and Os) is a game for two players, X and O," +
                    " who take turns marking the spaces in a 3×3 grid. The player who succeeds in placing" +
                    " three respective marks in a horizontal, vertical, or diagonal row wins the game." +
                    " the component.<br><br>";
                JPanel p = new JPanel( new BorderLayout() );
                int width = 175;
                String s = pt1 + width + pt2;

                JOptionPane.showMessageDialog(null, s);
			}
		});

			jb[0].addActionListener(new ActionListener() {
 			
 				public void actionPerformed(ActionEvent e) 
 				{
 					if(player==1 && (arr[0]!=-1&&arr[0]!=-2))
 					{
 						jb[0].setText("O");
 						jb[0].setForeground(Color.RED);

 						player=0;
 						arr[0]=-1;
 						check(arr,player1,player2);
 					}
 					else if(player==0 && arr[0]!=-1&&arr[0]!=-2) 
 					{
 						jb[0].setText("X");
 						jb[0].setForeground(Color.BLUE);
 						
 						player=1;
 						arr[0]=-2;
 						check(arr,player1,player2);
 					}
 					else
 					{
 						JOptionPane.showMessageDialog(null,"Place Has Already Entered!","Don't Cheat..",JOptionPane.PLAIN_MESSAGE);
 					}
 					           
 				}
        	});
        	jb[1].addActionListener(new ActionListener() {
 			
 				public void actionPerformed(ActionEvent e) 
 				{
 					if(player==1 && (arr[1]!=-1&&arr[1]!=-2))
 					{
 						jb[1].setText("O");
 						jb[1].setForeground(Color.RED);
 						player=0;
 						arr[1]=-1;
 						check(arr,player1,player2);
 					}
 					else if(player==0 && arr[1]!=-1&&arr[1]!=-2)
 					{
 						jb[1].setText("X");
 						jb[1].setForeground(Color.BLUE);
 						player=1;
 						arr[1]=-2;
 						check(arr,player1,player2);
 					}
 					else
 					{
 						JOptionPane.showMessageDialog(null,"Place Has Already Entered!","Don't Cheat..",JOptionPane.PLAIN_MESSAGE);
 					}
 					           
 				}
        	});
        	jb[2].addActionListener(new ActionListener() {
 			
 				public void actionPerformed(ActionEvent e) 
 				{
 					if(player==1 && (arr[2]!=-1&&arr[2]!=-2))
 					{
 						jb[2].setText("O");
 						jb[2].setForeground(Color.RED);
 						player=0;
 						arr[2]=-1;
 						check(arr,player1,player2);
 					}
 					else if(player==0 && arr[2]!=-1&&arr[2]!=-2)
 					{
 						jb[2].setText("X");
 						jb[2].setForeground(Color.BLUE);
 						player=1;
 						arr[2]=-2;
 						check(arr,player1,player2);
 					}
 					else
 					{
 						JOptionPane.showMessageDialog(null,"Place Has Already Entered!","Don't Cheat..",JOptionPane.PLAIN_MESSAGE);
 					}
 					           
 				}
        	});
        	jb[3].addActionListener(new ActionListener() {
 			
 				public void actionPerformed(ActionEvent e) 
 				{
 					if(player==1 && (arr[3]!=-1&&arr[3]!=-2))
 					{
 						jb[3].setText("O");
 						jb[3].setForeground(Color.RED);
 						player=0;
 						arr[3]=-1;
 						check(arr,player1,player2);
 					}
 					else if(player==0 && arr[3]!=-1&&arr[3]!=-2)
 					{
 						jb[3].setText("X");
 						jb[3].setForeground(Color.BLUE);
 						player=1;
 						arr[3]=-2;
 						check(arr,player1,player2);
 					}
 					else
 					{
 						JOptionPane.showMessageDialog(null,"Place Has Already Entered!","Don't Cheat..",JOptionPane.PLAIN_MESSAGE);
 					}
 					           
 				}
        	});
        	jb[4].addActionListener(new ActionListener() {
 			
 				public void actionPerformed(ActionEvent e) 
 				{
 					if(player==1 && (arr[4]!=-1&&arr[4]!=-2))
 					{
 						jb[4].setText("O");
 						jb[4].setForeground(Color.RED);
 						player=0;
 						arr[4]=-1;
 						check(arr,player1,player2);
 					}
 					else if(player==0 && arr[4]!=-1&&arr[4]!=-2)
 					{
 						jb[4].setText("X");
 						jb[4].setForeground(Color.BLUE);
 						player=1;
 						arr[4]=-2;
 						check(arr,player1,player2);
 					}
 					else
 					{
 						JOptionPane.showMessageDialog(null,"Place Has Already Entered!","Don't Cheat..",JOptionPane.PLAIN_MESSAGE);
 					}
 					           
 				}
        	});
        	jb[5].addActionListener(new ActionListener() {
 			
 				public void actionPerformed(ActionEvent e) 
 				{
 					if(player==1 && (arr[5]!=-1&&arr[5]!=-2))
 					{
 						jb[5].setText("O");
 						jb[5].setForeground(Color.RED);
 						player=0;
 						arr[5]=-1;
 						check(arr,player1,player2);
 					}
 					else if(player==0 && arr[5]!=-1&&arr[5]!=-2)
 					{
 						jb[5].setText("X");
 						jb[5].setForeground(Color.BLUE);
 						player=1;
 						arr[5]=-2;
 						check(arr,player1,player2);
 					}
 					else
 					{
 						JOptionPane.showMessageDialog(null,"Place Has Already Entered!","Don't Cheat..",JOptionPane.PLAIN_MESSAGE);
 					}
 					           
 				}
        	});
        	jb[6].addActionListener(new ActionListener() {
 			
 				public void actionPerformed(ActionEvent e) 
 				{
 					if(player==1 && (arr[6]!=-1&&arr[6]!=-2))
 					{
 						jb[6].setText("O");
 						jb[6].setForeground(Color.RED);
 						player=0;
 						arr[6]=-1;
 						check(arr,player1,player2);
 					}
 					else if(player==0 && arr[6]!=-1&&arr[6]!=-2)
 					{
 						jb[6].setText("X");
 						jb[6].setForeground(Color.BLUE);
 						player=1;
 						arr[6]=-2;
 						check(arr,player1,player2);
 					}
 					else
 					{
 						JOptionPane.showMessageDialog(null,"Place Has Already Entered!","Don't Cheat..",JOptionPane.PLAIN_MESSAGE);
 					}
 					           
 				}
        	});
        	jb[7].addActionListener(new ActionListener() {
 			
 				public void actionPerformed(ActionEvent e) 
 				{
 					if(player==1 && (arr[7]!=-1&&arr[7]!=-2))
 					{
 						jb[7].setText("O");
 						jb[7].setForeground(Color.RED);
 						player=0;
 						arr[7]=-1;
 						check(arr,player1,player2);
 					}
 					else if(player==0 && arr[7]!=-1&&arr[7]!=-2)
 					{
 						jb[7].setText("X");
 						jb[7].setForeground(Color.BLUE);
 						player=1;
 						arr[7]=-2;
 						check(arr,player1,player2);
 					}
 					else
 					{
 						JOptionPane.showMessageDialog(null,"Place Has Already Entered!","Don't Cheat..",JOptionPane.PLAIN_MESSAGE);
 					}
 					           
 				}
        	});
        	jb[8].addActionListener(new ActionListener() {
 			
 				public void actionPerformed(ActionEvent e) 
 				{
 					if(player==1 && (arr[8]!=-1&&arr[8]!=-2))
 					{
 						jb[8].setText("O");
 						jb[8].setForeground(Color.RED);
 						player=0;
 						arr[8]=-1;
 						check(arr,player1,player2);
 					}
 					else if(player==0 && arr[8]!=-1&&arr[8]!=-2)
 					{
 						jb[8].setText("X");
 						jb[8].setForeground(Color.BLUE);
 						player=1;
 						arr[8]=-2;
 						check(arr,player1,player2);
 					}
 					else
 					{
 						JOptionPane.showMessageDialog(null,"Place Has Already Entered!","Don't Cheat..",JOptionPane.PLAIN_MESSAGE);
 					}
 					           
 				}
        	});
	}

	public void check(int[] array,String player1,String player2)
	{
		int z=0;
		if(array[0]==-1&&array[1]==-1&&array[2]==-1)
		{
 						JOptionPane.showMessageDialog(null,player1 + " Wins","Congrats..",JOptionPane.PLAIN_MESSAGE);
 									
		}
		else if(array[0]==-1&&array[3]==-1&&array[6]==-1)
		{
 						JOptionPane.showMessageDialog(null,player1 + " Wins","Congrats..",JOptionPane.PLAIN_MESSAGE);
 						
			
		}
		else if(array[0]==-1&&array[4]==-1&&array[8]==-1)
		{
 						JOptionPane.showMessageDialog(null,player1 + " Wins","Congrats..",JOptionPane.PLAIN_MESSAGE);
 						
			
		}
		else if(array[3]==-1&&array[4]==-1&&array[5]==-1)
		{
 						JOptionPane.showMessageDialog(null,player1 + " Wins","Congrats..",JOptionPane.PLAIN_MESSAGE);
 						
			
		}
		else if(array[6]==-1&&array[7]==-1&&array[8]==-1)
		{
 						JOptionPane.showMessageDialog(null,player1 + " Wins","Congrats..",JOptionPane.PLAIN_MESSAGE);
 						
			
		}
		else if(array[1]==-1&&array[4]==-1&&array[7]==-1)
		{
 						JOptionPane.showMessageDialog(null,player1 + " Wins","Congrats..",JOptionPane.PLAIN_MESSAGE);
 						
			
		}
		else if(array[2]==-1&&array[5]==-1&&array[8]==-1)
		{
 						JOptionPane.showMessageDialog(null,player1 + " Wins","Congrats..",JOptionPane.PLAIN_MESSAGE);
 						
			
		}
		else if(array[2]==-1&&array[4]==-1&&array[6]==-1)
		{
 						JOptionPane.showMessageDialog(null,player1 + " Wins","Congrats..",JOptionPane.PLAIN_MESSAGE);
 						
			
		}


		else if(array[0]==-2&&array[1]==-2&&array[2]==-2)
		{
			JOptionPane.showMessageDialog(null,player2 + " Wins","Congrats..",JOptionPane.PLAIN_MESSAGE);
			
		}
		else if(array[0]==-2&&array[3]==-2&&array[6]==-2)
		{
			JOptionPane.showMessageDialog(null,player2 + " Wins","Congrats..",JOptionPane.PLAIN_MESSAGE);
			
		}
		else if(array[0]==-2&&array[4]==-2&&array[8]==-2)
		{
			JOptionPane.showMessageDialog(null,player2 + " Wins","Congrats..",JOptionPane.PLAIN_MESSAGE);
			
		}
		else if(array[3]==-2&&array[4]==-2&&array[5]==-2)
		{
			JOptionPane.showMessageDialog(null,player2 + " Wins","Congrats..",JOptionPane.PLAIN_MESSAGE);
			
		}
		else if(array[6]==-2&&array[7]==-2&&array[8]==-2)
		{
			JOptionPane.showMessageDialog(null,player2 + " Wins","Congrats..",JOptionPane.PLAIN_MESSAGE);
			
		}
		else if(array[1]==-2&&array[4]==-2&&array[7]==-2)
		{
			JOptionPane.showMessageDialog(null,player2 + " Wins","Congrats..",JOptionPane.PLAIN_MESSAGE);
			
		}
		else if(array[2]==-2&&array[5]==-2&&array[8]==-2)
		{
			JOptionPane.showMessageDialog(null,player2 + " Wins","Congrats..",JOptionPane.PLAIN_MESSAGE);
			
		}
		else if(array[2]==-2&&array[4]==-2&&array[6]==-2)
		{
			JOptionPane.showMessageDialog(null,player2 + " Wins","Congrats..",JOptionPane.PLAIN_MESSAGE);
			
		}
		else
		{
			for(i=0;i<9;i++)
			{
				if(array[i]==-1||array[i]==-2)
				{
					z++;
				}
			}
			if(z==9)
			{
				JOptionPane.showMessageDialog(null,"ITS A TIE..","Nice Game...",JOptionPane.PLAIN_MESSAGE);
				
			}
		}

	}
	public static void main(String args[])
	{
		new Tic_Tac();
	}

}