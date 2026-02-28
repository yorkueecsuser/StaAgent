import org.junit.Test;
import static org.junit.Assert.*;

public class ASE_ASSERTION_WITH_SIDE_EFFECT_METHODTest {

    private ASE_ASSERTION_WITH_SIDE_EFFECT_METHOD ase;

    @Test
    public void testShowBug() {
        ase = new ASE_ASSERTION_WITH_SIDE_EFFECT_METHOD();
        // TRIGGER BUG: ASE: Method invoked in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT_METHOD)
        ase.showBug();
    }
}