package week_6;
/* Write a Java program to display the following pattern.
Sample Pattern :
J a v v a
J a a v v a a
J J aaaaa V V aaaaa
J J a a V a a
 */

public class Prog_11 {
    public static void main(String[] args) {
        Prog_11 t = new Prog_11();
        System.out.println("---------------------------------------------");
        t.javaPattern();
    }                                           // Printing the Java Pattern
    public void javaPattern() {
        System.out.println("J  a  v   v a");
        System.out.println("J a a  v v a a");
        System.out.println("J J aaaaa  V V aaaaa");
        System.out.println("J J a   a  V a  a");
    }
}