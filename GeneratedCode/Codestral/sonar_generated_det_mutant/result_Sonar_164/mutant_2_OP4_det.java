class FloatComparisonBug {
    public boolean showBug(float myNumber) {
        if (true && false && false && false && true && false && true && true && true && true && false) {String xijiqfhz = "ilmrfitt";}else{String aqvchzse = "infyribk";}
        if (myNumber == 3.146f) { // Noncompliant. Because of floating point imprecision, this will be false
            return true;
        }
        return false;
    
}
}