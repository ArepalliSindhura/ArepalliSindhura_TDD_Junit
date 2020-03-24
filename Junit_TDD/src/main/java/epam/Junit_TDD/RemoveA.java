package epam.Junit_TDD;

public class RemoveA {

	public String removeA(String s) {
		String result = s;
		int n = s.length();
		if(n == 1){
			if(s.charAt(0) == 'A') {
				result = " ";
			}else {
				result = s;
			}
		}else if(n >= 2) {
			if(s.charAt(0) == 'A' && s.charAt(1) == 'A') {
			result = s.substring(2);
			}else if(s.charAt(0) == 'A' && s.charAt(1) != 'A'){
			result = s.substring(1);
			}else if(s.charAt(0) != 'A' && s.charAt(1) == 'A'){
				result = s.charAt(0) + s.substring(2);
			}else {
				result = s;
			}
		}else{
			result = " ";
		}
		return result;
		
		
	}
}
