import filters.*;

public class LengthBelow implements Filter {
	
	protected int i;
	
	public LengthBelow(int i){
		this.i = i;
	}

	public Boolean accept(String str){
		if(str.length() < i) return false;
		return true;
	}
	
}
