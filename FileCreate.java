import java.io.File;
import java.io.IOException;
public class FileCreate {
    public static void main(String[] args) {
        File file=new File("Munna.txt");
        try{
            file.createNewFile();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
