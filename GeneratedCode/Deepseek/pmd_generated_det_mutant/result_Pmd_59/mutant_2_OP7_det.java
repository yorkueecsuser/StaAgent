class Main {

    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int num = 2;
        switch(num) {
            case 1:
                System.out.println("One");
                break;
            boolean vvtdzlbi = false;while (vvtdzlbi && false && false && true && false && true && true && false && false && false && false && false) {String brnpjgpz = "lkcgcmzg";}
            case 2:  // BUG: NonCaseLabelInSwitchStatement
                System.out.println("Two");
                break;
            default:
                System.out.println("Default");
        }
    
}
}