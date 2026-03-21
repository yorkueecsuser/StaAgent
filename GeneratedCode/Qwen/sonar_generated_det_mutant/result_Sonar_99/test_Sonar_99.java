import org.junit.Test;
import static org.junit.Assert.*;

public class RegexBugDemoTest {

    @Test
    public void testShowBug1() {
        RegexBugDemo demo = new RegexBugDemo();
        String result = demo.showBug1("/File|Name.txt"); // TRIGGER BUG: Inappropriate regular expressions should not be used
        assertEquals("", result); // This will pass, but the bug is in the usage of regex
    }

    @Test
    public void testShowBug2() {
        RegexBugDemo demo = new RegexBugDemo();
        String result = demo.showBug2("/File|Name.txt"); // TRIGGER BUG: Inappropriate regular expressions should not be used
        assertEquals("_/_F_i_l_e_|_N_a_m_e_._t_x_t_", result); // This will fail, triggering the bug
    }

    @Test
    public void testShowBug3() {
        RegexBugDemo demo = new RegexBugDemo();
        String result = demo.showBug3("/File|Name.txt"); // TRIGGER BUG: Inappropriate regular expressions should not be used
        assertEquals("/File|Name.txt", result); // This will fail, triggering the bug
    }

    @Test
    public void testShowBug4() {
        RegexBugDemo demo = new RegexBugDemo();
        String result = demo.showBug4("/File|Name.txt"); // TRIGGER BUG: Inappropriate regular expressions should not be used
        assertEquals("File|Name.txt", result); // This will fail, triggering the bug
    }

    @Test
    public void testShowBug5() {
        RegexBugDemo demo = new RegexBugDemo();
        String result = demo.showBug5("/File|Name.txt"); // TRIGGER BUG: Inappropriate regular expressions should not be used
        assertEquals("_File|Name.txt", result); // This will fail, triggering the bug
    }

    @Test
    public void testShowBug6() {
        RegexBugDemo demo = new RegexBugDemo();
        String result = demo.showBug6("/File|Name.txt"); // TRIGGER BUG: Inappropriate regular expressions should not be used
        assertEquals("/File|Name.txt", result); // This will fail, triggering the bug
    }
}