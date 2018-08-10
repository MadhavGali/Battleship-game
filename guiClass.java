/**
 * filename abstractgame.java
 *
 * Version: v 1.1
 *          $Id$
 *
 *		    Revision 1.1  2016/11/14 20:20:20
 *          Initial revision
 *


 * This is the Main class which has all the methods in it.
 *
 * @author    Geeta Madhav Gali
 * @author	  Sanjay Varma Rudraraju
 *
 */

import java.rmi.server.*; 

public class guiClass extends UnicastRemoteObject implements guiInterface
{
	static int row1 = 6;
	static int column1 = 6;
	static char [][] ocean;
	static char [][] ocean1;
	
	static String playerA;
	static String playerB;
	
	static int countA =0;
	static int countB =0;
	
	static int counterA =0;
	static int counterB =0;
	
	
	static boolean playerAMissed = false;
	static boolean playerBMissed = true;

	
	public void setName(String name)
	/**
     * Setting the name of Player A
     * 
     *
     */
	{
		playerA = name;
		
	}
	
	public void setName1(String name)
	/**
     * Setting the name of Player B
     * 
     *
     */
	{
		playerB = name;
		
	}
	
	public char[][] initialize(int row, int column)
	/**
     * Initialising the ocean of Player A
     * 
     * @param - row - No of rows of the ocean
     * @param - column - No of columns of the ocean
     * @param - ocean - Ocean of the player A
     *
     * @return Ocean of Player A.
     *
     */
	{
	    	this.ocean = new char[row][column];
	    	this.ocean1 = new char[row][column];
	    	for(int i = 0;i< row; i++)
	    	{
	    		for(int j = 0; j<column; j++)
	    		{
	    			ocean[i][j] = '-';
	    		}
	    	}
	    	return ocean;
	}
	public char[][] initialize1(int row, int column)
	/**
     * Initialising the ocean of Player B
     * 
     * @param - row - No of rows of the ocean
     * @param - column - No of columns of the ocean
     * @param - ocean2 - Ocean of the player B
     *
     * @return Ocean of Player A.
     *
     */
	{
	    	ocean2 = new char[row][column];
	    	ocean3 = new char[row][column];
	    	for(int i = 0;i< row; i++)
	    	{
	    		for(int j = 0; j<column; j++)
	    		{
	    			ocean1[i][j] = '-';
	    		}
	    	}
	    	return ocean1;
	}
	public boolean ship(int x, int y, int orientation, int length)
	/**
     * Arranging the ships of Player A in his Ocean
     * The Cases are to ensure that ships are placed in place without going out of bounds or overlapping
     *
     *
     * @return true if the ships is placed in specific coordinates.
     *
     */
	{
	    	if (x > (row - 1) || (y > (column - 1)) || (orientation > 4))
			{
				System.out.println("1");
				return false;
			}
			else
			{
				System.out.println(length);
				switch (orientation) 
				{
		    		case 1: 
		    		{
						if ((x - length) < (-1)) 
						{
							System.out.println("2");
							return false;
						} 
						else 
						{
							for (int i = x; i >= (x - (length-1)); i--) 
							{
								if (ocean1[i][y] == 'o') 
								{
									System.out.println("3");
									return false;
								}
							}

							for (int i = x; i >= (x - (length-1)); i--) 
							{
								ocean1[i][y] = 'o';
							}
						}
						break;
					}
					case 2: 
					{
						if ((x + length) > (row)) 
						{
							System.out.println("4");
							return false;
						}
						else 
						{
							for (int j = x; j < (x + length); j++) 
							{
								if (ocean1[j][y] == 'o') 
								{
									System.out.println("5");
									return false;
								}
							}
							for (int i = x; i < (x + length); i++) 
							{
								ocean1[i][y] = 'o';
							}
						}
						break;
					}
					case 3: 
					{
						if ((y + length) > (column)) 
						{
							System.out.println("6");
							System.out.println((y + length));
							return false;
						} 
						else 
						{
							for (int i = y; i < (y + length); i++) 
							{
								if (ocean1[x][i] == 'o') 
								{
									System.out.println("7");
									return false;
								}
							}
							for (int i = y; i < (y + length); i++) 
							{
								ocean1[x][i] = 'o';
							}
						}
						break;
					}
					case 4: 
					{
						if ((y - length) < (-1)) 
						{
							System.out.println("8");
							return false;
						} 
						else 
						{
							for (int i = y; i >= (y - (length-1)); i--) 
							{
								if (ocean1[x][i] == 'o') 
								{
									//System.out.println("9");
									return false;
								}
							}
							for (int i = y; i >= (y-(length-1)); i--) 
							{
								ocean1[x][i] = 'o';
							}
						}
						break;
					}
				}
			
	    	}
	    	return true;
	}
	
