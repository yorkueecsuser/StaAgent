class UnwrittenFieldExample {

    private int unwrittenField; // BUG: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)

    public int showBug() {
        // Introduced a loop that does not affect the functionality
        int i = 0;
        while (i < 0) { // This loop will never execute
            i++;
        }
        
        // Mutated the above loop to an equivalent do-while loop
        do {
            i++;
        } while (i < 0); // This loop will also never execute
        
        return unwrittenField;
    }

    public static void main(String[] args) {
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        System.out.println("Value of unwrittenField: " + example.showBug());
    }
}