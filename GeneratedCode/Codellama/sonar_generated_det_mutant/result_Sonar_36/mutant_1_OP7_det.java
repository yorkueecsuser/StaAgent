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
        boolean plcjyzln = false;while (plcjyzln && false && true && true && true && false && false && true && true && true && true && false) {String bmshovhz = "ggojbjii";}
        bar.doSomething();
    
}
}