class AvoidUsingOctalValuesBug {
    public int showBug() {
        int i = 012;
        int j = 010;
        return i * j;
    }
}