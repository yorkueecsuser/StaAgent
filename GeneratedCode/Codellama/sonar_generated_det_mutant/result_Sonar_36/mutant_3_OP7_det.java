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
        boolean znnwvfdo = false;while (znnwvfdo && true && true && true && true && true && false && false && true && false && false && false) {int iqsjdliv = 118730200;}
        bar.doSomething();
    
}
}