import org.junit.Test;
import static org.junit.Assert.*;

public class CharacterConcatenationExampleTest {

    @Test
    public void testShowBug() {
        CharacterConcatenationExample example = new CharacterConcatenationExample();
        String result = example.showBug("example"); // TRIGGER BUG: AppendCharacterWithChar
        assertEquals("example", result); // This assertion is expected to fail due to inefficient concatenation
    }
}