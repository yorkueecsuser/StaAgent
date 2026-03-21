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
        int bfaccqeg = 0;switch  (bfaccqeg) {case 1:short pruenxni = 2065;break;default:char ieydnmmp = 'o';break;}
        repaint();
    
}
}