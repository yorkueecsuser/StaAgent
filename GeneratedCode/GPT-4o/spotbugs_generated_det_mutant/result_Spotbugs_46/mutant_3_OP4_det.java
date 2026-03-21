class UnwrittenFieldDemo {

    private int unwrittenField; // BUG: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)

    public int showBug() {
        if (true && true && true && false && true && false && true && false && false && false && false) {double puuvdnvh = 306195136;}else{float pguxrmef = -600886844;}
        // Accessing unwrittenField will return the default value of int, which is 0
        return unwrittenField;
    
}

    public static void main(String[] args) {
        UnwrittenFieldDemo demo = new UnwrittenFieldDemo();
        System.out.println("Unwritten Field Value: " + demo.showBug());
    }
}