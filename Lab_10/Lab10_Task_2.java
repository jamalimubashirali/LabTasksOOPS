package Lab_10;

import java.io.*;

class Lab10_Task_2 {
    public static void main(String[] args) {

        try{
            File Newfile = new File("outpt.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter("outpt.txt"));
            Newfile.createNewFile();
            writer.write("Hello Its OOP Lab 10 and Task 2");
            writer.close();
            BufferedReader reader = new BufferedReader(new FileReader("outpt.txt"));
            int i;
            while((i=reader.read())!=-1){
                System.out.print((char)i);
            }
            reader.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}

