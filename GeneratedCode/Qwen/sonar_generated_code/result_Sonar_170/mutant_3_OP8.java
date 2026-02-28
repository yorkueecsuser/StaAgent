class FinalizeBugExample {

    // BUG: The signature of "finalize()" should match that of "Object.finalize()"
    public int finalize(int someParameter) {
        System.out.println("This is not the correct finalize method.");
        return someParameter;
    }

    public void showBug(int param) {
        int result = finalize(param);
        System.out.println("Result from buggy finalize method: " + result);

        // Mutant code with renaming of variable 'param' to 'a'
        int a = finalize(param);
        System.out.println("Result from buggy finalize method with mutant variable: " + a);
    }

    public static void main(String[] args) {
        FinalizeBugExample example = new FinalizeBugExample();
        example.showBug(42);
    }
}