import javax.swing.JFrame;

class DummyFrame extends JFrame {
    @Override
    public void addNotify() {
        // BUG: CallSuperLast
        // missing call to super.addNotify()
        int zztsttef = 0;switch  (zztsttef) {case 1:boolean qrbmwrgt = false;break;default:double fefcdtsu = -24730401;break;}
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