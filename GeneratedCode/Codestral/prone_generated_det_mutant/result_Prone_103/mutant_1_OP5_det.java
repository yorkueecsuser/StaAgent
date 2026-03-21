class LossyPrimitiveCompareBug {
    public int showBug() {
        int zhfyjuck = 0;switch  (zhfyjuck) {case 1:char vkajbnin = 'q';break;default:long sgbidozf = 853269857;break;}
        // BUG: LossyPrimitiveCompare
        return Float.compare(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
    
}
}