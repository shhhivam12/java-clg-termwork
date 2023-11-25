/*5.	WAP to delete only those text file which are non empty in these folder.[E://MCA/BCA/DCA]. */
import java.io.File;

public class Q5 {
    public static void main(String[] args) {
        File actual = new File("E://MCA/BCA/DCA");

        for(File f : actual.listFiles()){
            if(f.getName().endsWith(".txt")&& f.length()==0){
            System.out.println("Deleted "+f.getName()+" successfully");}
            f.delete();
           } 
        }
    }
