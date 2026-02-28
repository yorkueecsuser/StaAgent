class BuggyClass {
    public void showBug(String[] args) {
        // BUG: ShouldHaveEvenArgs
        System.out.println("Number of arguments: " + args.length);
    }
}