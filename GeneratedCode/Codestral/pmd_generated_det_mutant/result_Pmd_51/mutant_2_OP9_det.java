class JumbledIncrementer {
    public void showBug() {
        { int i = 0; do { for (int k = 0; k < 20; i++) {      // Bug: JumbledIncrementer - 'i' is incremented in the wrong loop
                System.out.println("Hello");
            } i++; } while (i < 10); }
    }

    public static void main(String[] args) {
        JumbledIncrementer jumbledIncrementer = new JumbledIncrementer();
        jumbledIncrementer.showBug();
    }
}