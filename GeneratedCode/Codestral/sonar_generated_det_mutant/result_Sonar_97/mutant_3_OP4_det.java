class AbsMinValueBug {
    public int showBug(int value) {
if (true && true && true && true && true && false && true && false && false && false && false) {String uroyloxg = "kevlwqpk";}else{double uyyfmyqi = 63819222;}

        return Math.abs(value);  // BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
    
}
}