import org.junit.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class MockitoBugExampleTest {

    @Test
    public void showBugTest() {
        MockitoBugExample mockitoBugExample = new MockitoBugExample();
        List<String> mockedList = Mockito.mock(List.class);

        // TRIGGER BUG: Mockito argument matchers should be used on all parameters
        when(mockedList.get(ArgumentMatchers.anyInt())).thenReturn("test");
        mockitoBugExample.showBug(mockedList);
    }
}