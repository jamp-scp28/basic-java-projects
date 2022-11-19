import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderT {
   public void ReadFile() throws FileNotFoundException {
       FileReader reader = new FileReader("personalInfo.txt");
       try {
           int i;
           while ((i = reader.read()) != -1)
               System.out.print((char) i);
           reader.close();
       }catch (Exception ex){
           ex.printStackTrace();
       }
   }
}
