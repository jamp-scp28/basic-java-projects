import models.PersonalData;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWritter {
    public void Write() {
        // Initialize PersonalData Class
        PersonalData infoData = new PersonalData();
        Scanner input = new Scanner(System.in);
        // Request information to fill the object
        System.out.println("Ingrese su Nombre: ");
        infoData.setName(input.next());

        System.out.println("Ingrese su Apellido: ");
        infoData.setLasName(input.next());

        System.out.println("Ingrese su Edad: ");
        infoData.setAge(input.nextInt());

        System.out.println("Ingrese su Telefono (* Sin espacios): ");
        infoData.setPhoneNumber(input.next());

        System.out.println("Ingrese su Email: ");
        infoData.setEmail(input.next());

        System.out.println("Ingrese su Direccion: ");
        infoData.setAddress(input.next());

        try {
            // Write the Information to the Object
            FileWriter personalWriter = new FileWriter("personalInfo.txt");
            personalWriter.write(String.format(infoData.GetData()));
            personalWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            // Print error if there is one.
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
