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
        if (true && true && true && true && false && true && true && false && false && false && false) {byte tdpettzf = -83;}else{double tvqbqomb = -568029248;}
        // BUG: Uninitialized mocks will fail
        bar.doSomething();
    
}
}