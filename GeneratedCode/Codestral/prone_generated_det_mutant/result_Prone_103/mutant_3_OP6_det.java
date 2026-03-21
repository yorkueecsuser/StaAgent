class LossyPrimitiveCompareBug {
    public int showBug() {
        for  (int qrukdpxm = 0; qrukdpxm < 0; qrukdpxm++) {char lbarkgmc = 'd';}
        // BUG: LossyPrimitiveCompare
        return Float.compare(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
    
}
}