/*WAP to create a method check which returns two values.If first string having a character twice as well second 
string also then return both the string by removing that character? */

public class Q6 {
    public static void main(String[] args) {
        new newclass();
    }
   
}
class newclass{
    newclass(){
        String []s=new String[2];
        s[0]="fellow";
        s[1]="hello";
        System.out.println("Before -"+s[0]+","+s[1]);
        s=check(s);
        System.out.println("After check -"+s[0]+","+s[1]);
    }

     String [] check(String[] arr){
        String []temp=arr;
        char charrem=' ';
        for(int i=0;i<temp[0].length();i++){
            int c=0;
         for(int j=0;j<temp[0].length();j++){
            if(temp[0].charAt(i)==temp[0].charAt(j)){
                c++;
                if (c==2) {
                    charrem=temp[0].charAt(i);
                    break;
                }
            }
        }
        }
        if(charrem==' '){System.out.println("no char occurs twice");System.exit(0);}
        int c=0;
        for(int i=0;i<temp[1].length();i++){
                if(temp[1].charAt(i)==charrem){
                    c++;
                    if(c==2){
                        String replace=Character.toString(charrem);
                        temp[0]=temp[0].replaceAll(replace, "");
                        temp[1]=temp[1].replaceAll(replace, "");
                    }
                }   
        }
        return temp;
    }
}
