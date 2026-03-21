import org.junit.Test;
import static org.junit.Assert.*;

public class EmployeeTest {

    @Test
    public void testGetSalaryBug() {
        // Noncompliant; this is not an override
        Employee emp = new Employee("John Doe", 50000.0);
        double expectedSalary = 50000.0;
        double actualSalary = emp.getSalaryBug();
        assertEquals(expectedSalary, actualSalary, 0.0);

        // TRIGGER BUG: Child class methods named for parent class methods should be overrides
        emp.showBug(); // This triggers the bug in the Employee class
    }
}