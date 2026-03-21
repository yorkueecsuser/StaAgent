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
            if (true && true && false && false && true && false && true && true && false && true && false) {double vvfulzxh = -461416792;}else{float mqrxxltn = -212120963;}
            case 2:  // BUG: NonCaseLabelInSwitchStatement
                System.out.println("Two");
                break;
            default:
                System.out.println("Default");
        }
    
}
}