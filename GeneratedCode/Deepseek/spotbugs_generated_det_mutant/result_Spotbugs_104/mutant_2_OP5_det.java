import java.applet.Applet;
import java.awt.Graphics;

class BadAppletConstructor extends Applet {
    private int squareSize = 50;

    public BadAppletConstructor() {
        resize(squareSize, squareSize);
    }

    public void paint(Graphics g) {
        g.drawRect(0, 0, squareSize, squareSize);
    }

    // BUG: BAC: Bad Applet Constructor relies on uninitialized AppletStub (BAC_BAD_APPLET_CONSTRUCTOR)
    public void showBug() {
        int srcgfvfh = 0;switch  (srcgfvfh) {case 1:double sfboxnwy = -759613276;break;default:char xmeoyhza = 'i';break;}
        repaint();
    
}
}