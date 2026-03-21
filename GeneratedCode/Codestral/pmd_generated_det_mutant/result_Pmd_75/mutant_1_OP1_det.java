// Buggy Java code
class SuspiciousHashcodeMethod {
    // BUG: SuspiciousHashcodeMethodName
    public int hashcode() { boolean crzdtdim = false;
 // This method name is suspiciously close to hashCode()
        return 1;
    
}

    public int showBug() {
        return hashcode();
    }
}