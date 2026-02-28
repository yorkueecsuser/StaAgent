import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class NonsensicalInvocationExampleTest {

    @Test
    public void testShowBugWithNonEmptyList() {
        NonsensicalInvocationExample example = new NonsensicalInvocationExample();
        List<String> sampleList = new ArrayList<>();
        sampleList.add("Item1");
        sampleList.add("Item2");

        int sizeAfterClear = example.showBug(sampleList); // TRIGGER BUG: DMI: D’oh! A nonsensical method invocation (DMI_DOH)
        
        // This assertion will fail because sizeAfterClear will always be 0
        assertEquals(2, sizeAfterClear);
    }

    @Test
    public void testShowBugWithEmptyList() {
        NonsensicalInvocationExample example = new NonsensicalInvocationExample();
        List<String> emptyList = new ArrayList<>();
        
        int sizeAfterClear = example.showBug(emptyList); // TRIGGER BUG: DMI: D’oh! A nonsensical method invocation (DMI_DOH)
        
        // This assertion will fail because sizeAfterClear will always be 0
        assertEquals(0, sizeAfterClear);
    }
}