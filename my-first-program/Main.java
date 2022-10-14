
/*
 * NOTES:
 * >> static functions run without creating the object of the class Main.
 * >> void is the return type of the function. We don't want to return any
 * value for the function so it is "void"
 * >> args are the arguments passed in the function ex java Main Ananta
 * >> javac -d . Main.java .. using -d flag we specify the path to store the
 * class file.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!" + args[0]);
    }
    
}