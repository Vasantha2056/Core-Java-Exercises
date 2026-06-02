import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            
            System.out.print("Enter a string: ");
            String text = sc.nextLine();

          
            FileWriter writer = new FileWriter("output.txt");
            writer.write(text);
            writer.close();

            
            System.out.println("Data has been written to output.txt successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        sc.close();
    }
}