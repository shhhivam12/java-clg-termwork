/* WAP to put one Exception class in a package and to use this Exception class object in an another package class 
method any how? */

// package 1
//package customexceptiontermwork;

public class Q10 extends Exception{
    Q10(String s){
        super(s);
    }
}

//package 2
//import com.customexceptiontermwork.Q10;
class MainClass{
    public void performOperation() {
        try {
            // Some code that may throw the custom exception
            throw new Q10("This is a custom exception");
        } catch (Q10 e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }
}
