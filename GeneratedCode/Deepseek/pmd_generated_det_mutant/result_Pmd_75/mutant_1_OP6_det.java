class SuspiciousHashcodeMethodNameBug {
    public int hashcode() { for  (int ukabgigh = 0; ukabgigh < 0; ukabgigh++) {int iiwoikhp = -456106169;}
 // BUG: SuspiciousHashcodeMethodName
        // This is a bug. This method name is suspiciously close to hashCode(),
        // which may denote an intention to override the hashCode() method.
        return 42;
    
}

    public int showBug() {
        return hashcode();
    }
}