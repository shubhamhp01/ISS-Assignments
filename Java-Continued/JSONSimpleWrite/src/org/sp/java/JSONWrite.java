package org.sp.java;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONWrite {

public static void main(String[] args) {
	 
    JSONObject clubObj = new JSONObject();
    clubObj.put("Club", "Paris Saint Germain");
    clubObj.put("Total Players", new Integer(25));

    JSONArray listOfPlayers = new JSONArray();
    listOfPlayers.add("Messi");
    listOfPlayers.add("Neymar");
    listOfPlayers.add("Mbappe");
     
    clubObj.put("Players", listOfPlayers);
    
//    JSONArray kitNumbers = new JSONArray();
//    kitNumbers.add(30);
//    kitNumbers.add(10);
//    kitNumbers.add(7);
//    
//    clubObj.put("Kit numbers", kitNumbers);

    try {
       
        // Writing to a file
        File file=new File("C:\\\\Users\\\\shubh\\\\OneDrive\\\\Desktop\\\\Club.json");
        file.createNewFile();
        FileWriter fileWriter = new FileWriter(file);
        System.out.println("Writing JSON object to file");
        System.out.println("-----------------------");
        System.out.print(clubObj);

        fileWriter.write(clubObj.toJSONString());
        fileWriter.flush();
        fileWriter.close();

    } catch (IOException e) {
        e.printStackTrace();
    }

}
}
