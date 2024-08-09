package softronix.exception;

class InsufficientFundExceptions extends Exception
{
	InsufficientFundExceptions(String excep_details)
	{
		super(excep_details);
	}
	
}
class Transactions
{
	String accHolderName;
	String accNo;
	String accType;
	int balance;
	
	Transactions(String accHolderName,String accNo,String accType,int balance)
	{
		this.accHolderName=accHolderName;
		this.accNo=accNo;
		this.accType=accType;
		this.balance=balance;
	}
	public void withdrown(int amtWtd)
	{
		try {
			System.out.println("==============Transaction Details====================");
			System.out.println("Account Holder Name :"+accHolderName);
			System.out.println("Account Number      :"+accNo);
			System.out.println("Account Type        :"+accType);
			System.out.println("Transaction Status  :WITHDROW" );
			System.out.println("Account Balance     :"+balance);
			
			if(amtWtd <=balance) //5000 <=2000
			{
				balance=balance-amtWtd; //2000-200 --->18000
				System.out.println("Total Balance :"+balance);
				System.out.println("!!----------------Transaction Successful-------------!!");
			}
			else
			{
				System.out.println("!!----------------Transaction Failuer-------------!!");
				throw new InsufficientFundExceptions("InsufficientBalance");
			}
			
		} catch (InsufficientFundExceptions e) {
			
              System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("!!-----------Thank You Visit Again------------!!");
		}
	}
	
}
public class UserDemoException {

	public static void main(String[] args) {
		Transactions ts=new Transactions("Sudhir Koche","299100012963","Saving",5000);
		ts.withdrown(600);
		

	}

}