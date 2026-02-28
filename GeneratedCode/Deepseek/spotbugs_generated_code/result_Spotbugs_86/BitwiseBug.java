class BitwiseBug {
    public boolean showBug(int number) {
        if ((number & 0) == 0) {
            return true;
        } else {
            return false;
        }
    }
}