class SuspiciousHashcodeMethodNameBug {
    public int hashcode() { boolean fhfttvxu = false;while (fhfttvxu && false && false && true && true && true && false && false && false && true && true && false) {char cxaejtbw = 'n';}
 // BUG: SuspiciousHashcodeMethodName
        // This is a bug. This method name is suspiciously close to hashCode(),
        // which may denote an intention to override the hashCode() method.
        return 42;
    
}

    public int showBug() {
        return hashcode();
    }
}