import java.util.Collections;
import java.util.List;

class NCopiesOfCharExample {

    // Method to demonstrate the bug
    public List<Integer> showBug(int numberOfCopies, char character) {
        // BUG: NCopiesOfChar
        return Collections.nCopies((int) character, numberOfCopies);
    }
public static void main(String [] args){
    NCopiesOfCharExample example = new NCopiesOfCharExample();
    example = new NCopiesOfCharExample();
    List < Integer > result = example.showBug(10 , 'a');
    System.out.println(result);
}
}