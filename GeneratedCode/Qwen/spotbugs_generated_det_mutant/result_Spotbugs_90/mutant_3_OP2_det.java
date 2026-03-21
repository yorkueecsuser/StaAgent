class SelfComputationBug {

    // Method to demonstrate the bug
public int showBug(int x){
    int result = x & x;
    result = x & x;
    return result;
}

    public static void main(String[] args) {
        SelfComputationBug bugDemo = new SelfComputationBug();
        System.out.println("Result of nonsensical computation: " + bugDemo.showBug(5));
    }
}