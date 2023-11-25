/*WAP to print number of days gape in your age as enter DD-MM-YYYY with current system date? */

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        int cd=java.time.LocalDate.now().getDayOfYear();
        int cy=java.time.LocalDate.now().getYear();
        System.out.println("Enter your date of birth-");
        Scanner sc=new Scanner(System.in);
        int id=sc.nextInt();
        int im=sc.nextInt();
        int iy=sc.nextInt();
        System.out.println("Your age gap is - "+(((id+cd)+((12-im)*30))+((cy-iy)*365)));
        sc.close();
    }
}
