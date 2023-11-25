/*11.	WAP to initialize 2D string array at runtime and to print reverse value of diagonal position only? */

import java.util.Scanner;

public class Q11 {
    public static void main(String[] s) {
        Scanner sc =new Scanner(System.in);
        System.out.println("number of rows");
        int rows=sc.nextInt();
        System.out.println("number of coloums");
        int coloums=sc.nextInt();
        String args[][]=new String[rows][coloums];

        System.out.println("Enter the values");
        for(int i=0;i<rows;i++){
            for(int j=0;j<coloums;j++){
                args[i][j]=sc.next();
            }
        }

        System.out.println("Solution: ----------");
        for(int i=0;i<rows;i++){
            for(int j=0;j<coloums;j++){
                if(i==j){
                    for(int k=args[i][j].length()-1;k>=0;k--){
                        System.out.print(args[i][j].charAt(k));
                    }
                System.out.println();}
                else{System.out.println(args[i][j]);}
            }
        }sc.close();
    }
    
}
