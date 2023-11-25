/*WAP in Java to initialize a string in order to find that character which frequency is 2nd most in that string.*/


public class Q2 {
    public static void main(String[] args) {
        String s="missisippi";
        int max=0;
        char maxi=' ';

        for(int i=0;i<s.length();i++){
            int c=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    c++;
                }
            }
                if(c>max){
                    maxi=s.charAt(i);
                    max=c;
                }
        }
        s=s.replaceAll(Character.toString(maxi), "");

        max=0;
        for(int i=0;i<s.length();i++){
            int c=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    c++;
                }
            }
                if(c>max){
                    maxi=s.charAt(i);
                    max=c;
                }
        }
        System.out.println(maxi+"-"+max);      
    }
}