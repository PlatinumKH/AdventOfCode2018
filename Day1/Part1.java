import java.io.BufferedReader;
import java.io.FileReader;

public class Part1 {

    public static void main(String[] args) {
    	try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
	    	String line;
	    	int total = 0;
	    	while ((line = br.readLine()) != null) {
	       		total = total + Integer.parseInt(line);
    		}
    		System.out.println(total);
		} catch (Exception e){
			System.out.println(e);
		}
    }
}