import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("===== Welcome Customer! =====\n");
        System.out.println("Enter your username: ");
        String username = sc.next();
        
        if (username.equals("Johngwaps")) {
            System.out.println("Enter your 4-digit PIN: ");
            int password = sc.nextInt();
            
            if (password == 1123) {
                System.out.println("\nLogin Successfully! Welcome back customer :>");
               
                
                double balance = 400000.00;
                System.out.println("Your Balance is: " + balance);
                
                String tier;
                if (balance <= 100000) {
                    tier = "Bronze";
                } else if (balance <= 500000) {
                    tier = "Silver";
                } else if (balance <= 1000000) {
                    tier = "Gold";
                } else {
                    tier = "Platinum";
                }
                System.out.println("Account Status: " + tier);
                
                System.out.println("\nEnter amount to withdraw: ");
                double withdrawalAmount = sc.nextDouble();
                
                double dailyLimit = 0.0;
                if (tier.equals("Bronze")) {
                    dailyLimit = 20000.0;
                } else if (tier.equals("Silver")) {
                    dailyLimit = 50000.0;
                } else if (tier.equals("Gold")) {
                    dailyLimit = 100000.0;
                } else {
                    dailyLimit = 500000.0;
                }

                boolean isValidWithdrawal = false;
                String denialReason = null;

                if (withdrawalAmount <= 0) {
                    denialReason = "DENIED: Withdrawal amount must be greater than zero.";
                } else {
                    if (withdrawalAmount > dailyLimit) {
                        denialReason = "DENIED: Withdrawal exceeds tier-specific daily limit of " + dailyLimit + ".";
                    } else {
                        
                        isValidWithdrawal = true; 
                    }
                }
                double feePercentage = 0.0;
                switch (tier) {
                    case "Bronze":
                        feePercentage = 0.03;
                        break;
                    case "Silver":
                        feePercentage = 0.02;
                        break;
                    case "Gold":
                        feePercentage = 0.01;
                        break;
                    case "Platinum":
                        feePercentage = 0.005;
                        break;
                    default:
                        feePercentage = 0.025;
                        break;
                }
                double feeAmount = withdrawalAmount * feePercentage;
                double totalDeduction = withdrawalAmount + feeAmount;

                if (isValidWithdrawal) {
                    if (balance < totalDeduction) {
                        isValidWithdrawal = false;
                        denialReason = "Insufficient balance to cover withdrawal amount plus the transaction fee.";
                    }
                }

                if (isValidWithdrawal) {
                    balance -= totalDeduction;
                    System.out.println("\nTransaction successful!");
                    System.out.println("Fee applied (" + (feePercentage * 100) + "%): " + feeAmount);
                    System.out.println("New Balance: " + balance);
                } else {
                    System.out.println("\n" + denialReason);
                }
  } else {
                System.out.println("Wrong Password");
            }
        } else {
            System.out.println("Wrong Username");
        }
           
        
    }
}
