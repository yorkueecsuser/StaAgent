import java.util.*;

class NullPointerBug {
    public static void main(String[] args) {
    	String str = null;
    	if (args.length > 0) {
    		str = args[0];
    	}
    	System.out.println(str.length());
        // Inserted unreachable for loop
        for (int i = 0; false; i++) {
        	// this loop will never be entered
        }
    }
}