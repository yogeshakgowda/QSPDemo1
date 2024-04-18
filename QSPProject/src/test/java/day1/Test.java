package day1;

import java.util.Scanner;

public class Test {

	public static void box(int row ,int coloumn)
	{ 
		for (int i = 1; i <= row; i++)
		{ 
			for (int j = 1; j <= coloumn; j++)
			{  
				if(i==1|| j==1 || i==row || (j>row/2 && i==row/2) || (j==coloumn &&i>row/2))
				{
					System.out.print(" . ");

				} 
				else
				{
					System.out.print("   ");

				}

			}
			System.out.println();
		}
		 
		System.out.println("\n");
		for (int i = 1; i <= row; i++)
		{ 
			for (int j = 1; j <= coloumn; j++)
			{  
				if(i==1 || j==1 || i==row/2 || j== coloumn)
				{
					System.out.print(" . ");

				} 
				else
				{
					System.out.print("   ");

				}

			}
			System.out.println();
		}
		
		
		
		System.out.println("\n");
		for (int i = 1; i <= row; i++)
		{ 
			for (int j = 1; j <= coloumn; j++)
			{  
				if( j==1 || i==j || j== coloumn)
				{
					System.out.print(" . ");

				} 
				else
				{
					System.out.print("   ");

				}

			}
			System.out.println();
		}
		
		
		
		System.out.println("\n");
		for (int i = 1; i <= row; i++)
		{ 
			for (int j = 1; j <= coloumn; j++)
			{  
				if(i==1 || j==2 || i==row || j== coloumn)
				{
					System.out.print(" . ");

				} 
				else
				{
					System.out.print("   ");

				}

			}
			System.out.println();
		}
		
		System.out.println("\n");
		for (int i = 1; i <= row; i++)
		{ 
			for (int j = 1; j <= coloumn; j++)
			{  
				if( j==1 || i==row || j== coloumn)
				{
					System.out.print(" . ");

				} 
				else
				{
					System.out.print("   ");

				}

			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the number of rows :");
		int rows= sc.nextInt();
		System.out.println("enter number of coloumns");
		int coloumn =sc.nextInt();
		box(rows,coloumn);
		sc.close();
	}
}
