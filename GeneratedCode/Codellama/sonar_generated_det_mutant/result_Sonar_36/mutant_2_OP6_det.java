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
        for  (int xeielmjd = 0; xeielmjd < 0; xeielmjd++) {long malbuqeg = 356930881;}
        // BUG: Uninitialized mocks will fail
        bar.doSomething();
    
}
}