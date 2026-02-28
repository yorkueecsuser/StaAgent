import org.junit.Test;
import static org.junit.Assert.*;

class SuperClass {
    public int value = 10;
}

class FieldMaskingExample extends SuperClass {
    public int value = 20; // BUG: MF: Class defines field that masks a superclass field (MF_CLASS_MASKS_FIELD)

    public int showBug() {
        // This will access the 'value' defined in this class, not the superclass
        return this.value;
    }

    public int showSuperClassValue() {
        // Accessing the superclass field using super keyword
        return super.value;
    }
}

public class FieldMaskingExampleTest {

    @Test
    public void testShowBug() {
        FieldMaskingExample example = new FieldMaskingExample();
        int result = example.showBug(); // TRIGGER BUG: MF: Class defines field that masks a superclass field (MF_CLASS_MASKS_FIELD)
        assertEquals(10, result); // This test will fail because it expects the superclass value
    }

    @Test
    public void testShowSuperClassValue() {
        FieldMaskingExample example = new FieldMaskingExample();
        int result = example.showSuperClassValue();
        assertEquals(10, result); // This test should pass
    }
}