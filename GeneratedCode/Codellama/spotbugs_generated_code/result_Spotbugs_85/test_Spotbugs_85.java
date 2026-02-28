import org.junit.Test;
import static org.junit.Assert.*;

public class BitwiseBugExampleTest {

  @Test
  public void testShowBug() {
    BitwiseBugExample example = new BitwiseBugExample();
    example.showBug(0x0005);
    // TRIGGER BUG: BIT: Incompatible bit masks (BIT_AND)
  }
}