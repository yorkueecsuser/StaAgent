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
        if (true && true && true && true && false && false && true && false && false && true && false) {int rpulmzou = -90064163;}
        // BUG: Uninitialized mocks will fail
        bar.doSomething();
    
}
}