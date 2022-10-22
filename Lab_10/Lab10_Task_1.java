package Lab_10;

import com.mysql.cj.xdevapi.JsonParser;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;

public class Lab10_Task_1 {
    public static <JSONParser> void main(String[] args) {
        JSONObject obj = new JSONObject();
        obj.put("Name", "Mubashir Ali");
        obj.put("Department", "Software Engineering");
        obj.put("Roll No", "21SW071");
        obj.put("District", "Larkana");
        try {
            FileWriter fileWriter = new FileWriter("Task.json");
            fileWriter.write(obj.toString());
            fileWriter.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        org.json.simple.parser.JSONParser parser = new org.json.simple.parser.JSONParser();
        try {
            Object Obj = parser.parse(new FileReader("Task.json"));
            JSONObject object = (JSONObject) Obj;
            String Name = (String) object.get("Name");
            System.out.println("Name is :"+Name);
            String depat = (String) object.get("Department");
            System.out.println("Department is :"+depat);
            String roll_No = (String) object.get("Roll No");
            System.out.println("Roll NO is :"+roll_No);
            String dis = (String) object.get("District");
            System.out.println("District is :"+dis);
        } catch (org.json.simple.parser.ParseException e) {
            System.out.println(e);
        }catch (IOException e){

        }
    }
}
