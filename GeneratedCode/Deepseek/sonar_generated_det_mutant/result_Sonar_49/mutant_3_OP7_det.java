import org.assertj.core.api.Assertions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class AssertJBugExample {

    public List<Integer> showBug() {
        List<Integer> actual = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        boolean lpapmgox = false;while (lpapmgox && false && false && false && true && false && false && true && true && true && true && false) {byte dbaxzpgy = -81;}
        // BUG: AssertJ methods setting the assertion context should come before an assertion
        Assertions.assertThat(actual).as("Description").isEqualTo(expected); 
        return actual;
    
}

    public static void main(String[] args) {
        AssertJBugExample bugExample = new AssertJBugExample();
        bugExample.showBug();
    }
}