	public boolean ship1(int row, int column)
	/**
     * Arranging the ships of Player B in his Ocean
     * The Cases are to ensure that ships are placed in place without going out of bounds or overlapping
     *
     *
     * @return true if the ships is placed in specific coordinates.
     *
     */
	{
	    	if (x > (row - 1) || (y > (column - 1)) || (orientation > 4))
			{
				System.out.println("1");
				return false;
			}
			else
			{
				System.out.println(length);
				switch (orientation) 
				{
		    		case 1: 
		    		{
						if ((x - length) < (-1)) 
						{
							System.out.println("2");
							return false;
						} 
						else 
						{
							for (int i = x; i >= (x - (length-1)); i--) 
							{
								if (ocean3[i][y] == 'o') 
								{
									System.out.println("3");
									return false;
								}
							}

							for (int i = x; i >= (x - (length-1)); i--) 
							{
								ocean3[i][y] = 'o';
							}
						}
						break;
					}
					case 2: 
					{
						if ((x + length) > (row)) 
						{
							System.out.println("4");
							return false;
						}
						else 
						{
							for (int j = x; j < (x + length); j++) 
							{
								if (ocean3[j][y] == 'o') 
								{
									System.out.println("5");
									return false;
								}
							}
							for (int i = x; i < (x + length); i++) 
							{
								ocean3[i][y] = 'o';
							}
						}
						break;
					}
					case 3: 
					{
						if ((y + length) > (column)) 
						{
							System.out.println("6");
							System.out.println((y + length));
							return false;
						} 
						else 
						{
							for (int i = y; i < (y + length); i++) 
							{
								if (ocean3[x][i] == 'o') 
								{
									System.out.println("7");
									return false;
								}
							}
							for (int i = y; i < (y + length); i++) 
							{
								ocean3[x][i] = 'o';
							}
						}
						break;
					}
					case 4: 
					{
						if ((y - length) < (-1)) 
						{
							System.out.println("8");
							return false;
						} 
						else 
						{
							for (int i = y; i >= (y - (length-1)); i--) 
							{
								if (ocean3[x][i] == 'o') 
								{
									//System.out.println("9");
									return false;
								}
							}
							for (int i = y; i >= (y-(length-1)); i--) 
							{
								ocean3[x][i] = 'o';
							}
						}
						break;
					}
				}
			
	    	}
	    	return true;
	}

	public AddC() throws Exception
	{
		super();
	}


	public int isItMyTurn(String name)
	/**
     * To check whether it is Player A's turn to play the game after ensuring that the all the ships are placed
     * 
     *
     *
     * @return 1 if all the ships are placed by both the players.
     *
     */
	{
			while((countA != 14)||(countB != 14))
			{
				if((countA == 14)&&(countB == 14))
				{
					if(name == playerA)
					{
						playerBMissed = true;
					}
					break;
				}	
			}
			return 1;
	}
	
	public int isItMyTurn1(String name)
	/**
     * To check whether it is Player B's turn to play the game.
     * 
     *
     *
     * @return 2 if Player A has missed his chance.
     *
     */
	{
			System.out.println(playerAMissed);
			while(true)
			{
				System.out.println(playerAMissed);
				if(playerAMissed == true)
				{
					return 2;
				}
			}
			
	}
	
	public int isItMyTurn2(String name)
	/**
     * To check whether it is Player A's turn to play the game.
     * 
     *
     *
     * @return 1 if Player B has missed his chance.
     *
     */
	{
			System.out.println(playerBMissed);
			while(true)
			{
				System.out.println(playerBMissed);
				if(playerBMissed == true)
				{
					return 1;
				}
			}
			
	}
	
	public int game(int[] hit,String name)
	/**
	     * Turn for the player A to play his game
	     *
	     * @return 1 if the player A hits the ship of Player B
	     * @return 2 if the player A didnt hit the ship of Player B
	     * @return 14 if the player A won the game
	     *
	     */
	{
		while(playerBMissed == false)
		{
			//System.out.print(playerBMissed);
			if(playerBMissed == true)
			{
				break;
			}
		}
		for (int i = 0; i < 2; i++)
		{
			System.out.println(hit[i]);
		}
		if ((ocean3[hit[0]][hit[1]] == 'o') && (ocean2[hit[0]][hit[1]] != 'o'))
	    {
	    	ocean2[hit[0]][hit[1]] = 'o';
	        playerAMissed = false;
	        counterA++;
	        if(counterA >= 14)
	        {
	        	return 14;
	        }
	        return 1;
	    }	 
	    else 
	    {
	        ocean[hit[0]][hit[1]] = 'x';
	        playerAMissed = true;
	        return 2;
	    }
	}
	
	public int game1(int[] hit,String name)
	/**
	     * Turn for the player A to play his game
	     *
	     * @return 1 if the player A hits the ship of Player B
	     * @return 2 if the player A didnt hit the ship of Player B
	     * @return 14 if the player A won the game
	     *
	     */
	{
		while(playerAMissed == false)
		{
			System.out.print(playerAMissed);
			if(playerAMissed == true)
			{
				break;
			}
		}
		for (int i = 0; i < 2; i++)
		{
			System.out.println(hit[i]);
		}
		if ((ocean1[hit[0]][hit[1]] == 'o') && (ocean[hit[0]][hit[1]] != 'o'))
	    {
	    	ocean[hit[0]][hit[1]] = 'o';
	        playerBMissed = false;
	        counterB++;
	        if(counterB >= 14)
	        {
	        	return 14;
	        }
	        
	        return 2;
	    }	 
	    else 
	    {
	        ocean[hit[0]][hit[1]] = 'x';
	        playerBMissed = true;
	        return 1;
	    }
	}
}