import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
class ParameterizedExample {

    private int number;

    public ParameterizedExample(int number) {
        this.number = number;
    }

    @Parameterized.Parameters
    // BUG: JUnitParameterMethodNotFound
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            { 0 }, { 1 }, { 2 }
        });
    }

    public int showBug() {
        return number;
    }

    public static void main(String[] args) {
        ParameterizedExample example = new ParameterizedExample(5);
        System.out.println(example.showBug());
    }
}