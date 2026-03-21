class FloatComparisonBug {
    public boolean showBug(float myNumber) {
        for  (int jlklvxvt = 0; jlklvxvt < 0; jlklvxvt++) {long fmzumovf = -58112629;}
        if (myNumber == 3.146f) { // Noncompliant. Because of floating point imprecision, this will be false
            return true;
        }
        return false;
    
}
}