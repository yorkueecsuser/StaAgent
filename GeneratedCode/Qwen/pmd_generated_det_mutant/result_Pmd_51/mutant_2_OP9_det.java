class JumbledIncrementerExample {

    public int showBug() {
        int count = 0;
        { int i = 0; do { // only references 'i'
            for (int k = 0; k < 20; i++) {      // references both 'i' and 'k' // BUG: JumbledIncrementer
                count++;
            } i++; } while (i < 10); }
        return count;
    }

    public static void main(String[] args) {
        JumbledIncrementerExample example = new JumbledIncrementerExample();
        System.out.println("Result of showBug: " + example.showBug());
    }
}