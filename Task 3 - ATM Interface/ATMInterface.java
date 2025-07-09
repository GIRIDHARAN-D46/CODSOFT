import java.util.Scanner;
public class ATMInterface{
    private static double balance=1000.0;
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("🏧 Welcome to CodSoft ATM Interface");
        while(true){
            System.out.println("\nChoose an operation:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice=scanner.nextInt();
            switch(choice){
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Thank you for using CodSoft ATM. Goodbye! 👋");
                    System.exit(0);
                default:
                    System.out.println("❌ Invalid choice. Please try again.");
            }
        }
    }
    public static void checkBalance(){
        System.out.printf("Your current balance is ₹%.2f\n", balance);
    }
    public static void deposit(){
        System.out.print("Enter amount to deposit: ₹");
        double amount=scanner.nextDouble();
        if(amount>0){
            balance+=amount;
            System.out.printf("✅ ₹%.2f deposited successfully!\n",amount);
        } else{
            System.out.println("❌ Invalid deposit amount.");
        }
    }
    public static void withdraw(){
        System.out.print("Enter amount to withdraw: ₹");
        double amount=scanner.nextDouble();
        if(amount>0&&amount<=balance){
            balance-=amount;
            System.out.printf("✅ ₹%.2f withdrawn successfully!\n",amount);
        }else{
            System.out.println("❌ Insufficient balance or invalid amount.");
        }
    }
}
