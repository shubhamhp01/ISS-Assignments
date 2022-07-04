package org.sp.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSONRead {
 
	public static void main(String[] args) throws ParseException {
		 
		  JSONParser parser = new JSONParser();
		 
		  try {
		 
		   Object obj = null;
		try {
			obj = parser.parse(new FileReader("C:\\\\Users\\\\shubh\\\\OneDrive\\\\Desktop\\\\Club.json"));
		} catch (org.json.simple.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   JSONObject jsonObject = (JSONObject) obj;
		   
		   String nameOfClub = (String) jsonObject.get("Club");
		   System.out.println("Name Of Club: "+nameOfClub);
		 
		   long totalPlayers = (Long) jsonObject.get("Total Players");
		   System.out.println("Total Players: "+totalPlayers);
		 
		   System.out.println("Players are as follows:");
		   JSONArray listOfPlayers = (JSONArray) jsonObject.get("Players");
		   java.util.Iterator iterator = listOfPlayers.iterator();
		   while (iterator.hasNext()) {
		    System.out.println(iterator.next());
		   }
		 
		  } catch (FileNotFoundException e) {
		   e.printStackTrace();
		  } catch (IOException e) {
		   e.printStackTrace();
		  }
		 
		}
		}