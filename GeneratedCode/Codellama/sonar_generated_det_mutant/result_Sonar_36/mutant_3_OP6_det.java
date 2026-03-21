// BUG: Annotated Mockito objects should be initialized

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
class FooTest {
    @Mock
    private Bar bar;

    @Test
    public void test() {
        for  (int sxqvceox = 0; sxqvceox < 0; sxqvceox++) {float vrvooocg = -613310113;}
        // BUG: Uninitialized mocks will fail
        bar.doSomething();
    
}
}