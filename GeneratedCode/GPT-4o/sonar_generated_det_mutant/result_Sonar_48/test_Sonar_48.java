import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class AssertJExampleTest {

    @Test
    public void testShowBug_withEmptyList() {
        AssertJExample example = new AssertJExample();
        List<String> emptyLogs = new ArrayList<>();
        
        example.showBug(emptyLogs); // TRIGGER BUG: AssertJ assertions "allMatch" and "doesNotContains" should also test for emptiness
    }
    
    @Test
    public void testShowBug_withNonEmptyList() {
        AssertJExample example = new AssertJExample();
        List<String> logs = new ArrayList<>();
        logs.add("warning: something happened");
        logs.add("info: system running");

        example.showBug(logs); // TRIGGER BUG: AssertJ assertions "allMatch" and "doesNotContains" should also test for emptiness
    }
}