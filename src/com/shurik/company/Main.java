package com.shurik.company;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

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

    }
}
