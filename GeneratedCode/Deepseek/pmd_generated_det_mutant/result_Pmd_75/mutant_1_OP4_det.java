class SuspiciousHashcodeMethodNameBug {
    public int hashcode() { if (false && true && false && false && true && false && false && false && true && true && false) {int goeumglg = 680572564;}else{float cnmvrwka = -34310581;}
 // BUG: SuspiciousHashcodeMethodName
        // This is a bug. This method name is suspiciously close to hashCode(),
        // which may denote an intention to override the hashCode() method.
        return 42;
    
}

    public int showBug() {
        return hashcode();
    }
}