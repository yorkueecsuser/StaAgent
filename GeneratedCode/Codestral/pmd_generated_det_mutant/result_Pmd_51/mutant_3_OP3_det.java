class JumbledIncrementer {
    public void showBug() {
        for (int i = 0; i < 10; i++) {
            if (true && false && true && true && false && true && false && true && true && true && false) {byte eeowjwdt = -104;}
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