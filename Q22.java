/*22.	WAP for following OUTPUT 
String s="san12may4tya7yyy678rtb62tp"
Output 1 will sanmytrbp(no rept,no numbers)
Output 2 will 4*7=28
Output 3 will 12+678+62=690+62 =.... (sum of numbers)*/

public class Q22 {
    public static void main(String[] args) {
        new outputs();
    }
}

class outputs {
    static String s = "san12may4tya7yyy678rtb62tp";

    outputs() {
        System.out.println("String = "+s);
        output1();
        output2();
        output3();
    }

    void output1() {
        String o1 = new String();
        // only words no reptetion
        for (int i = 0; i < s.length(); i++) {
            if (o1.contains(Character.toString(s.charAt(i))) || Character.isDigit(s.charAt(i))) {
                continue;
            } else {
                o1 = o1.concat(Character.toString(s.charAt(i)));
            }
        }
        System.out.println("Output 1 = " + o1);
    }

    void output2() {
        int d = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                d = d + (Character.getNumericValue(s.charAt(i)));
            }
        }

        int tns = d % 10;
        d = d / 10;
        int ons = d;

        System.out.println("Output 2 = " + (tns * ons));

    }

    void output3() {
        int sum=0;
        int num=0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                num=(Character.getNumericValue(s.charAt(i)))+(num*10);
                
            }
            else {
                if(num>=10){sum=sum+num;}
                num=0;}
        }
        System.out.println("Output 3 = "+sum);
    }
}
