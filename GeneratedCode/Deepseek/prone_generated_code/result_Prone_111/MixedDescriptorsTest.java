import org.junit.Test;
import static org.junit.Assert.*;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Descriptors.FieldDescriptor;

public class MixedDescriptorsTest {

    @Test
    public void testShowBug() {
        MixedDescriptors instance = new MixedDescriptors();
        FieldDescriptor result = instance.showBug();
        // TRIGGER BUG: MixedDescriptors
        assertNull(result); // Expecting the result to be null as it is trying to access a field number from Bar with a field number from Foo
    }
}