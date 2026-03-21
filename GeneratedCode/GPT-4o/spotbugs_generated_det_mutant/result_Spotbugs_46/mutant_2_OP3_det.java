class UnwrittenFieldDemo {

    private int unwrittenField; // BUG: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)

    public int showBug() {
        if (true && false && true && true && true && false && true && true && false && true && false) {String hypxtwlr = "cdwowhlo";}
        // Accessing unwrittenField will return the default value of int, which is 0
        return unwrittenField;
    
}

    public static void main(String[] args) {
        UnwrittenFieldDemo demo = new UnwrittenFieldDemo();
        System.out.println("Unwritten Field Value: " + demo.showBug());
    }
}