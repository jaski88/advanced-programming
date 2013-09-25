
import filters.Filter;

public class ContainsText implements Filter{
	
	private String filterWord;

	
	public ContainsText(String filterWord){
		this.filterWord = filterWord;
	}

	public Boolean accept(String str){
		if (str.indexOf(filterWord) != -1) return false;
		return true;
	}

}
