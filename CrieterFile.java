import java.io.File;
import java.io.IOException;

public class CrieterFile {

    public static void fileCreator(){
        try {
            File file = new File("E:\\Нова папка\\java\\OOP\\проект 3\\File.txt");

            if (file.createNewFile()){
                System.out.println("файл створений ");
            }else{
                System.out.println("файл створений раніше ");
            }
        }catch (Exception e ){
            System.err.println(e);
        }
    }

//    public static void recordInformationInFail(){
//        try {
//
//        }catch (IOException ex){
//            System.out.println(ex.getMessage());
//        }
//
//    }


}
