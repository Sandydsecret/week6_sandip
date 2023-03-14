package week_6;

/**
 * Write java programme using following steps.
 *1.1 Declare two instance variable
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variable into the instance method inside the print statement.
 * 1.4 Declare the main method.
 * 1.5 Call the above instance method into the main method and run the programme.
 */

public class Prog_1 {

    int a = 10;            //1.1 Declare two instance variables
    int b = 20;

    //1.2 Declare onr instance method.
    //1.3 Call both instance variables into the instance method inside the print statement
    public void instanceMethod(){
        System.out.println(a);
        System.out.println(b);
    }
    //1.4 Declare the main method.
    //1.5 Call above instance method into the main method and Run the programme.
    public static void main(String[] args) {
        Prog_1 programme_1 = new Prog_1();
        programme_1.instanceMethod();

    }
}