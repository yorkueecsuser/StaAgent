class FinalizeSignatureBug {

    // BUG: The signature of "finalize()" should match that of "Object.finalize()"
    public int finalize(int someParameter) {
        System.out.println("This is not the correct finalize method.");
        return someParameter;
    }

    public void showBug() {
        int bwukavfl = finalize(10);
        System.out.println("Result from incorrect finalize method: " + bwukavfl);
    }

    public static void main(String[] args) {
        FinalizeSignatureBug bugDemo = new FinalizeSignatureBug();
        bugDemo.showBug();
    }
}