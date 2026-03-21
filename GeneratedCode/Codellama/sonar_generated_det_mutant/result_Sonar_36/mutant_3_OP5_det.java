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
        int oxwwnjnm = 0;switch  (oxwwnjnm) {case 1:short xuamsjvf = -6819;break;default:byte irmxctco = -50;break;}
        // BUG: Uninitialized mocks will fail
        bar.doSomething();
    
}
}