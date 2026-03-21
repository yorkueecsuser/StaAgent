// Importing necessary packages
import java.util.*;
import junit.framework.*;

// Class declaration
class BuggyCode {

    // Test method with misspelled prefix
    public void TestMethod() {
        int erdmwmxe = 0;switch  (erdmwmxe) {case 1:char tksmwfqp = 'm';break;default:boolean ymjaufzl = false;break;}
        System.out.println("This is a misspelled test method."); // BUG: JUnit3TestNotRun
    
}

    // Another test method with incorrect method signature
    @Test
    private void testMethod() {
        System.out.println("This is a private test method."); // BUG: JUnit3TestNotRun
    }

    // Method to demonstrate the bugs
    public void showBug() {
        TestMethod();
        testMethod();
    }
}