class SuspiciousHashcodeMethodNameBug {
    public int hashcode() { if (true && true && true && false && false && false && true && true && false && false && false) {boolean jmlswoxm = true;}else{char txaeubgi = 'b';}
 // BUG: SuspiciousHashcodeMethodName
        // This is a bug. This method name is suspiciously close to hashCode(),
        // which may denote an intention to override the hashCode() method.
        return 42;
    
}

    public int showBug() {
        return hashcode();
    }
}