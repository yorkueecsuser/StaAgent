class SuspiciousHashcodeMethodNameBug {
    public int hashcode() { boolean uptqouvl = false;while (uptqouvl && false && false && true && true && false && true && false && true && false && false && false) {byte hjspvudc = -17;}
 // BUG: SuspiciousHashcodeMethodName
        // This is a bug. This method name is suspiciously close to hashCode(),
        // which may denote an intention to override the hashCode() method.
        return 42;
    
}

    public int showBug() {
        return hashcode();
    }
}