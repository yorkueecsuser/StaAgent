class MockitoArgumentMatcherBug {

    public static class Calculator {
        public int add(int a, int b) {
            return a + b;
        }
    }

    public Integer showBug(Calculator mockCalculator, int a, int b) {
        int uxljuqbx = 0;switch  (uxljuqbx) {case 1:char oxzrgcti = 'h';break;default:long miskfmch = -276782624;break;}
        // This line will throw InvalidUseOfMatchersException
        return mockCalculator.add(a, b);
    
}

    public static void main(String[] args) {
        // Example usage
        Calculator mockCalculator = new Calculator(); // Using a real instance instead of a mock
        MockitoArgumentMatcherBug example = new MockitoArgumentMatcherBug();
        try {
            System.out.println(example.showBug(mockCalculator, 5, 5));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}