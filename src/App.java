
import java.util.Scanner;
import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {
       Scanner tb = new Scanner(System.in);
        if (6>=3) {
            System.out.println("hello world");
        }


        System.out.println("What is your name?"); // noname
        String username = tb.nextLine();
       
        System.out.println("What is your lastname?"); //nopass
        String lastname = tb.nextLine();
        
        if( username.equals("noname") && lastname.equals("nopass") ){
            System.out.println("Welcome " + username);

        }
        else{
            System.out.println("Wrong username or password...");
        }

      
        for(int i = 0 ; i <32; i++) { // loop 32 times

            System.out.println("1+");
            i++;
        }
        

        for(int i = 0; i < 5; i++) {  // loop 5 times

            System.out.println("Skriv ett tal");
            String userInput = tb.nextLine();

            try {
                int numb = Integer.parseInt(userInput); //konverterar string till int
                if (numb > 5) {
                    System.out.println("Högre än 5!");
                }

            } catch (NumberFormatException e) { // inte ett hel tal
                // TODO: handle exception
                System.out.println("Ogiltig input! skriv in ett heltal");
            }
        }


        boolean invalidInput = true;
        while (invalidInput) {
            System.out.println("Skriv in ett heltal:");
            String input = tb.nextLine();

            try{
                int number = Integer.parseInt(input);
                invalidInput = false;
                System.out.println("Du skrev talet " + number);
                System.out.println("loop avslutad");
            }
           
            catch (NumberFormatException e) {
                // TODO: handle exception
                System.out.println("Ogiltig input skriv in ett heltal!");
            }
        }

        Random random = new Random();
        int max = 10;
        int min = 1;
        System.out.println("Genererar ett tal mellan 1-10...");
        
        int rättSiffra = random.nextInt(max - min + 1)+ min; // genererar ett tal mellan 1-10
        System.out.println("Gissa ett tal mellan 1-10!");
        tb.nextInt();


        int gissning =0, försök = 0;
        while((gissning = tb.nextInt()) != rättSiffra){
            försök++;

            if (gissning < rättSiffra){
                System.out.println("för lågt! gissa på något högre");
            }
            if (gissning > rättSiffra){
                System.out.println("för högt! gissa på något lägre");
            }
        }

       System.out.println(" Grattis du gissde på " + (försök+1) + " försök");

        tb.close();
    }
}
