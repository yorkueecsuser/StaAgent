class MultipleUnaryOperatorsBug {
    public int showBug() {
        int i = - -1; // Original statement
        int j = i; // Mutant statement: Duplicating the assignment statement
        return i;
    }

    public static void main(String[] args) {
        MultipleUnaryOperatorsBug bug = new MultipleUnaryOperatorsBug();
        System.out.println("Buggy value: " + bug.showBug());
    }
}