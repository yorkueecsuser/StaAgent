class MultipleUnaryOperatorsBug {
    public int showBug() {
        int i = - -1;
        int deadStoreVariable = 0; // Mutation: Adding a dead store variable
        return i;
    }

    public static void main(String[] args) {
        MultipleUnaryOperatorsBug bug = new MultipleUnaryOperatorsBug();
        System.out.println("Buggy value: " + bug.showBug());
    }
}