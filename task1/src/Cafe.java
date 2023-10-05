import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
    ArrayList<String> coffeMenu = new ArrayList<>();


    public void loadMenuData(){
        File file = new File ("src/coffe.txt");
        try{
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()){
                coffeMenu.add(scan.nextLine());
                // String line=filreader.nextLine();

            }
        }
        catch (FileNotFoundException e){
            System.out.println("File not found, check file and pathname");



        }
    }

    public void getMenu(){
        for(int i =0 ;i<coffeMenu.size();i++){
            System.out.println(coffeMenu.get(i));
        }

    }

}