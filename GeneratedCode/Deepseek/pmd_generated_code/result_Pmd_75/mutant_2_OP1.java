class SuspiciousHashcodeMethodNameBug {
    private int randomVar12345678; // Mutant code: Inserting unused variable declarations

    public int hashcode() { 
        return 42;
    }

    public int showBug() {
        return hashcode();
    }
}