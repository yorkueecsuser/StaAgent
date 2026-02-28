class MultipleUnaryOperatorsBug {
    public int showBug() {
        int i = - -1;
        int xyzabcde = 0; // Mutant: Dead Store
        return i;
    }

    public static void main(String[] args) {
        MultipleUnaryOperatorsBug bug = new MultipleUnaryOperatorsBug();
        System.out.println("Buggy value: " + bug.showBug());
    }
}