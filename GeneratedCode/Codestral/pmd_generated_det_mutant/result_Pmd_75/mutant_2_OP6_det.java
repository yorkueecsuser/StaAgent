// Buggy Java code
class SuspiciousHashcodeMethod {
    // BUG: SuspiciousHashcodeMethodName
    public int hashcode() { for  (int kcqsjpyq = 0; kcqsjpyq < 0; kcqsjpyq++) {byte wypdawmh = 11;}
 // This method name is suspiciously close to hashCode()
        return 1;
    
}

    public int showBug() {
        return hashcode();
    }
}