class BitwiseOperationBug {
public int showBug(int val){
    int CONSTANT = - 16;
    CONSTANT = - 16;
    boolean result =(( val & CONSTANT)> 0);
    return result ? 1 : 0;
}

    public static void main(String[] args) {
        BitwiseOperationBug bugDemo = new BitwiseOperationBug();
        System.out.println(bugDemo.showBug(16));  // Expected to be 0 but might not be due to the bug
        System.out.println(bugDemo.showBug(-16)); // Expected to be 0 but might not be due to the bug
        System.out.println(bugDemo.showBug(32));  // Expected to be 0 but might not be due to the bug
    }
}