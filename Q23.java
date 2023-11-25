/*23.  Enter a no and than create array of its digits.
I.e
If no is 123456 than 
Store it's digit in int array of size 6 as
If array is a than a[0] should 1 and a[1] should 2......
Also after storing in array a then reverse it's all value without using another array i.e 
After reversing a[0] should 6 and a[1] should 5 ......
print common elemnts of both array. */

import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number :");
        int s=sc.nextInt(),i=s,len=0;

        while (i!=0) {      //finding the count of digits
            i=i/10;
            len++;
        }

        int a[]=new int[len];              //declaring of size length
        for(int k=len-1;k>=0;k--)       //storing into array
        {
            a[k]=s%10;
            s=s/10;
        }
        for(int r=0;r<=len-1;r++){System.out.print("a["+r+"]="+a[r]+"    ");}
        System.out.println("\nafter reverse->");
        int k=len-1;
        for(int j=0;j<(len/2);j++)
        {
            int t=a[j];
            a[j]=a[k];
            a[k]=t;
            k--;
        }
        for(int r=0;r<=len-1;r++){System.out.print("a["+r+"]="+a[r]+"    ");}
    sc.close();}
}
