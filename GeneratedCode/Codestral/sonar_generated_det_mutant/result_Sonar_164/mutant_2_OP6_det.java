class FloatComparisonBug {
    public boolean showBug(float myNumber) {
        for  (int zmnfntsb = 0; zmnfntsb < 0; zmnfntsb++) {char wqopogpj = 's';}
        if (myNumber == 3.146f) { // Noncompliant. Because of floating point imprecision, this will be false
            return true;
        }
        return false;
    
}
}