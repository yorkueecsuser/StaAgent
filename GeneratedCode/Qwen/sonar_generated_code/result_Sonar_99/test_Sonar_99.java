import org.junit.Test;
import static org.junit.Assert.*;

public class RegexBugExampleTest {

    @Test
    public void testShowBug1() {
        RegexBugExample example = new RegexBugExample();
        String result = example.showBug1("/File|Name.txt"); // TRIGGER BUG: Inappropriate regular expressions should not be used
        assertEquals("", result); // This should fail because the expected result is not an empty string
    }

    @Test
    public void testShowBug2() {
        RegexBugExample example = new RegexBugExample();
        String result = example.showBug2("/File|Name.txt"); // TRIGGER BUG: Inappropriate regular expressions should not be used
        assertEquals("_/_F_i_l_e_|_N_a_m_e_._t_x_t_", result); // This should fail because the expected result is not correct
    }

    @Test
    public void testShowBug3() {
        RegexBugExample example = new RegexBugExample();
        String result = example.showBug3("/File|Name.txt"); // TRIGGER BUG: Inappropriate regular expressions should not be used
        assertEquals("/File|Name.txt", result); // This should fail because the expected result is not correct
    }

    @Test
    public void testShowBug4() {
        RegexBugExample example = new RegexBugExample();
        String result = example.showBug4("/File|Name.txt"); // TRIGGER BUG: Inappropriate regular expressions should not be used
        assertEquals("", result); // This should fail because the expected result is not an empty string
    }

    @Test
    public void testShowBug5() {
        RegexBugExample example = new RegexBugExample();
        String result = example.showBug5("/File|Name.txt"); // TRIGGER BUG: Inappropriate regular expressions should not be used
        assertEquals("_/File|Name.txt", result); // This should fail because the expected result is not correct
    }

    @Test
    public void testShowBug6() {
        RegexBugExample example = new RegexBugExample();
        String result = example.showBug6("/File|Name.txt"); // TRIGGER BUG: Inappropriate regular expressions should not be used
        assertEquals("/File|Name.txt", result); // This should fail because the expected result is not correct
    }
}