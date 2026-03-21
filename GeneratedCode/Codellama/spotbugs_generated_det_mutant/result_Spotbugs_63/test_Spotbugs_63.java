import org.junit.Test;
import static org.junit.Assert.*;

public class NP_NULL_PARAM_DEREF_ALL_TARGETS_DANGEROUSTest {
    @Test
    public void testBugTrigger() {
        NP_NULL_PARAM_DEREF_ALL_TARGETS_DANGEROUS buggyClass = new NP_NULL_PARAM_DEREF_ALL_TARGETS_DANGEROUS();
        buggyClass.addStringToList(null, "Hello World!"); // TRIGGER BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_ALL_TARGETS_DANGEROUS)
    }
}