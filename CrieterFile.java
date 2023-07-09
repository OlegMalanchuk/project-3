import java.io.File;
import java.io.IOException;

public class CrieterFile {// клас для створювання файлу

    public static void fileCreator(){
        try {// функція \яка виконається до помилки
            File file = new File("E:\\Нова папка\\java\\OOP\\проект 3\\File.txt");// ініціалізація класу для створення файлу та шлях файлу

            if (file.createNewFile()){// саме створення
                System.out.println("файл створений ");
            }else{//якщо створений виведе це
                System.out.println("файл створений раніше ");
            }
        }catch (Exception e ){// ловимо помилку
            System.err.println(e);
        }
    }




}
