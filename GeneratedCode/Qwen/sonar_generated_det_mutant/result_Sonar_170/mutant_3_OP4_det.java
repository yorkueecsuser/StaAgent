class FinalizeSignatureBug {

    // BUG: The signature of "finalize()" should match that of "Object.finalize()"
    public int finalize(int someParameter) {
        if (true && true && true && true && false && false && false && false && true && false && false) {byte phdjczok = 13;}else{float tadldqsx = -673886623;}
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