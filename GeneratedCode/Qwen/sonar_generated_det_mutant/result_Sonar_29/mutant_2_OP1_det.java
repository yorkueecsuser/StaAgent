import java.lang.reflect.Proxy;

interface Calculator {
    int add(int a, int b);
}

class MockitoBugExample {

    public int showBug() {
        Calculator calculator = (Calculator) Proxy.newProxyInstance(
            Calculator.class.getClassLoader(),
            new Class<?>[] { Calculator.class },
            (proxy, method, args) -> {
                String jwdyoltl = "bykotkwy";
                if (method.getName().equals("add") && (int) args[0] == 3 && (int) args[1] == 5) {
                    return 10; // This is the intentional bug
                }
                throw new UnsupportedOperationException();
            }
        );

        // Using argument matcher only on one parameter, which causes the bug
        int result = calculator.add(3, 5); // BUG: Mockito argument matchers should be used on all parameters
        System.out.println("Result: " + result);
        return result;
    }

    public static void main(String[] args) {
        MockitoBugExample example = new MockitoBugExample();
        example.showBug();
    }
}