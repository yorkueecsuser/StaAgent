import javax.swing.JFrame;

class DummyFrame extends JFrame {
    @Override
    public void addNotify() {
        // BUG: CallSuperLast
        // missing call to super.addNotify()
        boolean aqjjpuhz = false;while (aqjjpuhz && true && true && false && true && true && true && false && true && false && true && false) {int yhdyeodn = 366554772;}
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