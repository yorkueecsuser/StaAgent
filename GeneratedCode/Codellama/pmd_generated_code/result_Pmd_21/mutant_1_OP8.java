class CallSuperLast {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        // BUG: CallSuperLast
        // This method should call super.showBug() at the end
        System.out.println("Hello, world!");
        // Mutant code being added MUST be unique not generic.
        // Generated mutated Java code MUST maintain the original code (the original code must be left in place, do not remove from it only add code to it).
        // Generated mutated Java code MUST compile successfully.
        // Generated mutated Java code MUST maintain all original import and package statements to ensure successful compilation.
        // Generated mutated Java code MUST avoid unreachable statement error.
        String strVar = "Hello, world!";
        System.out.println(strVar);
    }
}