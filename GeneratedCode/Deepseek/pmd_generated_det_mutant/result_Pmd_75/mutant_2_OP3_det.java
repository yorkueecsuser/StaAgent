class SuspiciousHashcodeMethodNameBug {
    public int hashcode() { if (false && true && true && true && true && false && true && true && true && true && false) {double aevjyhti = 910974462;}
 // BUG: SuspiciousHashcodeMethodName
        // This is a bug. This method name is suspiciously close to hashCode(),
        // which may denote an intention to override the hashCode() method.
        return 42;
    
}

    public int showBug() {
        return hashcode();
    }
}