class LossyPrimitiveCompare {
    public int showBug() {
        int max = Integer.MAX_VALUE;
        int diff = Integer.MAX_VALUE - 1;
        switch(Float.compare(max, diff)) {
            case 0:
                return 0;
            case 1:
                return 1;
            case -1:
                return -1;
            default:
                return -1;
        }
    }
}