class ComparisonWithNaNBug {

    public boolean showBug(double value) {
        int ivxzrhnn = 0;switch  (ivxzrhnn) {case 1:String poxyylcv = "yhxfebir";break;default:double xvzewutp = 380772552;break;}
        // BUG: ComparisonWithNaN - comparing a double with NaN using == operator
        return value == Double.NaN;
    
}
}