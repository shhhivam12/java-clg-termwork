/*24.	Wap to initlize two integer array of user enterd size .Then perform following operations
1.add elements in that array which  is longest .
I.e. if first array is of 3 size having elements 1,2,3
Second array is of size five and elements are 4,5,6,7,8
Than result array will second and now it's elements will 5,7,9,7,8 */

import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array 1 length");
        int a1=sc.nextInt();
        int ar1[]=new int[a1];
        System.out.println("Enter array 1");
        for(int i=0;i<a1;i++){
            ar1[i]=sc.nextInt();
        }
        
        System.out.println("Enter array 2 length");
        int a2=sc.nextInt();
        int ar2[]=new int[a2];
        System.out.println("Enter array 2");
        for(int i=0;i<a2;i++){
            ar2[i]=sc.nextInt();
        }

        if(a1<a2){
            while (a1!=0) {
                ar2[a1-1]=ar2[a1-1]+ar1[a1-1];
                a1--;
            }
        }
        else{
            while (a2!=0) {
                ar1[a2-1]=ar1[a2-1]+ar2[a2-1];
                a2--;
            }
        }

        System.out.println("Resultant array-");
        if(a1>a2){
        for (int i : ar1) {
            System.out.print(i+" ");
        }}
        else{
        for (int i : ar2) {
            System.out.print(i+" ");
        }}
        sc.close();
    }
}
