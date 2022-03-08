import java.util.Scanner;

public class App {
    /**
     * Create a User Account class that has a 
     * username and password. (has initial values)
     * Program should be able to set the values for
     * username and password.
     * Ask for username and password.
     * Perform validation
     */
    /**
     * Breakdown
     *  1. New Java file with class name Account, and filename to be account.java.
     *  2. Set up setters, getters.
     *  3. Set up prompts i.e. Scanner class implementation ask for user input.
     *  4. Store input to variables
     *  5. Peform validation -> username input = username set, if password == password set
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        /**
         * perform instantiation of Account class
         */
        Account accnt = new Account();
        Employee emp = new Employee();
        /**
         * Initialize values for username and password
         */
        accnt.setUsername("John Doe");
        accnt.setPword("thereisnospoon");

        // System.out.println("user name : " + accnt.getUsername());
        // System.out.println("password : " + accnt.getPword());
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Credentials");
        System.out.print("Username: ");
        String inputUserName = sc.nextLine();
        System.out.print("Password: ");
        String inputPassword = sc.nextLine();
        /**
         * Use getters to get initial value
         */
        String orgUname = accnt.getUsername();
        String orgPword = accnt.getPword();

        if(orgUname.equals(inputUserName) && orgPword.equals(inputPassword) ){
            System.out.println("Credentials are OK.");
        }else{
            System.out.println("Credentials are BAD.");
        }


        
    }
}
