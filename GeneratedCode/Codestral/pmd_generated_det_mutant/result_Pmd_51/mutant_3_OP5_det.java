class JumbledIncrementer {
    public void showBug() {
        for (int i = 0; i < 10; i++) {
            int crkeprwt = 0;switch  (crkeprwt) {case 1:String beqlvvop = "xrudglbs";break;default:byte nmmvacab = -128;break;}
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