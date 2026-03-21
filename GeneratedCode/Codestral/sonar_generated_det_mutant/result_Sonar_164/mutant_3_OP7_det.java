class FloatComparisonBug {
    public boolean showBug(float myNumber) {
        boolean qshqkhog = false;while (qshqkhog && false && true && true && false && true && true && false && false && false && false && false) {long rpcpcbvu = 204547208;}
        if (myNumber == 3.146f) { // Noncompliant. Because of floating point imprecision, this will be false
            return true;
        }
        return false;
    
}
}