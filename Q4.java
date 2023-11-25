/*WAP to generate wifi key as user will enter form value Name,City,Age and Gender?
=>If gender is Male then key will be First 3 Character of Name+Difference of age digit+Last 3 Character of city
=> If gender is Female then key will be last 3 character of Name+sum of age digit+first 3 character of city
*/

import java.util.Scanner;

public class Q4 {
public static void main(String[] args) {
    new wifigenerator();
}
}

class wifigenerator {
    String wifipass, name, city;
    char gender;
    int age;

    wifigenerator() {
        getdata();
        getpassword();
    }

    void getdata() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the details-\nName : ");
        name = sc.next();

        System.out.print("Age : ");
        age = sc.nextInt();

        System.out.print("Gender(M/F) : ");
        gender = sc.next().charAt(0);

        System.out.print("City : ");
        city = sc.next();

        sc.close();
    }

    void getpassword() {

        if (gender == 'F') {
            wifipass = name.substring(name.length() - 3, name.length());
            int agesum = 0;
            while (age != 0) {
                agesum = agesum + age % 10;
                age = age / 10;
            }
            String cityend = city.substring(0, 3);
            wifipass = wifipass + "" + agesum + cityend;
        }

        else {
            wifipass = name.substring(0, 3);
            int agesum = 0;
            while (age != 0) {
                agesum = age % 10 - agesum;
                age = age / 10;
            }
            String cend = city.substring(name.length() - 3, name.length());
            wifipass = wifipass + "" + agesum + cend;
        }

        System.out.println("The generated password is : " + wifipass);
    }
}