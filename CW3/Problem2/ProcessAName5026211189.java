import java.util.*;

public class ProcessAName5026211189 {
    
    
public static void main(String args []) {
        Scanner console = new Scanner(System.in);

        System.out.print("Type your name: ");
        String name = console.nextLine();
        
        String[] kata = name.split(" ");
        String kata1 = kata[0];
        String kata2 = kata[1];

        String awalhuruf = kata1.substring(0,1);


        System.out.print("Your name is: " + kata2 + ", " + awalhuruf + ".");
    }
}
