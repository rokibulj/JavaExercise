package day.one.practice;

public class FirstPractice {
	
	public static void main(String[] args){
		
		String text = "www.elitecareer/profile.php";
		String word = "/profile.php";
		System.out.println(getUrl(text, word));
	}
	
	public static boolean getUrl(String text, String word){
		boolean url = false;
		
		if(text.contains(word)){
			
			url = true;
		} 
		
		System.out.println(text);
		
		
		return url;
	}

}
