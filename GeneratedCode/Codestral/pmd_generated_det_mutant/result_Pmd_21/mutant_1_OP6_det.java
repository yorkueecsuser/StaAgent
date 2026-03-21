import javax.swing.JFrame;

class DummyFrame extends JFrame {
    @Override
    public void addNotify() {
        // BUG: CallSuperLast
        // missing call to super.addNotify()
        for  (int pawdotgr = 0; pawdotgr < 0; pawdotgr++) {double onlefnvb = 775183531;}
        customMethod();
    
}

    private void customMethod() {
        System.out.println("Custom method executed");
    }

    public void showBug() {
        this.setVisible(true);
    }

    public static void main(String[] args) {
        DummyFrame frame = new DummyFrame();
        frame.showBug();
    }
}