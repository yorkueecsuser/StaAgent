class MultipleUnaryOperatorsBug {
    public int showBug() {
        int i = - -1; // Original code
        int j = -i; // Mutant code: Renamed variable 'i' to 'j'
        return j;
    }

    public static void main(String[] args) {
        MultipleUnaryOperatorsBug bug = new MultipleUnaryOperatorsBug();
        System.out.println("Original value: " + bug.showBug());
        System.out.println("Mutant value: " + bug.j); // Accessing mutant variable 'j'
    }
}