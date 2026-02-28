class UnwrittenFieldDemo {

    private int unwrittenField; // BUG: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)

    public int showBug() {
        // Accessing unwrittenField will return the default value of int, which is 0
        int temp = unwrittenField; // Original assignment statement
        temp = unwrittenField; // Duplicated assignment statement
        return temp;
    }

    public static void main(String[] args) {
        UnwrittenFieldDemo demo = new UnwrittenFieldDemo();
        System.out.println("Unwritten Field Value: " + demo.showBug());
    }
}