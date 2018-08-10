/**
 * filename abstractgame.java
 *
 * Version: v 1.1
 *          $Id$
 *
 *		    Revision 1.1  2016/11/14 20:20:20
 *          Initial revision
 *


 * This is the Interface class which has all the methods declarations in it.
 *
 * @author    Geeta Madhav Gali
 * @author	  Sanjay Varma Rudraraju
 *
 */

import java.rmi.*; 


public interface guiInterface extends Remote
{
	
	public void setName(String name) throws Exception;
	
	public void setName1(String name) throws Exception;
	
	public char[][] initialize(int row, int column) throws Exception;
	
	public boolean ship(int x, int y, int orientation, int length) throws Exception;
	
	public char[][] initialize1(int row, int column) throws Exception;
	
	public boolean ship1(int x, int y, int orientation, int length) throws Exception;
	
	public int isItMyTurn(String name) throws Exception;
	
	public int isItMyTurn1(String name) throws Exception;
	
	public int isItMyTurn2(String name) throws Exception;
	
	public int game(int[] hit,String name) throws Exception;
	
	public int game1(int[] hit,String name) throws Exception;
}