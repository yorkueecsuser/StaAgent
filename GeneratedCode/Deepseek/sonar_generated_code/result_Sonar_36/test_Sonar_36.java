import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertNotNull;
@RunWith(MockitoJUnitRunner.class)
public class FooTest {
    @Mock
    private Bar bar;

    @Mock
    private Baz baz;

    @InjectMocks
    private Foo fooUnderTest;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testShowBug() {
        fooUnderTest.showBug(); // TRIGGER BUG: Annotated Mockito objects should be initialized
    }

    @Test
    public void testGetBar() {
        assertNotNull(fooUnderTest.getBar());
    }

    @Test
    public void testGetBaz() {
        assertNotNull(fooUnderTest.getBaz());
    }
}