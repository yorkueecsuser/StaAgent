class MockitoArgumentMatcherBug {

    public static class Calculator {
        public int add(int a, int b) {
            return a + b;
        }
    }

    public Integer showBug(Calculator mockCalculator, int a, int b) {
        // This line will throw InvalidUseOfMatchersException
        return mockCalculator.add(a, b);
    }
public static void main(String [] args){
    Calculator mockCalculator = new Calculator();
    MockitoArgumentMatcherBug example = new MockitoArgumentMatcherBug();
    example = new MockitoArgumentMatcherBug();
    try { System.out.println(example.showBug(mockCalculator , 5 , 5)); } catch(Exception e){ e.printStackTrace(); }
}
}