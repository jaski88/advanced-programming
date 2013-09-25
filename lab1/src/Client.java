import java.util.ArrayList;

import filters.ContainsWord;
import filters.StringFilter;

public class Client {

	public static void main(String[] args) {

		StringFilter sFilter = new StringFilter();
		
		sFilter.addWord("UM");
		sFilter.addWord("DOIS TRES");
		sFilter.addFilter(new ContainsText("B")); // custom filter
		
		System.out.println("1: " + sFilter.getFilteredStrings()); //[UM, DOIS TRES]
		
		sFilter.addFilter(new ContainsWord("TRES", "U")); // filter offered by the library
		System.out.println("2: " + sFilter.getFilteredStrings()); // [UM]
		ArrayList<String> list = new ArrayList<String>();
		list.add("QUATRO");
		list.add("CINCO");
		sFilter.addStrings(list);
		System.out.println("3: " + sFilter.getFilteredStrings()); // [QUATRO, UM, CINCO]
		sFilter.addFilter(new LengthBelow(3)); // custom filter
		System.out.println("4: " + sFilter.getFilteredStrings()); // [QUATRO, CINCO]


	}
}
