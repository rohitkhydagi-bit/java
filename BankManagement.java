import java.util.Scanner; 
 
class BankAccount { 
    String name; 
    int accountNo; 
    double balance; 
 
    void createAccount(String n, int no, double b) { 
        name = n; 
        accountNo = no; 
        balance = b; 
    } 
 
    void deposit(double amount) { 
        balance += amount; 
        System.out.println("Amount deposited successfully."); 
    } 
 
    void withdraw(double amount) { 
        if (amount <= balance) { 
            balance -= amount; 
            System.out.println("Amount withdrawn successfully."); 
        } else { 
            System.out.println("Insufficient balance."); 
        } 
    } 
 
    void display() { 
        System.out.println("\nAccount Holder: " + name); 
        System.out.println("Account Number: " + accountNo); 
        System.out.println("Balance: ₹" + balance); 
    } 
} 
 
public class BankManagement { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        BankAccount acc = new BankAccount(); 
 
        System.out.print("Enter name: "); 
        String name = sc.nextLine(); 
 
        System.out.print("Enter account number: "); 
        int no = sc.nextInt(); 
 
        System.out.print("Enter initial balance: "); 
        double balance = sc.nextDouble(); 
 
        acc.createAccount(name, no, balance); 
 
        int choice; 
 
        do { 
            System.out.println("\n--- BANK MENU ---"); 
            System.out.println("1. Deposit"); 
            System.out.println("2. Withdraw"); 
            System.out.println("3. Display Account"); 
            System.out.println("4. Exit"); 
            System.out.print("Enter choice: "); 
            choice = sc.nextInt(); 
 
            switch (choice) { 
                case 1: 
                    System.out.print("Enter amount: "); 
                    acc.deposit(sc.nextDouble()); 
                    break; 
 
                case 2: 
                    System.out.print("Enter amount: "); 
                    acc.withdraw(sc.nextDouble()); 
                    break; 
 
                case 3: 
                    acc.display(); 
                    break; 
 
                case 4: 
                    System.out.println("Thank you!"); 
                    break; 
 
                default: 
                    System.out.println("Invalid choice."); 
            } 
        } while (choice != 4); 
 
        sc.close(); 
    } 
} 
 