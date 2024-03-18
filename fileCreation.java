import java.io.IOException;
import java.io.File;
public class fileCreation {
    public static void main (String []args){

            File TextFile = new File("main.txt");
            try{
            if(TextFile.createNewFile()){
                System.out.println("file created successfully");
            } else {
                System.out.println("file existing");
            }
        } catch(IOException e) {
            System.out.println("file unsuccessfully created");
        }
    }
}
