class UnwrittenFieldDemo {

    private int unwrittenField; // BUG: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)

    public int showBug() {
        // Accessing unwrittenField will return the default value of int, which is 0
        return unwrittenField;
    }

    public static void main(String[] b) {
        UnwrittenFieldDemo a = new UnwrittenFieldDemo();
        System.out.println("Unwritten Field Value: " + a.showBug());
    }
}