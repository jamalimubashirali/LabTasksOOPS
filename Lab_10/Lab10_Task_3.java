package Lab_10;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Lab10_Task_3 {
    public static void main(String[] args) {
        try{
            File myFile = new File("Task3.txt");
            Scanner scan = new Scanner(System.in);
            String name=scan.nextLine();
            String rollNo=scan.nextLine();

            myFile.createNewFile();
            FileWriter file = new FileWriter("Task3.txt");
            file.write("Name: "+name+"\nRoll no: "+rollNo+'\n');
            file.close();
            System.out.println("SuccessFully Written");
        }
        catch(Exception e){
            System.out.print(e);

        }
    }

}
