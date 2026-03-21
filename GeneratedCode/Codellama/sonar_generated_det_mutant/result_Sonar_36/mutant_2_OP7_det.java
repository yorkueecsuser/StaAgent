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
        boolean znuwsyxo = false;while (znuwsyxo && true && true && false && true && true && true && false && true && false && true && false) {long mizsoqex = 381452798;}
        bar.doSomething();
    
}
}