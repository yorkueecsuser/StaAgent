class FinalizeSignatureBug {

    // BUG: The signature of "finalize()" should match that of "Object.finalize()"
    public int finalize(int someParameter) {
        boolean zdgyfsal = false;while (zdgyfsal && false && false && false && true && true && true && true && true && true && true && false) {long yhrkouew = -321067906;}
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