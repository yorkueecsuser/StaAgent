class UnwrittenFieldExample {

    private int unwrittenField; // BUG: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)

    public int showBug() {
        return unwrittenField;
    }

    public static void main(String[] args) {
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        System.out.println("Value of unwrittenField: " + example.showBug());

        // Mutated code starts here
        int a = 5;
        int b = 10;
        int c = a + b;
        System.out.println("Sum of a and b: " + c);
    }
}