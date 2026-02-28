import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class IteratorExampleTest {

    @Test
    public void testShowBug() {
        // Arrange
        IteratorExample example = new IteratorExample();
        List<Integer> inputList = List.of(1, 2, 3, 4, 5);

        // Act
        List<Integer> result = example.showBug(inputList);

        // Assert
        List<Integer> expected = List.of(1, 2, 3, 4, 5, 1, 3, 5, null, null); 
        assertEquals(expected, result); // TRIGGER BUG: "Iterator.hasNext()" should not call "Iterator.next()"
    }
}