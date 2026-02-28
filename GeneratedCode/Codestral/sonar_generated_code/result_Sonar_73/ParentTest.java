import org.junit.Test;
import static org.junit.Assert.*;

public class ChildTest {

    @Test
    public void testShowBug() {
        Child child = new Child();
        child.showBug();
        // TRIGGER BUG: Overrides should match their parent class methods in synchronization
        // The bug is triggered because the overridden method in the Child class is not synchronized,
        // which can lead to improper synchronization as callers rely on the thread-safety promised by the Parent class.
    }
}