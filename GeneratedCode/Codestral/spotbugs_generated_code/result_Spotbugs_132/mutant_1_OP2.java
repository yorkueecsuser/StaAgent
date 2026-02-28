class UselessStringBug {
    public String showBug() {
        int[] array = {1, 2, 3, 4, 5};
        // Original bug
        String arrayString = array.toString();

        // Mutant: Duplication of the assignment statement
        String duplicateArrayString = array.toString();

        return arrayString;
    }

    public static void main(String[] args) {
        UselessStringBug bug = new UselessStringBug();
        System.out.println(bug.showBug());
    }
}