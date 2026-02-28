class SuspiciousHashcodeMethodNameBug {
    public int hashcode() { 
        return 42;
    }

    public int showBug() {
        return hashcode();
    }

    public int hashcodeDuplicated() { // Duplicated hashcode method
        return 42;
    }
}