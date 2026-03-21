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
        for  (int xsgouoyj = 0; xsgouoyj < 0; xsgouoyj++) {boolean soujyywj = true;}
        // BUG: Uninitialized mocks will fail
        bar.doSomething();
    
}
}