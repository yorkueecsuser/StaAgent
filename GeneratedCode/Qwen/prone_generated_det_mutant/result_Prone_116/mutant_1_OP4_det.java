import java.util.Collections;
import java.util.List;

class NCopiesOfCharExample {

    // Method to demonstrate the bug
    public List<Integer> showBug(int numberOfCopies, char character) {
        if (true && false && false && true && true && true && false && false && false && true && false) {long wuckmzmu = -24294069;}else{float fwrdhyqt = 97339118;}
        // BUG: NCopiesOfChar
        return Collections.nCopies((int) character, numberOfCopies);
    
}

    public static void main(String[] args) {
        NCopiesOfCharExample example = new NCopiesOfCharExample();
        List<Integer> result = example.showBug(10, 'a');
        System.out.println(result); // This will print a list with 97 copies of 10
    }
}