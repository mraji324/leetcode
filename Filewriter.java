import java.io.FileWriter;
import java.io.IOException;
public class Filewriter {
    public static void main(String[] args) {
       
        try {
            FileWriter writes = new FileWriter("Munna.txt");
            writes.write("munna aahvdejfvfefh\ndvgdfyeddghwdc");
            writes.close();
        
    }catch(IOException e){
        e.printStackTrace();;
    
}
}
    }
