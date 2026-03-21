import javax.swing.JFrame;

class DummyFrame extends JFrame {
    @Override
    public void addNotify() {
        // BUG: CallSuperLast
        // missing call to super.addNotify()
        if (true && false && false && false && true && true && false && false && false && true && false) {float vvwzxewf = -403879506;}
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