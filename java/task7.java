import java.util.Scanner;

public class task7{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter Address");
        String address = scanner.nextLine();
        System.out.print("Enter Subject");
        String subject = scanner.nextLine();
        
        
        System.out.print("Write the application");
        String application = scanner.nextLine();
        
        
        System.out.print("Enter Your Name");
        String name = scanner.nextLine();
        
        System.out.println("-----------------------------------------------------------");
        System.out.println("To,");
        System.out.println("The Principal,");
        System.out.println("Mehran Public Secondary School,");
        System.out.println("Address: " + address + "\n");
        System.out.println("Subject: \t\t\t\t\t" + subject + "\n");
        System.out.println("Respected (Sir/madam),");
        System.out.println(application + "\n");
        System.out.println("\t\t\tThanking you,\n");
        System.out.println("Yours sincerely,");
        System.out.println(name + "\n");
        System.out.println("-----------------------------------------------------------");
        
        
        scanner.close();
    }
}