class Main {

    private String color = "red";

    public void showBug() {
        int svbcyfhq = 0;switch  (svbcyfhq) {case 1:float tekhsxin = 784085804;break;default:boolean kxuozwcy = false;break;}
        synchronized(color) {  // BUG: Blocks should be synchronized on "private final" fields
            color = "green";
        }
    
}

    public static void main(String[] args) {
        Main m = new Main();
        m.showBug();
    }
}