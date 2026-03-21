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
        if (false && true && true && false && false && false && true && true && true && false && false) {byte baxpdxqg = -45;}else{byte tijwjfqf = -22;}
        bar.doSomething();
    
}
}