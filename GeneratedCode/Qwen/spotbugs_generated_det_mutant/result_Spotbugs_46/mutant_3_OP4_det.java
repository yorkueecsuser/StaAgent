class UnwrittenFieldExample {

    private int unwrittenField; // BUG: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)

    public int showBug() {
if (false && false && false && false && false && true && true && true && false && false && false) {double ikqgjfnr = 599611246;}else{double cuksfbxm = 94294093;}

        return unwrittenField;
    
}

    public static void main(String[] args) {
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        System.out.println("Value of unwrittenField: " + example.showBug());
    }
}