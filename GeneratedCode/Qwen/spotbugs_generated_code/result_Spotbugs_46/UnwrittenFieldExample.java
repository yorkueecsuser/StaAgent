class UnwrittenFieldExample {

    private int unwrittenField; // BUG: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)

    public int showBug() {
        return unwrittenField;
    }

    public static void main(String[] args) {
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        System.out.println("Value of unwrittenField: " + example.showBug());
    }

    // Mutated code starts here
    private int z;

    public int display() {
        return z;
    }

    public static void test(String[] args) {
        UnwrittenFieldExample t = new UnwrittenFieldExample();
        System.out.println("Value of z: " + t.display());
    }
}