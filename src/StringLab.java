

public class StringLab {
	public static void main(String[] args) {
		
		capitalize("bLAze");
		wheresWaldo("Srtiped Waldo!");
		reverse("racecar");
		firstThingsFirst("well", "farm");
		soLong("week", "loveable");
		letterize("Java");
		afterMath("We think Math is fun!");
		

	}
//1
	public static void capitalize(String word) {

		word = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
		System.out.println(word);

	}
//2
	public static void wheresWaldo(String phrase) {

		
		System.out.println(phrase.indexOf("Waldo"));
	}
//3
	public static void reverse(String s) {

		StringBuilder input1 = new StringBuilder();

		input1.append(s);

		input1 = input1.reverse();

		System.out.println(input1);
	}
//4
	public static void firstThingsFirst(String a, String b) {
		
		int compare = a.compareTo(b);

		if (compare < 0) {
			System.out.println(a+" "+b);
		   
		}
		else if (compare > 0) {
		   System.out.println(b+ " "+a);
		}
		
		   
	

	}
//5
	public static void soLong(String a, String b) {
		if (a.length() == b.length()) {
			System.out.println(a +" " +b);
			
		}else if(a.length() > b.length()) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}

		
	}
//6
	public static void afterMath(String phrase) {
		
		int index = phrase.toLowerCase().indexOf("math");
		
	      if( index != -1) {
	         System.out.println(phrase.substring(index));
	      } else {
	         System.out.println("dud");
	      }

	}
	

	
//7
	public static void letterize(String word) {
		for(char s: word.toCharArray()) {
	           System.out.println(s);
	    }

	}

}
