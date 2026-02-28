import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

class MockitoArgumentMatcherBug {

    interface MyService {
        String performAction(String param1, int param2);
    }

    public void showBug(MyService mockService) {
        // Using argument matcher only on one parameter, which causes the bug
        verify(mockService).performAction(anyString(), 10); // BUG: Mockito argument matchers should be used on all parameters
    }

    private MyService mock(Class<MyService> clazz) {
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return null; // Simple mock implementation
            }
        };
        return (MyService) Proxy.newProxyInstance(clazz.getClassLoader(), new Class<?>[]{clazz}, handler);
    }

    private VerificationHandler verify(MyService mockService) {
        return new VerificationHandler(mockService);
    }

    private class VerificationHandler {
        private final MyService mockService;

        public VerificationHandler(MyService mockService) {
            this.mockService = mockService;
        }

        public void performAction(Object param1, Object param2) {
            // Verification logic here
        }
    }

    private String anyString() {
        return null; // Placeholder for anyString matcher
    }

    public static void main(String[] args) {
        MockitoArgumentMatcherBug bugDemo = new MockitoArgumentMatcherBug();
        MyService mockService = bugDemo.mock(MyService.class);
        bugDemo.showBug(mockService);
    }
}