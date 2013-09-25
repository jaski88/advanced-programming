package filters;

import java.util.ArrayList;
import java.util.List;

public class ContainsWord implements Filter {

	protected List<String> wordsList = new ArrayList<String>();

	public ContainsWord(String... args) {
		for(String s: args ){
			wordsList.add(s);
		}
	}


	public Boolean accept(String str) {
		
		String[] result = str.split("\\s");
		for(String s: result){
			for(String z: wordsList){
				
				if(z.equals(s)) return false;
			}
		}
		return true;
	}

}

/*package filters;

import java.util.ArrayList;
import java.util.List;

public class WordFilter implements FilterInterface{

	protected List<String> wordsList = new ArrayList<String>();
	
	
	public WordFilter(String... args) {
		for(String s: args ){
			wordsList.add(s);
		}
	}

	public String exclude(String str){
		for(String word : wordsList){
			if(word == str) return "";
		}
		return str;
	}
	
	public Boolean accept(String str){
		return true;
	}
} */
