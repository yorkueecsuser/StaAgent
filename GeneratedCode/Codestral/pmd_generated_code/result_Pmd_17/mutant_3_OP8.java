class MultipleUnaryOperatorsBug {
    public int showBug() {
        int i = - -1;
        int j = i; // Mutant: Renaming the variable 'i' to 'j'
        return j;
    }

    public static void main(String[] args) {
        MultipleUnaryOperatorsBug bug = new MultipleUnaryOperatorsBug();
        System.out.println("Original value: " + bug.showBug());
        System.out.println("Mutant value: " + bug.j); // Using the new variable name 'j'
    }
}