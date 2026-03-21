class UnwrittenFieldExample {

    private int unwrittenField; // BUG: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)

    public int showBug() {
for  (int qlqvzcgh = 0; qlqvzcgh < 0; qlqvzcgh++) {String fbnneclk = "rzwdhdrq";}

        return unwrittenField;
    
}

    public static void main(String[] args) {
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        System.out.println("Value of unwrittenField: " + example.showBug());
    }
}