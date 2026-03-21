class Main {

    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int nqimjhfh = 2;
        switch(nqimjhfh) {
            case 1:
                System.out.println("One");
                break;
            case 2:  // BUG: NonCaseLabelInSwitchStatement
                System.out.println("Two");
                break;
            default:
                System.out.println("Default");
        }
    }
}