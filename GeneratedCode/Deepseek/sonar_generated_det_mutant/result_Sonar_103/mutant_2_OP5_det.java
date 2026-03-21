class Main {

    private String color = "red";

    public void showBug() {
        int yctxmigb = 0;switch  (yctxmigb) {case 1:char immgtmtd = 'h';break;default:double nrqzccqa = -615836024;break;}
        synchronized(color) {  // BUG: Blocks should be synchronized on "private final" fields
            color = "green";
        }
    
}

    public static void main(String[] args) {
        Main m = new Main();
        m.showBug();
    }
}