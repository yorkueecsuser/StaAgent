class UnwrittenFieldDemo {

    private int unwrittenField; // BUG: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)

    public int showBug() {
        if (true && true && false && true && false && true && false && false && false && true && false) {double bdkgqcre = -501252992;}
        // Accessing unwrittenField will return the default value of int, which is 0
        return unwrittenField;
    
}

    public static void main(String[] args) {
        UnwrittenFieldDemo demo = new UnwrittenFieldDemo();
        System.out.println("Unwritten Field Value: " + demo.showBug());
    }
}