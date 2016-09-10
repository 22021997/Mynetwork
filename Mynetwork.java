import java.io.*;
import java.util.Scanner;
class person
{	
	public String []arr= new String[6];
	public static String user;
	public static String dis;
	public static String pass;

public static void Login(String usename,String display,String password)
{	System.out.println("Welcome to the login page of Mynetwork");

System.out.println("1) Login \n 2)Sign up");
	
	int choice=0;
	Scanner input1= new Scanner(System.in);
	choice=input1.nextInt();
	if(choice==1)
	{

	}
	else
	{

	}
	
}


public static void main(String args[]) throws IOException
{

		//this.Login();
	FileWriter obj = new FileWriter("data.txt",true)	;
	Scanner input= new Scanner(System.in);
	System.out.println("Welcome to Mynetwork ");

	System.out.println("1) Login \n2) Sign up");
		int choice=input.nextInt();
		if(choice==1)
		{

		}
		else
		{
		
		
		

		System.out.println("Enter Username");
		 user = input.next();
		System.out.println("Enter display name");
		dis = input.next();
		System.out.println("Enter Password ");
		pass = input.next();
		//obj.append("\r\n");
		
		obj.append(user + ',' + dis + ',' + pass);
		obj.append("\r\n");
		choice--;
	}
		

		
		obj.close();

}
	
}

