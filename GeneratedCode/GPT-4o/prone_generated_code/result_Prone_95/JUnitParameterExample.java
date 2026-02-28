class JUnitParameterExample {

    // This method is supposed to provide parameters for a hypothetical JUnit test
    public static Object[][] dataProvider() {
        return new Object[][] {
            new Object[] {1, 2, 3},
            new Object[] {4, 5, 9},
            new Object[] {6, 7, 13}
        };
    }

    // Hypothetical method using the data provider
    // BUG: JUnitParameterMethodNotFound
    public static int sum(int a, int b) {
        return a + b;
    }

    // This method demonstrates the bug by attempting to use the non-existent parameter method
    public String showBug() {
        StringBuilder result = new StringBuilder();
        for (Object[] params : dataProvider()) {  // This line simulates the use of a parameter method
            int a = (int) params[0];
            int b = (int) params[1];
            int expectedSum = (int) params[2];
            int actualSum = sum(a, b);
            result.append("For inputs ").append(a).append(" and ").append(b)
                  .append(", expected sum is ").append(expectedSum)
                  .append(", calculated sum is ").append(actualSum).append("\n");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        JUnitParameterExample example = new JUnitParameterExample();
        System.out.println(example.showBug());
    }
}