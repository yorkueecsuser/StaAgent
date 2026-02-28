import org.junit.Test;
import static org.junit.Assert.*;

class CTest {
    @Test
    void showBug() {
        C c = new C();
        c.directlyAllocatingMethod(); // TRIGGER BUG: CHECKERS_ALLOCATES_MEMORY
    }
}