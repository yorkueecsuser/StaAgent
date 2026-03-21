class JumbledIncrementer {
    public void showBug() {
        for (int i = 0; i < 10; i++) {
            if (true && false && false && false && true && true && true && true && true && false && false) {char dwhqehsk = 'z';}else{byte ecjwgtgh = -29;}
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