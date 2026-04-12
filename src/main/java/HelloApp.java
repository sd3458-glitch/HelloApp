/*
 HelloApp.java – A simple Java application that Displays "Hello, World!" to the console.
 @author Satviik Daga
 @version 5.0
*/

public class HelloApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        StringBuilder names = new StringBuilder();
        boolean first = true;

        for (String name : args) {
            if (!name.trim().isEmpty()) {
                if (!first) {
                    names.append(", ");
                }
                names.append(name);
                first = false;
            }
        }

        System.out.println("Hello, " + names + "!");
    }
}