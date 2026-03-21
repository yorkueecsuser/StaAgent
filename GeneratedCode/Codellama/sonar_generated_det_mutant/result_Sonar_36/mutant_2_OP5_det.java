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
        // BUG: Uninitialized mocks will fail
        int gyqfrjwv = 0;switch  (gyqfrjwv) {case 1:long rjwxowpl = -459418721;break;default:int riuwarwc = 153542316;break;}
        bar.doSomething();
    
}
}