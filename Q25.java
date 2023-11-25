/*25.	 Initlize integer array of any size containg values 0 and 1 only.
Now check which is longest series of either 0 or 1 ,which is existing.
I.e. if array values are
{1,1,1,0,0,1,1,0,0,0,0,0,1,1,1}
Ans is 0 and length is 5
If there is same series of 0 and 1 then ans will which is existing first
I.e. if array values are
{1,1,1,0,0,1,1,0,0,0,1,1,1}
Ans is 1 and length is 3
As 1,1,1 comming first before 0,0 0 */

public class Q25 {
    public static void main(String[] args) {
        int[] binary = {1,1,1,0,0,1,1,0,0,0,0,0,1,1,1};
        int maxo = 0, maxz = 0, oc = 0, zc = 0;

        for (int i = 0; i < binary.length; i++) {
            if (binary[i] == 0) {
                oc = 0;
                zc++;
                if (zc > maxz) {
                    maxz = zc;
                }
            } else {
                zc = 0;
                oc++;
                if (oc > maxo) {
                    maxo = oc;
                }
            }
        }

        if (maxo > maxz) {
            System.out.println("Ans is 1 and length is " + maxo);
        } else if(maxo==maxz){
            zc=0;oc=0;
            int ans=0;
            for (int i : binary) {
            if(i==0){zc++;}
            else{oc++;}
            if(zc==maxo || oc==maxo){ans=i;break;}
        }
        System.out.println("Ans is "+ans+" and length is "+maxz);
    } 
        else{
            System.out.println("Ans is 0 and length is " + maxz);
        }
    }
}
