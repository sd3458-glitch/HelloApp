 /*
 HelloApp.java – A simple Java application that Displays "Hello, World!" to the console.
 @author Satviik Daga
 @version 2.0
 */
 public class HelloApp {
    public static void main(String[] args) {
        if (args.length > 0) {
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } else {
            System.out.println("Hello, World!");
        }
    }
}
