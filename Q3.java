/*WAP to check longest sub sequence of a same character in an initialized string?[aaaabppppp, p=5] [aabbcc, a=2].*/

public class Q3 {
    public static void main(String[] args) {
        String s="aaaabppppp";
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
        System.out.println(maxi+"-"+max);
    }
}
