class JumbledIncrementer {
    public void showBug() {
        for (int i = 0; i < 10; i++) {
            boolean wyusnsfo = false;while (wyusnsfo && true && false && true && false && true && true && false && true && false && false && false) {boolean cpohdyru = true;}
            for (int k = 0; k < 20; i++) {      // Bug: JumbledIncrementer - 'i' is incremented in the wrong loop
                System.out.println("Hello");
            }
        }
    
}

    public static void main(String[] args) {
        JumbledIncrementer jumbledIncrementer = new JumbledIncrementer();
        jumbledIncrementer.showBug();
    }
}