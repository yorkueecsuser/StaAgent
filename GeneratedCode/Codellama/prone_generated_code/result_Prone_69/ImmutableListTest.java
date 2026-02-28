import org.junit.Test;
import static org.junit.Assert.*;

public class ImmutableListTest {
    @Test
    public void testBug() {
        List<String> mutableList = new ArrayList<>();
        mutableList.add("A");
        mutableList.add("B");
        ImmutableList<String> immutableList = new ImmutableList<>(mutableList);
        immutableList.getList().add("C"); // TRIGGER BUG: Immutable
    }
}