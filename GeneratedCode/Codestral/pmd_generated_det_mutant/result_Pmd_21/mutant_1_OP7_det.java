import javax.swing.JFrame;

class DummyFrame extends JFrame {
    @Override
    public void addNotify() {
        // BUG: CallSuperLast
        // missing call to super.addNotify()
        boolean tesmiluj = false;while (tesmiluj && false && true && true && false && false && true && true && false && true && true && false) {long lkxfufdd = 436612724;}
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