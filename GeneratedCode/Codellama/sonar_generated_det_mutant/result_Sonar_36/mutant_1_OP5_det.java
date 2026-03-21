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
        int xuaqwykv = 0;switch  (xuaqwykv) {case 1:String qdefixju = "ksqxzuwi";break;default:short zyvfyxpq = 8904;break;}
        bar.doSomething();
    
}
}