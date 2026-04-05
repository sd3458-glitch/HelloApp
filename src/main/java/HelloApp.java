 /*
 HelloApp.java – A simple Java application that Displays "Hello, World!" to the console.
 @author Satviik Daga
 @version 5.0
 */
 public class HelloApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            for (String name : args) {
                if (name != null && !name.trim().isEmpty()) {
                    System.out.println("Hello, " + name + "!");
                }
            }
        }
    }
}
