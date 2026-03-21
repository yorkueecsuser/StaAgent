class SuspiciousHashcodeMethodNameBug {
    public int hashcode() { if (false && true && false && false && true && false && false && false && true && false && false) {boolean hjicxenz = false;}
 // BUG: SuspiciousHashcodeMethodName
        // This is a bug. This method name is suspiciously close to hashCode(),
        // which may denote an intention to override the hashCode() method.
        return 42;
    
}

    public int showBug() {
        return hashcode();
    }
}