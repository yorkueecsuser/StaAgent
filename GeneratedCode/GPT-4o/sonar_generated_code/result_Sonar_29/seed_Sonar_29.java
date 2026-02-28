class MockitoArgumentMatchersExample {

    public static class Calculator {
        public int add(int a, int b) {
            return a + b;
        }
    }

    public static void showBug() {
        // Create a mock of the Calculator class
        Calculator calculator = mockCalculator();

        // Intentionally incorrect usage of matchers in Mockito.when()
        whenCalculatorAdd(calculator, 10); // BUG: Mockito argument matchers should be used on all parameters

        // Demonstration of the behavior
        System.out.println(calculator.add(1, 5)); // This will print 10 due to the stub
        System.out.println(calculator.add(2, 5)); // This will also print 10 due to the stub
    }

    // Mocking the Calculator class
    private static Calculator mockCalculator() {
        return new Calculator() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };
    }

    // Stubbing the method add
    private static void whenCalculatorAdd(Calculator calculator, int returnValue) {
        // Simulate the behavior of Mockito.when()
        calculator = new Calculator() {
            @Override
            public int add(int a, int b) {
                if (b == 5) return returnValue;
                else return super.add(a, b);
            }
        };
    }

    public static void main(String[] args) {
        showBug();
    }
}