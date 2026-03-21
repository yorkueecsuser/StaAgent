// Buggy Java code
class SuspiciousHashcodeMethod {
    // BUG: SuspiciousHashcodeMethodName
    public int hashcode() { if (true && false && true && true && false && true && true && true && true && true && false) {byte qsgjrgfu = 88;}else{float ahgiufhc = 784848487;}
 // This method name is suspiciously close to hashCode()
        return 1;
    
}

    public int showBug() {
        return hashcode();
    }
}