/*1.	WAP in java to simulate condition to generate Wi-Fi password. Take input as Name, City, Age and Gender.
Constraints:
a.	Length of name and city should be greater or equal to 3.
b.	Age can`t be 18.

Output Constraints:
a.	If Gender=F and Age<18
Password: 1st 3 char of name + sum of digit of age + last 3 char of city
b.	Else If gender=F and Age>18
Password: last 3 char of Name + Diff of digit of age(Positive) + 1st 3 char of City.
c.	Else
Password: 1st char of name + 1st char of city + 2nd char of name + 2nd char of city …
Append this to length of max string(name or city) and then concatenate with Age to get password.
*/

import java.util.Scanner;

class Q1{
    
    public static void main(String[] args) {
        new wifigenerator();
    }
}
class wifigenerator{
    String wifipass,name,city;
    char gender;
    int age;

    wifigenerator(){
        getdata();
        getpassword();
    }


    void getdata(){
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.print("Enter the details-\nName : ");
            name=sc.next(); 
            if(name.length()<=2){System.out.println("name is too short, try more thaan 3 characters");}
            else{break;}
        }

        while (true) {
            System.out.print("Age : ");
            age=sc.nextInt(); 
            if(age==18){System.out.println("Age cannot be 18,retry");}     
            else{break;}       
        }

        System.out.print("Gender(M/F) : ");
        gender=sc.next().charAt(0); 

        System.out.print("City : ");
        city=sc.next(); 

        sc.close();
    }

    void getpassword(){
        
        if(gender=='F' && age<18){
            wifipass=name.substring(0, 3);
            int agesum=0;
            while (age!=0) {
                agesum=agesum+age%10;
                age=age/10;
            }
            String cityend=city.substring(city.length()-3, city.length());
            wifipass=wifipass+""+agesum+cityend;
        }

        else if(gender=='F' && age>18){
            wifipass=city.substring(0, 3);
            int agesum=0;
            while (age!=0) {
                agesum=age%10-agesum;
                age=age/10;
            }
            String nameend=name.substring(name.length()-3, name.length());
            wifipass=wifipass+""+agesum+nameend;
        }

        else{
            if(name.length()>city.length()){wifipass=""+name.length();}
            else{wifipass=""+city.length();}

            for(int i=0;i<3;i++){
                wifipass=wifipass+name.charAt(i);
                wifipass=wifipass+city.charAt(i);
            }
            wifipass=wifipass+""+age;
        }
        System.out.println("The generated password is : "+wifipass);
    }
}