/**
 * filename abstractgame.java
 *
 * Version: v 1.1
 *          $Id$
 *
 *		    Revision 1.1  2016/11/14 20:20:20
 *          Initial revision
 *


 * This is the Server class which will create the server between the clients and the main class.
 *
 * @author    Geeta Madhav Gali
 * @author	  Sanjay Varma Rudraraju
 *
 */

import java.rmi.*; 

public class Server
{
	public static void main(String[] args) throws Exception
	{
		AddC obj = new AddC();
		Naming.rebind("Add1",obj);
		AddC obj1 = new AddC();
		Naming.rebind("Add",obj1);
		System.out.println("Server Started");
	}
}
