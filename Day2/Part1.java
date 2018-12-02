import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Part1 {

    public static void main(String[] args) {
    	try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
	    	String line;
	    	int twice = 0;
	    	int thrice = 0;
	    	while ((line = br.readLine()) != null) {
	       		if (checkForN(line, 2)) twice++;
	       		if (checkForN(line, 3)) thrice++;
    		}
    		System.out.println(twice * thrice);
		} catch (Exception e){
			System.out.println(e);
		}
    }

    public static boolean checkForN(String line, int n){
    	boolean x = false;
    	ArrayList<Character> letters = new ArrayList<>();

    	for (int i = 0; i < line.length(); i++){
    		char c = line.charAt(i);
    		if (!letters.contains(c)){
    			letters.add(c);
    		}
    	}

    	for (int i = 0; (i < letters.size()) && (!x); i++ ){
    		int count = 0;
    		char c = letters.get(i);
    		for (int j = 0; j < line.length(); j++){
	    		if (line.charAt(j) == c) count++;
    		}
    		if (count == n) x = true;
    	}

    	return x;
    }
}