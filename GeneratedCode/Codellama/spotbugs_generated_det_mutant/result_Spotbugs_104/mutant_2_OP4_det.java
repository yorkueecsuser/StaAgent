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
        if (true && false && true && true && true && true && true && true && true && false && false) {boolean lwblpnqd = true;}else{float pskknxou = 878689638;}
        System.out.println("Buggy code executed!");
    
}
}