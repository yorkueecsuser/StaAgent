import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
class ExampleBug {

    @BeforeClass
    public void setUpBeforeClass() { // BUG: JUnit4ClassAnnotationNonStatic
        System.out.println("This should be static");
    }

    @AfterClass
    public void tearDownAfterClass() { // BUG: JUnit4ClassAnnotationNonStatic
        System.out.println("This should be static");
    }

    public String showBug() {
        return "Check console for non-static @BeforeClass and @AfterClass methods";
    }
}