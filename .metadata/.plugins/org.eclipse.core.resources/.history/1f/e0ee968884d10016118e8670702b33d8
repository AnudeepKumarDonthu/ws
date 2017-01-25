/**
 * 
 */
package com.json.practice;

import java.util.ArrayList;
import java.util.Arrays;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONML;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 * @author Anudeep Kumar
 *
 */
public class SampleJSONObject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JSONObject obj = new JSONObject();
		JSONArray jsonarray= new JSONArray();
		JSONML jsonml= new  JSONML();
		JSONParser parser = new JSONParser();
		try {
			obj.put("name", "Anudeep Kumar");
			obj.put("age", 25);
			obj.put("alive", true);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(obj);
		jsonarray.put(true);
		jsonarray.put(new ArrayList<String>().add("anudeep"));
		jsonarray.put(obj);
		System.out.println(jsonarray);
		System.out.println(new ArrayList<String>().add("anudeep"));
		System.out.println(Arrays.asList("anudeep","donthu"));
		
	}

}
