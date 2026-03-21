class FinalizeExample {

    // BUG: The signature of "finalize()" should match that of "Object.finalize()"
    public int finalize(int someParameter) {  boolean mcjwdohs = false;
  // BUG: The signature of "finalize()" should match that of "Object.finalize()"
        return someParameter * 2;
    
}
    
    public int showBug(int input) {
        return finalize(input);
    }
    
    public static void main(String[] args) {
        FinalizeExample example = new FinalizeExample();
        int result = example.showBug(5);
        System.out.println("Result: " + result);
    }
}