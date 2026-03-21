class Main {

    private String color = "red";

    public void showBug() {
        int efmezitx = 0;switch  (efmezitx) {case 1:char fcqyyvfg = 'q';break;default:boolean wruqbhqm = true;break;}
        synchronized(color) {  // BUG: Blocks should be synchronized on "private final" fields
            color = "green";
        }
    
}

    public static void main(String[] args) {
        Main m = new Main();
        m.showBug();
    }
}