import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Part2 {

    public static void main(String[] args) {
    	try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
	    	String line;
	    	int total = 0;
	    	ArrayList<Integer> reached = new ArrayList<>();
	    	ArrayList<Integer> once = new ArrayList<>();
	    	boolean found = false;
	    	boolean iter = false;
	    	reached.add(0);

	    	while (!(found || iter)) {
	    		line = br.readLine();
	    		
	    		System.out.println(line == null);
	    		if (line == null){
	   				iter = true;
	    		}else{
		       		total = total + Integer.parseInt(line);

		       		if (reached.contains(total)){
		       			found = true;
		       		} else{
		       			reached.add(total);
		       			once.add(Integer.parseInt(line));
		       		}
	       		}	

    		}

    		for (int i = 0; !found; i = (i + 1)%958) {
	       		total = total + once.get(i);

	       		if (reached.contains(total)){
	       			found = true;
	       		} else{
	       			reached.add(total);
	       		}
    		}




    		System.out.println(total);
    		
		} catch (Exception e){
			System.out.println(e);
		}
    }
}