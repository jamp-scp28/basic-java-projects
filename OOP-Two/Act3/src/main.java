import java.io.Console;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;

public class main {

    public static void main(String args[]) {
        FileWritter writter = new FileWritter();
        writter.Write();
        System.out.println("Writing information to File...");

        System.out.println("Reading file information...");
        try{
            FileReaderT reader = new FileReaderT();
            reader.ReadFile();
        }catch (Exception ex){
            ex.printStackTrace();
        }
      }
}
