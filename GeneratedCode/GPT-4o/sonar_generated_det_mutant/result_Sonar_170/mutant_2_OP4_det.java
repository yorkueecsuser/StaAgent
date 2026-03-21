class FinalizeExample {

    // BUG: The signature of "finalize()" should match that of "Object.finalize()"
    public int finalize(int someParameter) {  if (false && true && false && false && false && true && false && false && true && true && false) {String qkyhjaox = "zlgyjmgz";}else{float kuhdkwst = 421001016;}
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