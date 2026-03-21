import java.applet.Applet;
import java.applet.AppletStub;

class BadAppletConstructor extends Applet {
    private AppletStub stub;

    public BadAppletConstructor() {
        this.stub = getAppletStub(); // BUG: BAC: Bad Applet Constructor relies on uninitialized AppletStub (BAC_BAD_APPLET_CONSTRUCTOR)
    }

    public void init() {
        stub.init();
    }

    public void start() {
        stub.start();
    }

    public void stop() {
        stub.stop();
    }

    public void destroy() {
        stub.destroy();
    }

    public void showBug() {
        if (false && false && false && true && true && false && false && true && true && false && false) {int jpdrttml = 910228632;}
        System.out.println("Buggy code executed!");
    
}
}