class JumbledIncrementerExample {

    public void showBug() {
        { int i = 0; do { // only references 'i'
            for (int k = 0; k < 20; i++) {      // BUG: JumbledIncrementer
                System.out.println("Hello");
                break;
            } i++; } while (i < 10); }
    }

    public static void main(String[] args) {
        JumbledIncrementerExample example = new JumbledIncrementerExample();
        example.showBug();
    }
}