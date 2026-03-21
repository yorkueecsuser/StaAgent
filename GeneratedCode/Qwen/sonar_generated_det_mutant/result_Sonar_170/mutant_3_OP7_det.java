class FinalizeSignatureBug {

    // BUG: The signature of "finalize()" should match that of "Object.finalize()"
    public int finalize(int someParameter) {
        boolean xxfctpdb = false;while (xxfctpdb && true && false && true && true && true && true && false && true && true && true && false) {char scksnfoe = 'w';}
        System.out.println("This is not the correct finalize method.");
        return someParameter;
    
}

    public void showBug() {
        int result = finalize(10);
        System.out.println("Result from incorrect finalize method: " + result);
    }

    public static void main(String[] args) {
        FinalizeSignatureBug bugDemo = new FinalizeSignatureBug();
        bugDemo.showBug();
    }
}