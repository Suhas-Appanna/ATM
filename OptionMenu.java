import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account{
    Scanner menuInput = new Scanner(System.in);
    HashMap<Integer, Integer> data = new HashMap<Integer,Integer>();

    public void getLogin() throws IOException{
        int x = 1;
        while(x==1){
            try{
                data.put(952141, 191904);
                data.put(989947, 71976);

                System.out.println("Welcome to the ATM project");
                System.out.println("Enter your Customer Number");

                Scanner val= new Scanner(System.in);
                setCustomerNumber(val.nextInt());

                System.out.println("Enter your Pin Number: ");
                setPinNumber(val.nextInt());
            }catch(Exception e){
                System.out.println("\n" + "Invalid Characters" + "\n");
                x = 2;
            }
            int cn = getCustomerNumber();
            int pn = getPinNumber();
            if(data.containsKey(cn) && data.get(cn)==pn){
                getAccountType();
                x = 2;
            }else {
            System.out.println("\n" + "Wrong Customer Number or Pin Number" + "\n");
            }
        } 
     
    }
    public void getAccountType(){
        System.out.println("Select the account you want to access: ");
        System.out.println("Type-1 - Checking Account");
        System.out.println("Type-2 - Saving Account");
        System.out.println("Type-3 - Exit");
        
        int selection = menuInput.nextInt();

        switch(selection){
            case 1: 
                getChecking();
                break;
            case 2:
                getSaving();
                break;
            case 3:
                System.out.println("Thank you for using this ATM, Have a good day!");
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
    public void getChecking(){
        System.out.println("Checking Account: ");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw Amount");
        System.out.println("Type 3 - Deposit Amount");
        System.out.println("Type 4 - Exit");
        System.out.println("Choice: ");
      
        int selection = menuInput.nextInt();

        switch (selection) {
            case 1:
                System.out.println("Checking Account Balance: " + getCheckingBalance());
                getAccountType();
                break;
            case 2:
                getCheckingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getCheckingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank you for using this ATM, Have a nice day!");
                break;
        
            default:
                System.out.println("\n" + "Invalid Choice" + "\n");
                
        }
    }
    public void getSaving(){
        System.out.println("Saving Account: ");
        System.out.println("Type 1- View balance");
        System.out.println("Type 2- Withdraw Amount");
        System.out.println("Type 3- Deposit Amount");
        System.out.println("Type 4- Exit");
        System.out.println("Choice: ");

        int selection = menuInput.nextInt();
        

        switch (selection) {
            case 1:
                System.out.println("Savings Account Balance: " + getSavingBalance());
                getAccountType();
                break;
            case 2:
                getSavingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getSavingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank you for using this ATM, Have a nice day!");
                break;
            default:
                System.out.println("\n" + "Invalid Choice" + "\n");
                //getAccountType();
        }
    }
}
