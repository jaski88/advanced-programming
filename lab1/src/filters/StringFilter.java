package filters;
import java.util.ArrayList;
import java.util.List;


public class StringFilter {
	
	protected List<String> wordsList = new ArrayList<String>();
	protected List<Filter> filtersList = new ArrayList<Filter>();

	public StringFilter(){}
	
	public String getFilteredStrings(){	
//		StringBuilder sb = new StringBuilder();
//		for(String s : wordsList){
//			sb.append(s);
//		}
//		sb.append("\n");
//		return sb.toString();

		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(String word : wordsList){
			if(applyFilters(word)){
				sb.append(word + ", ");
				
			}
		}
		sb.append("]");
		return sb.toString();	
	}
	
	private Boolean applyFilters(String word){
		for(Filter filter: filtersList){
			if(!filter.accept(word)) return false;
		}	
		return true;
	}
	
	public void addWord(String s){
		wordsList.add(s);
	}
	
	public void addStrings(ArrayList<String> list){
		wordsList.addAll(list);
	}
	

	
	public void addFilter(Filter filter){
		filtersList.add(filter);
	}
	
	public String toString(){
		return getFilteredStrings();
	}
	
	
	
}
