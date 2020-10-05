import java.util.*;
class Bank
{


	
	public static void main(String[] args)
	{
				int ac_no[]=new int[100];
		String holder_name[]=new String[100];
		String emailAd[]=new String[100];
		char type[]=new char[100];
		int deposit_am[]=new int[100];
		int age[]=new int[100];
		double ph_no[]=new double[100];
		int choice,i=0,temp=0,a;
		int j=0;
		boolean flag=false;
		Deposite ob2=new Deposite();
		Withdraw ob3=new Withdraw(); 
		Random Rand=new Random();
		
		System.out.println("\n\n\n\n\n******** BANK MANAGMENT SYSTEM***********\n\n");
		System.out.println("Brought to you by:\n\n");
		while(flag==false)
		{

			System.out.println("   Main  MENU\n\n   1-NEW ACCOUNT\n   2-DEPOSITE amount\n   3-WITHDRAW amount\n   4-BALANCE ENQUIRY\n   5-ACCOUNT HOLDER DETAILS\n   6-ALL ACCOUNT HOLDER DETAILS\n   7-EXIT\n   Select Your Option(1-7)");
			try
			{
			Scanner sc=new Scanner(System.in);
			choice=sc.nextInt();
			
			switch(choice)
			{
				case 1:  System.out.println("______________________________Thank you for choosing our bank_________________________________");
				System.out.println("Enter the account holder name  ");
				sc.nextLine();
				 holder_name[i]=sc.nextLine();
				System.out.println("Enter the type of account[ C/S]");
				 type[i]=sc.next().charAt(0);
				System.out.println("Enter the deposit amount----- >=500 for Saving and >=1000 for current  ");
				ob2.amt[i]=sc.nextInt();
				System.out.println("enter your 10 digit phone number");
				 ph_no[i]=sc.nextDouble();
				System.out.println("enter email address");
				 emailAd[i]=sc.next();	
				System.out.println("enter your age");
				 age[i]=sc.nextInt();
				 ac_no[i]=Rand.nextInt(9000000)+1000000;
				System.out.println("**account created succesfully**"+"\nYour Account Number Is -->"+ ac_no[i]);
				i++;
				temp=i;
				break;
				case 2:System.out.println("enter account number please: ");
					a=sc.nextInt();
					for(j=0;j<=99;j++)
					{
						if( ac_no[j]==a)
							break;
					}
					if(j!=100)
					{

					System.out.println("enter amount to be Deposited");
					 deposit_am[j]=sc.nextInt();
					ob2.amt[j]=ob2.amt[j]+ deposit_am[j];
					System.out.println("amount deposited successfull\nyour new account balance is  "+ob2.amt[j]+"\n\n\n");
				
					
					break;
					}
					else
					{
					System.out.println("Error!..create an account first");
					
					break;
					}
				
			
				
					case 3 :System.out.println("enter account number please");
					a=sc.nextInt();
					for(j=0;j<=99;j++)
					{
						if( ac_no[j]==a)
							break;
					}
					if(j!=100)
					{
						if(ob2.amt[j]==0)
						{
							System.out.println("your Account balance is 0\nWithdrawl not possible");
							break; 
						}
						else
						{
							System.out.println("Enter the amount to be Withdraw");
							ob3.wd_amt[j]=sc.nextInt();
							if(ob3.wd_amt[j]>ob2.amt[j])
							{
								System.out.println("Insufficient Balance in your Account!!\n\n");
								break;
							}
							ob2.amt[j]=ob2.amt[j]-ob3.wd_amt[j];
							System.out.println("amount Withdrawn rs "+ob3.wd_amt[j]+"\n   New Account Balance Is Rs "+ob2.amt[j]);
							break;
						}
					}	
					else
					{
						System.out.println("Error! account not created \n    CREATE AN ACCOUNT FIRST");
						break;
					}
			
				
				case 4 :System.out.println("enter account number please");
						a=sc.nextInt();
						for(j=0;j<=99;j++)
					{
						if( ac_no[j]==a)
							break;
					}
					if(j!=100)
					{
						System.out.println("\nYour Account Balance is "+ob2.amt[j]);
						break;
					}
					else
					{
					System.out.println("Error!...create an account first ");
					break;
					}
				case 5:System.out.println("enter account number please");
						a=sc.nextInt();
						for(j=0;j<=99;j++)
					{
						if( ac_no[j]==a)
							break;
					}
					if(j!=100)
					{
						System.out.println("Account Number---"+ ac_no[j]+"\nAccount Holder Name---"+ holder_name[j]+"\nAccount Type---"+ type[j]+"\nAccount Balance---"+ob2.amt[j]+"\nPhone number---"+ ph_no[j]+"\nEmail Address---"+ emailAd[j]+"\nAge---"+ age[j]+"\n\n");
						break;
					}
					else
					{	
				
					System.out.println("Error!..Create an account first ");
					break;
					}
				case 6:for(j=0;j<i;j++)
						{
							System.out.println("\n\nAccount Number---"+ ac_no[j]+"\nAccount Holder Name---"+ holder_name[j]+"\nAccount Type---"+ type[j]+"\nAccount Balance---"+ob2.amt[j]+"\nPhone number---"+ ph_no[j]+"\nEmail Address---"+ emailAd[j]+"\nAge---"+ age[j]+"\n\n");
							System.out.println("----------------------------------------------------------");

						}  
						break;
			
				
				case 7:
						System.out.println("\n\n********Good Bye! Please Visit Us Again*********\n");

				flag=true;
				break;		
				
				default:System.out.println("wrong input");
				break;
				
			}
			}	 
			catch(Exception e)
			{
				System.out.println("\nSomthing went wrong please try again!!\n\nF0llowing Exceptions Occured...\n");
				e.printStackTrace();
			}

		}
		

	}


}