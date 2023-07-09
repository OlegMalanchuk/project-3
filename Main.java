import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        CrieterFile.fileCreator();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Зареєструйте користувача імя прізвище : ");
        String informPerson = scanner.nextLine();

        boolean found  = false;
        try (FileReader fileReader = new FileReader("E:\\Нова папка\\java\\OOP\\проект 3\\File.txt");
             BufferedReader reader = new BufferedReader(fileReader)) {
            String currentLine = null;
            while ((currentLine = reader.readLine()) != null) {
                if (currentLine.equalsIgnoreCase(informPerson)) // використання equalsIgnoreCase
                {
                    System.err.println("користувач існує");
                    found = true;
                    break;
                }
            }
        } catch (IOException ex) {

            System.err.println(ex);
        }

        if (!found) { // перевірка, чи не було збігу
            try (FileWriter writer = new FileWriter("E:\\Нова папка\\java\\OOP\\проект 3\\File.txt", true)) // використання try-with-resources
            {
                writer.write(informPerson);
                writer.append("");
                writer.append("\n");
                writer.flush();
            } catch (IOException ex) {
                System.err.println(ex.getMessage());
            }
            System.out.println("addddddddddddddddddddd");
        }




    }
}
