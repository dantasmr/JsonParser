package br.com.jsonparse.util;

import java.util.HashMap;

import br.com.jsonparse.model.Request;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import net.minidev.json.JSONValue;

public class ParseRequest {

	
	public static void main(String args[]) {
		
		
		HashMap<String, String> fields = new HashMap<String, String>();
		JSONArray arrayHeader;
		JSONArray arrayPath;
		JSONArray arrayQuery;
		
		try {
			
			 Object obj=JSONValue.parse(json);
		     JSONObject jsonObject=(JSONObject)obj;	
		     
		     String method  = (String) jsonObject.get("method").toString();
		     String body = (String) jsonObject.get("body").toString();
		     
		     arrayHeader = (JSONArray) jsonObject.get("header");
		     arrayPath = (JSONArray) jsonObject.get("path");
		     arrayQuery = (JSONArray) jsonObject.get("query");
	
		     KeyUtil.parseList(fields, arrayHeader);
		     KeyUtil.parseList(fields, arrayPath);
		     KeyUtil.parseList(fields, arrayQuery);
		     
		     
		     jsonObject.replace("header", arrayHeader);
		     jsonObject.replace("path", arrayPath);
		     jsonObject.replace("query", arrayQuery);
		     
		     
		     
		     System.out.println(jsonObject.toString());
		     
		     
		     //request.setHeader(KeyUtil.parseList(arrayHeader));
		     //request.setPath(KeyUtil.parseList(arrayPath));
		     //request.setQuery(KeyUtil.parseList(arrayQuery));
		     
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	

	
}
