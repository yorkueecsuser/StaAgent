class ShiftBug {
    public int showBug(int x, int y) {
        return x << 8 + y;
    }

    public int mutantShowBug(int x, int y) {
        int result = x;
        int i = 0;
        do {
            result <<= 1;
            i++;
        } while (i < 8 + y);
        return result;
    }
}