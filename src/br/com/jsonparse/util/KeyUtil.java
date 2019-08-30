package br.com.jsonparse.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import br.com.jsonparse.model.Key;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;

public class KeyUtil {

	public static void parseList(HashMap<String, String> fields, JSONArray array) {
		
		if (array != null && !array.isEmpty()) {

			array.forEach((object) -> {

				try {
					JSONObject jsonObject = (JSONObject) object;

					String key = jsonObject.get("key").toString();
					String value = jsonObject.get("value").toString();

					jsonObject.replace("value", "${"+key+"}");
					fields.put(key, value);
										

				} catch (Exception e) {
					e.printStackTrace();
				}
			});

		}

	}

}
