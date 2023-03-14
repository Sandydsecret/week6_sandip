package week_6;

/**
 * Write a java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the print statement.
 * 3.5 Declare the main method.
 * 3.6 Call both instance and static methods into the main method and run the programme.
 */
public class Prog_3 {
    //3.1 Declare one instance and one static variable.
    String name = "Prime";
    static String surname = "Testing";

    //3.2 Declare one instance method.
    //3.4 Call both instance and static variables into both instance and static methods inside the print statement.
    public void instanceMethod(){
        System.out.println(name);
        System.out.println(Prog_3.surname);
    }
    //3.3 Declare one static method
    //3.4 call both instance and static variables into the both instance and static methods inside the print statement.
    public static void staticMethod(){
        Prog_3 creation = new Prog_3();
        System.out.println(creation.name);
        System.out.println(surname);

    }
    //3.5 Declare the main method
    //3.6 Call both instance and static method into the main method and run the programme.
    public static void main(String[] args) {
        Prog_3 creative = new Prog_3();
        creative.instanceMethod();
        staticMethod();
    }

}
