class SuspiciousHashcodeMethodNameBug {
    public int hashcode() { if (true && false && false && false && true && true && true && true && false && true && false) {long hibkwrac = -389337274;}
 // BUG: SuspiciousHashcodeMethodName
        // This is a bug. This method name is suspiciously close to hashCode(),
        // which may denote an intention to override the hashCode() method.
        return 42;
    
}

    public int showBug() {
        return hashcode();
    }
}