import org.junit.Assert;
import org.junit.jupiter.api.Test;

class AssertionBug {
    class MyClass {
    }

    @Test
    void test_equals_and_hash_code() {
        MyClass obj = new MyClass();
        Assert.assertEquals(obj, obj); // BUG: Assertions should not compare an object to itself
    }

    // Additional method to showcase the bug
    public void showBug() {
        MyClass obj = new MyClass();
        Assert.assertEquals(obj, obj); // BUG: Assertions should not compare an object to itself
    }
}