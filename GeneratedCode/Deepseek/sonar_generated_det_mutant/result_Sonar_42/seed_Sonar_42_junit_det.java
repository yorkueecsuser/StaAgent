import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class BugExample {
    @Test
    void showBug() {
        BugExample obj = new BugExample();
        assertThat(obj).isEqualTo(obj); // BUG: Assertions should not compare an object to itself
    }
}