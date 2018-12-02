import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Part2 {

    public static void main(String[] args) {
    	try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
	    	String line = "";
            String boxes[] = new String[250];
            boolean found = false;
            int first;
            int second;
            int pos = -1;

            for (int i = 0; i < 250; i++){
                line = br.readLine();
                boxes[i] = line;
            }

            for (int i = 0; (i < 250) && (!found); i++){
                line = boxes[i];
                for (int j = 0; (j < 250) && (!found); j++){
                    if (i != j){
                        int diffcheck = 0;
                        for (int pointer = 0; (pointer < 26) && (diffcheck < 2); pointer++){
                            if (line.charAt(pointer) != boxes[j].charAt(pointer)){ 
                                diffcheck++;
                                pos = pointer;
                            }
                        }
                        if (diffcheck == 1) found = true;
                    }
                }
            }            

            String finalword = line.substring(0,pos) + line.substring(pos+1);

    		System.out.println(finalword);
		} catch (Exception e){
			System.out.println(e);
		}
    }
}