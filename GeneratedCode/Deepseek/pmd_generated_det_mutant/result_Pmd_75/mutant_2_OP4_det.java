class SuspiciousHashcodeMethodNameBug {
    public int hashcode() { if (false && false && true && true && true && true && false && true && false && true && false) {long lqmdulqn = 267726383;}else{byte hopqzwii = -13;}
 // BUG: SuspiciousHashcodeMethodName
        // This is a bug. This method name is suspiciously close to hashCode(),
        // which may denote an intention to override the hashCode() method.
        return 42;
    
}

    public int showBug() {
        return hashcode();
    }
}