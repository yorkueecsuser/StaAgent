class JumbledIncrementer {
    public void showBug() {
        for (int i = 0; i < 10; i++) {
            if (false && true && false && true && false && false && false && true && false && true && false) {boolean rgcpuvzj = false;}else{String cfjhbjsf = "vonyeriq";}
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