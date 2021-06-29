package JavaProject;

import java.util.Scanner;

public class javaProject {

	public static void main(String[] args)  {
		System.out.println("Hello Press Enter to dive into JAVA ocean  ");
		System.out.println("Choose your level");
		try {
			Thread.sleep(500);
			System.out.println("1. Beginner");
		
		}catch(InterruptedException e)
		{
			
		}
		try {
			Thread.sleep(500);
			System.out.println("2. Intermediate");
		
		}catch(InterruptedException e)
		{
			
		}
		try {
			Thread.sleep(500);
			System.out.println("3. Advance");
		
		}catch(InterruptedException e)
		{
			
		}
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();// level choose is a
		switch(a) {
		case 1:
			System.out.println("Hey, I'm your assistant Boogle ");
			System.out.println("Welcome, You are at Beginner Level");
			System.out.println("What type of Operation You wanna do?");
			System.out.println();
	
			try {
				Thread.sleep(500);
				System.out.println("1. Arithmatic Operations");
			
			}catch(InterruptedException e)
			{
				
			}
	
			try {
				Thread.sleep(500);
				System.out.println("2. Logical Operations");
			
			}catch(InterruptedException e)
			{
				
			}
			try {
				Thread.sleep(500);
			System.out.println("3. Check the number is prime or not");
			}catch(InterruptedException e)
			{
				
			}
			System.out.println("4. Check the number is Palindrome or not");
			System.out.println("5. fabonacci Series");
			System.out.println("6. Sum of Digits");
			System.out.println("7. Factorial of a number");
			int b=sc.nextInt();
			switch(b)
			{
			case 1:
				try {
					Thread.sleep(500);
				System.out.println("1. Sum");
				}catch(InterruptedException e)
				{
					
				}
				
				try {
					Thread.sleep(500);
				System.out.println("2. Subtract");
				}catch(InterruptedException e)
				{
					
				}
				
				
				try {
					Thread.sleep(500);
				System.out.println("3. Multiplication");
				}catch(InterruptedException e)
				{
					
				}
				try {
					Thread.sleep(500);
				System.out.println("4. Divide");
				}catch(InterruptedException e)
				{
					
				}
				
				//start of switch statement
				int d=sc.nextInt();
				switch(d)
				{
				case 1:
					System.out.println("Enter Limit of numbers ");
					int n=sc.nextInt();
					int sum[]= new int[n];
					int result=0;				
					for(int i=0;i<n;i++)
					{
						System.out.println("Please Enter Number "+(i+1));
						sum[i]=sc.nextInt();
						result+=sum[i];
						
					}
					System.out.println("Result is " +result);
					break;
				case 2:
					System.out.println("NOTE:-operations mention below are only performed on two number");
				System.out.println("Enter two numbers");
					int num3=sc.nextInt();
					int num4=sc.nextInt();
					System.out.println("Result is "+(num3-num4));
					
				    break;
				case 3:
					System.out.println("NOTE:-operations mention below are only performed on two number");
					System.out.println("Enter two numbers");
					int num5=sc.nextInt();
					int num6=sc.nextInt();
					System.out.println("Result is "+(num5*num6));
					break;
				case 4:
					System.out.println("NOTE:-operations mention below are only performed on two number");
					System.out.println("Enter two numbers");
					int num7=sc.nextInt();
					int num8=sc.nextInt();
					System.out.println("Result is "+(num7/num8));
				break;	
				}
				break;
				
				
			case 2:
			
				System.out.println("Choose Gate");
				
				try {
					Thread.sleep(1000);
					System.out.println("1. AND");
				
				}catch(InterruptedException e)
				{
					
				}
				try {
					Thread.sleep(1000);
					System.out.println("2. OR");
				
				}catch(InterruptedException e)
				{
					
				}
				try {
					Thread.sleep(1000);
					System.out.println("3. NOT");
				
				}catch(InterruptedException e)
				{
					
				}
				try {
					Thread.sleep(1000);
					System.out.println("4. NAND");
				
				}catch(InterruptedException e)
				{
					
				}
				try {
					Thread.sleep(1000);
					System.out.println("5. NOR");
				}catch(InterruptedException e)
				{
					
				}
				try {
					Thread.sleep(1000);
					System.out.println("6. XOR");
				
				}catch(InterruptedException e)
				{
					
				}
				try {
					Thread.sleep(1000);
					System.out.println("7. XNOR");
				
				}catch(InterruptedException e)
				{
					
				}
				try {
					Thread.sleep(1000);
				System.out.println("8. Print all");
				}catch(InterruptedException e)
				{
				//case 2 from logical 
				
				}
				int c=sc.nextInt();// for gates switch case
				switch(c)
				{
				case 1:
					try {
						Thread.sleep(500);
					System.out.println("TRUTH TABLE:- AND ");
			System.out.println("-----------------");
			System.out.println("|INPUT  |OUTPUT |");
			System.out.println("-----------------");
			System.out.println("|X  Y   |  Z    |");
			System.out.println("|0  0   |  0    |");
			System.out.println("|0  1   |  0    |");
			System.out.println("|1  0   |  0    |");
			System.out.println("|1  1   |  1    |");
			System.out.println("-----------------");
					}catch(InterruptedException fg)
					{
						
					}
			break;
					
				case 2:
					try {
						Thread.sleep(500);
					System.out.println("TRUTH TABLE:- OR ");
					System.out.println("-----------------");
					System.out.println("|INPUT  |OUTPUT |");
					System.out.println("-----------------");
					System.out.println("|X  Y   |  Z    |");
					System.out.println("|0  0   |  0    |");
					System.out.println("|0  1   |  1    |");
					System.out.println("|1  0   |  1    |");
					System.out.println("|1  1   |  1    |");
					System.out.println("-----------------");
					}catch(InterruptedException e)
					{
						
					}
					break;
				case 3:
					try {
						Thread.sleep(500);
					System.out.println("TRUTH TABLE:- NOT");
					System.out.println("-----------------");
					System.out.println("|INPUT  |OUTPUT |");
					System.out.println("-----------------");
					System.out.println("|X     |  Z    |");
					System.out.println("|0     |  1    |");
					System.out.println("|0     |  0    |");
					}catch(InterruptedException e)
					{
						
					}
					break;
				case 4:
					try {
						Thread.sleep(500);
					System.out.println("TRUTH TABLE:- NAND");
					System.out.println("-----------------");
					System.out.println("|INPUT  |OUTPUT |");
					System.out.println("-----------------");
					System.out.println("|X  Y   |  Z    |");
					System.out.println("|0  0   |  1    |");
					System.out.println("|0  1   |  1    |");
					System.out.println("|1  0   |  1    |");
					System.out.println("|1  1   |  0    |");
					System.out.println("-----------------");
					}catch(InterruptedException e)
					{
						
					}
					break;
				case 5:
					try {
						Thread.sleep(500);
					System.out.println("TRUTH TABLE:- NOR ");
					System.out.println("-----------------");
					System.out.println("|INPUT  |OUTPUT |");
					System.out.println("-----------------");
					System.out.println("|X  Y   |  Z    |");
					System.out.println("|0  0   |  1    |");
					System.out.println("|0  1   |  0    |");
					System.out.println("|1  0   |  0    |");
					System.out.println("|1  1   |  0    |");
					System.out.println("-----------------");
					}catch(InterruptedException e)
					{
						
					}
					break;
				case 6:
					try {
						Thread.sleep(500);
					System.out.println("TRUTH TABLE:- XOR");
					System.out.println("-----------------");
					System.out.println("|INPUT  |OUTPUT |");
					System.out.println("-----------------");
					System.out.println("|X  Y   |  Z    |");
					System.out.println("|0  0   |  0    |");
					System.out.println("|0  1   |  1    |");
					System.out.println("|1  0   |  1    |");
					System.out.println("|1  1   |  0    |");
					System.out.println("-----------------");
					}catch(InterruptedException e)
					{
						
					}
					break;
				case 7:
					try {
						Thread.sleep(500);
					System.out.println("TRUTH TABLE:- XNOR ");
					System.out.println("-----------------");
					System.out.println("|INPUT  |OUTPUT |");
					System.out.println("-----------------");
					System.out.println("|X  Y   |  Z    |");
					System.out.println("|0  0   |  1    |");
					System.out.println("|0  1   |  0    |");
					System.out.println("|1  0   |  0    |");
					System.out.println("|1  1   |  1    |");
					System.out.println("-----------------");
					}catch(InterruptedException e)
					{
						
					}
				case 8:
					//1st
					try {
						Thread.sleep(500);
					System.out.println("TRUTH TABLE:- AND ");
			System.out.println("-----------------");
			System.out.println("|INPUT  |OUTPUT |");
			System.out.println("-----------------");
			System.out.println("|X  Y   |  Z    |");
			System.out.println("|0  0   |  0    |");
			System.out.println("|0  1   |  0    |");
			System.out.println("|1  0   |  0    |");
			System.out.println("|1  1   |  1    |");
			System.out.println("-----------------");
					}catch(InterruptedException e)
					{
						
					}
					
					
					//2nd
					try {
						Thread.sleep(500);
					System.out.println("TRUTH TABLE:- OR ");
					System.out.println("-----------------");
					System.out.println("|INPUT  |OUTPUT |");
					System.out.println("-----------------");
					System.out.println("|X  Y   |  Z    |");
					System.out.println("|0  0   |  0    |");
					System.out.println("|0  1   |  1    |");
					System.out.println("|1  0   |  1    |");
					System.out.println("|1  1   |  1    |");
					System.out.println("-----------------");
					}catch(InterruptedException e)
					{
						
					}
					
					//3rd
					try {
						Thread.sleep(500);
					System.out.println("TRUTH TABLE:- NOT");
					System.out.println("-----------------");
					System.out.println("|INPUT  |OUTPUT |");
					System.out.println("-----------------");
					System.out.println("|X     |  Z    |");
					System.out.println("|0     |  1    |");
					System.out.println("|0     |  0    |");
					}catch(InterruptedException e)
					{
						
					}
					
					//4th
					try {
						Thread.sleep(500);
					System.out.println("TRUTH TABLE:- NAND");
					System.out.println("-----------------");
					System.out.println("|INPUT  |OUTPUT |");
					System.out.println("-----------------");
					System.out.println("|X  Y   |  Z    |");
					System.out.println("|0  0   |  1    |");
					System.out.println("|0  1   |  1    |");
					System.out.println("|1  0   |  1    |");
					System.out.println("|1  1   |  0    |");
					System.out.println("-----------------");
					}catch(InterruptedException e)
					{
						
					}
					//5th
					try {
						Thread.sleep(500);
					System.out.println("TRUTH TABLE:- NOR ");
					System.out.println("-----------------");
					System.out.println("|INPUT  |OUTPUT |");
					System.out.println("-----------------");
					System.out.println("|X  Y   |  Z    |");
					System.out.println("|0  0   |  1    |");
					System.out.println("|0  1   |  0    |");
					System.out.println("|1  0   |  0    |");
					System.out.println("|1  1   |  0    |");
					System.out.println("-----------------");
					}catch(InterruptedException e)
					{
						
					}
					
					
					//6th
					try {
						Thread.sleep(500);
					System.out.println("TRUTH TABLE:- XOR");
					System.out.println("-----------------");
					System.out.println("|INPUT  |OUTPUT |");
					System.out.println("-----------------");
					System.out.println("|X  Y   |  Z    |");
					System.out.println("|0  0   |  0    |");
					System.out.println("|0  1   |  1    |");
					System.out.println("|1  0   |  1    |");
					System.out.println("|1  1   |  0    |");
					System.out.println("-----------------");
					}catch(InterruptedException e)
					{
						
					}
					
					//7th
					try {
						Thread.sleep(500);
					System.out.println("TRUTH TABLE:- XNOR ");
					System.out.println("-----------------");
					System.out.println("|INPUT  |OUTPUT |");
					System.out.println("-----------------");
					System.out.println("|X  Y   |  Z    |");
					System.out.println("|0  0   |  1    |");
					System.out.println("|0  1   |  0    |");
					System.out.println("|1  0   |  0    |");
					System.out.println("|1  1   |  1    |");
					System.out.println("-----------------");
					}catch(InterruptedException e)
					{
						
					}
					
					break;	
				}
				break;
				
			case 3:
				System.out.println("Enter number ");
				int e=sc.nextInt();
				boolean isPrime= true;
				for(int i=2; i*i<e ;i++)
				{
				
					if(a % i==0)
					{
						isPrime=false;
						break;
						
					}
				}
				if(e<2) isPrime=false;
				System.out.println(isPrime);
				System.out.println();
				System.out.println("1. Print code for this program");
				System.out.println("2.No Thanks");
				int ch3=sc.nextInt();
				if(ch3==1)
				{
					System.out.println("\r\n"
							+ "import java.util.Scanner;\r\n"
							+ "public class FabonacciSeries {\r\n"
							+ "\r\n"
							+ "	public static void main(String[] args) {\r\n"
							+ "		System.out.println(\"Enter number \");\r\n"
							+ "				int e=sc.nextInt();\r\n"
							+ "				boolean isPrime= true;\r\n"
							+ "				for(int i=2; i*i<e ;i++)\r\n"
							+ "				{\r\n"
							+ "				\r\n"
							+ "					if(a % i==0)\r\n"
							+ "					{\r\n"
							+ "						isPrime=false;\r\n"
							+ "						break;\r\n"
							+ "						\r\n"
							+ "					}\r\n"
							+ "				}\r\n"
							+ "				if(e<2) isPrime=false;\r\n"
							+ "				System.out.println(isPrime);\r\n"
							+ "\r\n"
							+ "	}\r\n"
							+ "\r\n"
							+ "}\r\n"
							+ "");
				}
				else {
					break;
				}
				break;
			case 4:
				
				System.out.println("Enter a number ");
				int num=sc.nextInt();
				int temp=num;
				int reverseNum=0;
				while(temp>0)
				{
					int LastDigit=temp%10;
					reverseNum=reverseNum*10+LastDigit;
					temp=temp/10;
					
				}
				
				if(reverseNum == num)
				{
					System.out.println(num +" is Palindrome");
				}
				else 
				{
					System.out.println(num+" is not Palindrome");
				}
				System.out.println("1. Print code for this program");
				System.out.println("2. No please ");
			int ch=sc.nextInt();
			if(ch==1)
			{
				System.out.println("\r\n"
						+ "\r\n"
						+ "import java.util.Scanner;\r\n"
						+ "\r\n"
						+ "public class PalindromeNumber {\r\n"
						+ "\r\n"
						+ "	public static void main(String[] args) {\r\n"
						+ "		System.out.println(\"Enter Number\");\r\n"
						+ "		Scanner sc = new Scanner(System.in);\r\n"
						+ "		int n=sc.nextInt();\r\n"
						+ "		int temp=n;\r\n"
						+ "		int reverseNumber=0;\r\n"
						+ "		while(temp>0)\r\n"
						+ "		{\r\n"
						+ "			int lastDigits=temp%10;\r\n"
						+ "			\r\n"
						+ "			reverseNumber =reverseNumber*10+ lastDigits;\r\n"
						+ "			temp=temp/10;\r\n"
						+ "		}\r\n"
						+ "		\r\n"
						+ "		if(reverseNumber ==n)\r\n"
						+ "		{\r\n"
						+ "			System.out.println(n+\" is Palindrome \");\r\n"
						+ "			\r\n"
						+ "		}\r\n"
						+ "		else\r\n"
						+ "		{\r\n"
						+ "			System.out.println(n+\"is not Palindrome\");\r\n"
						+ "		}\r\n"
						+ "	}\r\n"
						+ "\r\n"
						+ "}\r\n"
						+ "");
			}
			else
			{
				break;
			}
				
			break;
			case 5:
				System.out.println("Enter number");
				int num2=sc.nextInt();
				int a1=0;
				int b1=1;
				System.out.print(a1+" ");
				System.out.print(b1+" ");
				for(int i=0;i<num2-2;i++)
				{
					int c1=a+b;
					
					a1=b1;
					b1=c1;
					System.out.print(c1+" ");
				}
				break;
			case 6:
				System.out.println("Enter a number ");
				int num1=sc.nextInt();
				int temp1=num1;
				int sum=0;
				while(temp1>0)
				{
					int LastDigit1=temp1%10;
					sum=sum+LastDigit1;
					temp1=temp1/10;
					
				}
				System.out.println("Sum of Digits is "+ sum);
				System.out.println("1. Print code for this program");
				System.out.println("2. No Thanks ");
				int ch1=sc.nextInt();
				if(ch1==1)
				{
					System.out.println();
					System.out.println();
					System.out.println("\r\n"
							+ "import java.util.Scanner;\r\n"
							+ "//import java.math.*;\r\n"
							+ "public class SumOfDigits {\r\n"
							+ "\r\n"
							+ "	public static void main(String[] args) {\r\n"
							+ "		System.out.println(\"Enter Number\");\r\n"
							+ "		Scanner sc = new Scanner(System.in);\r\n"
							+ "		int n=sc.nextInt();\r\n"
							+ "		int temp=n;\r\n"
							+ "		int sum=0;\r\n"
							+ "		//System.out.println(\"Formula for DigitsCount log10(n)+1\");\r\n"
							+ "	//log10(n)=10^x=n\r\n"
							+ "		//System.out.println(\"NumberOfDigits are\");\r\n"
							+ "		//int numberOfDigits = (int)Math.log(n)+1;\r\n"
							+ "		//System.out.println(numberOfDigits);\r\n"
							+ "\r\n"
							+ "		while(temp>0)\r\n"
							+ "		{\r\n"
							+ "			int lastDigit =temp % 10;\r\n"
							+ "			temp=temp/10;\r\n"
							+ "			sum=sum+lastDigit;\r\n"
						
							+ "		}\r\n"
							
							+ "		System.out.println(\"Sum of digits of \"+ sum);\r\n"
							
							+ "	}\r\n"
						
							+ "}\r\n"
							+ "");
				}
			break;
			case 7:
				System.out.println("Enter number");
				int nu=sc.nextInt();
				int fact=1;
				for(int i=nu; i>=1;i--)
				{
					fact=fact*i;
				}
				System.out.println(fact);
				System.out.println();
				System.out.println("1.Print code for this program");
				System.out.println("2. No thanks");
				int ch2=sc.nextInt();
				if(ch2==1)
				{
					System.out.println("\r\n"
							+ "import java.util.Scanner;\r\n"
							+ "public class FactorialOfNumber {\r\n"
							+ "	public static void main(String[] args) {\r\n"
							+ "		Scanner sc=new Scanner(System.in);\r\n"
							+ "		int n = sc.nextInt();\r\n"
							+ "		int fact=1;\r\n"
							+ "		for(int i=n ; i>=1; i--)\r\n"
							+ "		{\r\n"
							+ "		 fact=fact*i;\r\n"
							+ "		}\r\n"
							+ "		System.out.println(\"Factorial of a number is \"+fact);\r\n"
							+ "	}\r\n"
							+ "}\r\n"
							+ "\r\n"
							+ "");
				}
				else {
					break;
				}
				
				
			break;
			}
	break;
		
		case 2:
			System.out.println("Hey, I'my your assistant Boogle "); 
			System.out.println("Welcome, You are at Intermediate Level");
			System.out.println();
			System.out.println("1.Array");
			System.out.println("2.String");
			int d=sc.nextInt();
			switch(d) {
			case 1:
				System.out.println("1.Reverse a Array");
				System.out.println("2.Find the maximun and minimun element in the array ");
				System.out.println("3. Find the K^th maximun and minimun element in the array ");
				int array=sc.nextInt();
				switch(array)
				{
				case 1:
					System.out.println("Enter limit of number(n)");
					int n=sc.nextInt();
					System.out.println("Enter elements in array");
					int arr[]=new int[n];
				
					int temp;
					for(int i=0;i<n;i++)
					{
						arr[i]=sc.nextInt();
					}
					System.out.println("--------");
					for(int i=0;i<arr.length/2;i++)
					{
						
							temp=arr[i];
							arr[i]=arr[arr.length-1-i];
							arr[arr.length-1-i]=temp;
					}
					for(int i=0;i<n;i++)
					{
						System.out.println(arr[i]);
					}
					System.out.println();
					System.out.println("1. Print code for this program");
					System.out.println("2. No thanks");
					int ch3=sc.nextInt();
					if(ch3==1) {
						System.out.println("\r\n"
								+ "import java.util.Scanner;\r\n"
								+ "public class FabonacciSeries {\r\n"
								+ "\r\n"
								+ "	public static void main(String[] args) {\r\n"
								+ "		System.out.println(\"Enter limit of number(n)\");\r\n"
								+ "					int n=sc.nextInt();\r\n"
								+ "					System.out.println(\"Enter elements in array\");\r\n"
								+ "					int arr[]=new int[n];\r\n"
								+ "				\r\n"
								+ "					int temp;\r\n"
								+ "					for(int i=0;i<n;i++)\r\n"
								+ "					{\r\n"
								+ "						arr[i]=sc.nextInt();\r\n"
								+ "					}\r\n"
								+ "					System.out.println(\"--------\");\r\n"
								+ "					for(int i=0;i<arr.length/2;i++)\r\n"
								+ "					{\r\n"
								+ "						\r\n"
								+ "							temp=arr[i];\r\n"
								+ "							arr[i]=arr[arr.length-1-i];\r\n"
								+ "							arr[arr.length-1-i]=temp;\r\n"
								+ "					}\r\n"
								+ "					for(int i=0;i<n;i++)\r\n"
								+ "					{\r\n"
								+ "						System.out.println(arr[i]);\r\n"
								+ "					}\r\n"
								+ "		\r\n"
								+ "		\r\n"
								+ "\r\n"
								+ "	}\r\n"
								+ "\r\n"
								+ "}\r\n"
								+ "");
					}
					
					break;
				case 2:
					System.out.println("Enter limit of number(n)");
					int n1=sc.nextInt();
					System.out.println("Enter elements in array");
					int arr1[]=new int[n1];
				
					int temp1;
					for(int i=0;i<n1;i++)
					{
						arr1[i]=sc.nextInt();
					}
					temp1=arr1[0];
					int temp2=arr1[0];
					System.out.println("--------");
					for(int i=0;i<n1;i++)
					{
						if(temp1<=arr1[i])
						{
							temp1=arr1[i];
							
							
						}
						
					}
					for(int i=0;i<n1;i++)
					{
						if(temp2<=arr1[i])
						{
							
						}
						else {
							temp2=arr1[i];
						}
						
						}
					System.out.println("Minimum element is "+temp2);		
					System.out.println("Maximun element is "+temp1);
					System.out.println();
					System.out.println("1. Print code for this program");
					int ch4=sc.nextInt();
					if(ch4==1)
					{
						System.out.println("					public static void main(String[] args) {\r\n"
								+ "                                       System.out.println(\"Enter limit of number(n)\");\r\n"
								+ "					int n1=sc.nextInt();\r\n"
								+ "					System.out.println(\"Enter elements in array\");\r\n"
								+ "					int arr1[]=new int[n1];\r\n"
								+ "				\r\n"
								+ "					int temp1;\r\n"
								+ "					for(int i=0;i<n1;i++)\r\n"
								+ "					{\r\n"
								+ "						arr1[i]=sc.nextInt();\r\n"
								+ "					}\r\n"
								+ "					temp1=arr1[0];\r\n"
								+ "					int temp2=arr1[0];\r\n"
								+ "					System.out.println(\"--------\");\r\n"
								+ "					for(int i=0;i<n1;i++)\r\n"
								+ "					{\r\n"
								+ "						if(temp1<=arr1[i])\r\n"
								+ "						{\r\n"
								+ "							temp1=arr1[i];\r\n"
								+ "							\r\n"
								+ "							\r\n"
								+ "						}\r\n"
								+ "						\r\n"
								+ "					}\r\n"
								+ "					for(int i=0;i<n1;i++)\r\n"
								+ "					{\r\n"
								+ "						if(temp2<=arr1[i])\r\n"
								+ "						{\r\n"
								+ "							\r\n"
								+ "						}\r\n"
								+ "						else {\r\n"
								+ "							temp2=arr1[i];\r\n"
								+ "						}\r\n"
								+ "						\r\n"
								+ "						}\r\n"
								+ "					System.out.println(\"Minimum element is \"+temp2);		\r\n"
								+ "					System.out.println(\"Maximun element is \"+temp1);");
					}
					else {
						break;
					}
					break;
				case 3:
					
//					System.out.println("Enter limit of number(n)");
//					int n2=sc.nextInt();
//					System.out.println("Enter elements in array");
//					int arr2[]=new int[n2];
//				
//					int temp3;
//					for(int i=0;i<n2;i++)
//					{
//						arr2[i]=sc.nextInt();
//					}
//					temp1=arr2[0];
//					 temp3=arr2[0];
//					 System.out.println("Enter k");
//					 int k=sc.nextInt();
//					System.out.println("--------");
//					
//					for(int i=0;i<k;i++)
//					{
//						if(temp1<=arr2[i])
//						{
//							temp1=arr2[i];
//							
//							
//						}
//						
//					}
//					for(int i=0;i<k;i++)
//					{
//						if(temp3<=arr2[i])
//						{
//							
//						}
//						else {
//							temp3=arr2[i];
//						}
//						
//						}
//					System.out.println("Minimum element is "+temp3);		
//					System.out.println("Maximun element is "+temp1);
					break;
					
				}
			}
			break;
		case 3: 
			System.out.println("Hey, I'm your assistant Boogle ");
			System.out.println("Welcome, You are at Advance level");
			break;
		}
		
		

	}

}
