package com.shurik.company;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        JSONObject object   = new JSONObject();

        object.put("name", "HZ");
        object.put("age", new Integer(56));

        JSONArray   list = new JSONArray();

        list.add("первое значение");
        list.add("второе значение");
        list.add("третье значение");

        object.put("mass", list);

        try {
            FileWriter fileWriter   = new FileWriter("test.json");
            fileWriter.write(object.toJSONString());
            fileWriter.flush();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        // ==========================

        JSONParser  parser  = new JSONParser();

        try {

            JSONObject jsonObject = (JSONObject) parser.parse(new FileReader("test.json"));

            String name = (String) jsonObject.get("name");
            long age    = (Long) jsonObject.get("age");

            System.out.println("name = " + name);
            System.out.println("age = " + age);

            JSONArray   jsonArray   = (JSONArray) jsonObject.get("mass");

            System.out.println("mas = " + jsonArray);

//            for (elem : jsonArray) {
//
//            }

            //Iterator<String> iterator jsonArray;





        } catch (FileNotFoundException fe){
            fe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (ParseException pe){
            pe.printStackTrace();
        }

    }
}
