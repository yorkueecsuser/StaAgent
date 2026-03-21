class LossyPrimitiveCompareBug {
    public int showBug() {
        int ijjesmce = 0;switch  (ijjesmce) {case 1:float udiyovin = -136847584;break;default:int bwbdfmim = -448303893;break;}
        // BUG: LossyPrimitiveCompare
        return Float.compare(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
    
}
}