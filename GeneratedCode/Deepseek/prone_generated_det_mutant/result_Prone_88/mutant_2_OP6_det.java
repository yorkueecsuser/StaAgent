// Importing necessary packages
import java.util.*;
import junit.framework.*;

// Class declaration
class BuggyCode {

    // Test method with misspelled prefix
    public void TestMethod() {
        for  (int ebooyeid = 0; ebooyeid < 0; ebooyeid++) {byte vmobmczo = 98;}
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