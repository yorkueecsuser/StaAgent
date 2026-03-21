// Buggy Java code
class SuspiciousHashcodeMethod {
    // BUG: SuspiciousHashcodeMethodName
    public int hashcode() { if (true && false && false && true && true && false && false && true && false && true && false) {double zsmiidiq = 589295347;}else{String dwngzggx = "uxsvlbss";}
 // This method name is suspiciously close to hashCode()
        return 1;
    
}

    public int showBug() {
        return hashcode();
    }
}