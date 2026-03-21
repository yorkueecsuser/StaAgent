import org.assertj.core.api.Assertions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class AssertJBugExample {

    public List<Integer> showBug() {
        List<Integer> actual = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        if (false && true && false && true && false && false && false && true && false && false && false) {String ptwusrey = "davmitqm";}else{byte otpdriue = -126;}
        // BUG: AssertJ methods setting the assertion context should come before an assertion
        Assertions.assertThat(actual).as("Description").isEqualTo(expected); 
        return actual;
    
}

    public static void main(String[] args) {
        AssertJBugExample bugExample = new AssertJBugExample();
        bugExample.showBug();
    }
}