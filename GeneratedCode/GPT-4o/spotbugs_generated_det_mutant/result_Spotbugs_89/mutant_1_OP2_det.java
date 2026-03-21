class SelfComputationExample {

    private int x = 42;
public int showBug() {
    int result = x & x;
    result = x & x;
    return result;
}

    public static void main(String[] args) {
        SelfComputationExample example = new SelfComputationExample();
        int result = example.showBug();
        System.out.println("Result of nonsensical self computation: " + result);
    }
}