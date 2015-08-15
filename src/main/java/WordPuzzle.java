import java.io.Console;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;



public class WordPuzzle {

	public static void main(String[] args) {
		staticFileLocation("/public");
		String layout = "templates/layout.vtl";
		get("/", (request,response) -> {
			HashMap model = new HashMap();
			model.put("template", "templates/home.vtl");
			return new ModelAndView(model, layout);
			}, new VelocityTemplateEngine());

		/*get("/home", (request, response) -> {
			Map<String, Object> model = new HashMap<String, Object>();
			model.put("template", "templates/home.vtl");
			return new ModelAndView(model, layout);
			}, new VelocityTemplateEngine());*/

		/*get("/", (request, response) -> {
			HashMap model = new HashMap();
			model.put("template", "templates/home.vtl");
			return new ModelAndView(model, layout);
			}, new VelocityTemplateEngine());*/

		get("/puzzler", (request, response) -> {
			Map<String, Object> model = new HashMap<String, Object>();
			model.put("template", "templates/puzzler.vtl");
			String userString = request.queryParams("userInput");
			String newStr = newStr(userString);

			model.put("userString", request.queryParams("userString"));
			model.put("newStr", newStr);
			return new ModelAndView(model, layout);
			}, new VelocityTemplateEngine());

	}





	public static String newStr (String userString) {
		char[] sentenceChar = userString.toCharArray();

		//Highly cumbersome, must clean up
		  for (Integer i = 0; i < userString.length(); i++) {
		  		if (sentenceChar[i] == 'a') {
		  			sentenceChar[i] = '-';
		  		}
		  		else if (sentenceChar[i] == 'e') {
		  			sentenceChar[i] = '-';
		  		}
		  		else if (sentenceChar[i] == 'i') {
		  			sentenceChar[i] = '-';
		  		}
		  		else if (sentenceChar[i] == 'o') {
		  			sentenceChar[i] = '-';
		  		}
		  		else if (sentenceChar[i] == 'u') {
		  			sentenceChar[i] = '-';
		  		}
		  		else if (sentenceChar[i] == 'A') {
		  			sentenceChar[i] = '-';
		  		}
		  		else if (sentenceChar[i] == 'E') {
		  			sentenceChar[i] = '-';
		  		}
		  		else if (sentenceChar[i] == 'I') {
		  			sentenceChar[i] = '-';
		  		}
		  		else if (sentenceChar[i] == 'O') {
		  			sentenceChar[i] = '-';
		  		}
		  		else if (sentenceChar[i] == 'U') {
		  			sentenceChar[i] = '-';
		  		}
		  	}
		 String newStr = new String(sentenceChar);
		 return newStr;

	}
}
