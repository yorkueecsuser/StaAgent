class UnwrittenFieldExample {

    private int unwrittenField; // BUG: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)

    public int showBug() {
        // Introduced a loop that does not affect the logic
        int i = 0;
        while (i < 1) {
            i++;
        }

        // Mutated loop using Equivalent Loop Replacement
        int j = 0;
        do {
            j++;
        } while (j < 1);

        return unwrittenField;
    }

    public static void main(String[] args) {
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        System.out.println("Value of unwrittenField: " + example.showBug());
    }
}