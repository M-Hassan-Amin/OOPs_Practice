import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class vooting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the name of Group 1: ");
        String Group_1 = scanner.nextLine();
        
        System.out.print("Enter the name of Group 2: ");
        String Group_2 = scanner.nextLine();
        
        int gr_1_votes = 0;
        int gr_2_votes = 0;
        
        List<Integer> CNIC = new ArrayList<>();
        CNIC.add(1);
        CNIC.add(2);
        CNIC.add(3);
        CNIC.add(4);
        CNIC.add(5);
        CNIC.add(6);
        CNIC.add(7);
        
        int num_of_voters = CNIC.size();
        
        for (int voter; CNIC.size() > 0; ) {
            System.out.print("Enter your CNIC no: ");
            voter = scanner.nextInt();
            
            if (CNIC.contains(voter)) {
                System.out.println("You are a registered voter.");
                CNIC.remove((Integer) voter);
                
                System.out.printf("Enter your vote (%d for %s or %d for %s): ", 1, Group_1, 2, Group_2);
                int vote = scanner.nextInt();
                
                if (vote == 1) {
                    gr_1_votes++;
                    System.out.println("Thanks for vote casting.");
                } else if (vote == 2) {
                    gr_2_votes++;
                    System.out.println("Thanks for vote casting.");
                }
            } else {
                System.out.println("You are not listed as a voter or you have already voted.");
            }
        }
        
        System.out.println("Voting session over.");
        
        double percent;
        
        if (gr_1_votes > gr_2_votes) {
            percent = (gr_1_votes / (double) num_of_voters) * 100;
            System.out.printf("%s has won with %.2f%% Votes. Number of votes is: %d\n", Group_1, percent, gr_1_votes);
        } else if (gr_2_votes > gr_1_votes) {
            percent = (gr_2_votes / (double) num_of_voters) * 100;
            System.out.printf("%s has won with %.2f%% Votes. Number of votes is: %d\n", Group_2, percent, gr_2_votes);
        }
    }
}
