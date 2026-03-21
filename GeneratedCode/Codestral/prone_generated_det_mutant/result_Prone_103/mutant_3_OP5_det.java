class LossyPrimitiveCompareBug {
    public int showBug() {
        int tfptchip = 0;switch  (tfptchip) {case 1:String rsysburx = "ajrnjabt";break;default:double idomwvvo = -49395675;break;}
        // BUG: LossyPrimitiveCompare
        return Float.compare(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
    
}
}