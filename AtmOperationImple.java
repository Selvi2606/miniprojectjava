package atmmachineproject;

public class AtmOperationImple implements AtmOperationInterf{
	    ATM atm=new ATM();
	   
	    @Override
	    public void viewBalance() {
	        System.out.println("Available Balance is : "+atm.getBalance());

	    }

	    @Override
	    public void withdrawAmount(double withdrawAmount) {
	        if(withdrawAmount%500==0) {
	            if (withdrawAmount <= atm.getBalance()) {
	                
	                System.out.println("Collect the Cash " + withdrawAmount);
	                atm.setBalance(atm.getBalance() - withdrawAmount);
	                viewBalance();
	            } else {
	                System.out.println("Insufficient Balance !!");
	            }
	        }
	        else {
	            System.out.println("Please enter the amount in multiple of 500");
	        }

	    }

	    @Override
	    public void depositAmount(double depositAmount) {
	        
	        System.out.println(depositAmount+" Deposited Successfully !!");
	        atm.setBalance(atm.getBalance()+depositAmount);
	        viewBalance();

	    }  
	    
	    }
