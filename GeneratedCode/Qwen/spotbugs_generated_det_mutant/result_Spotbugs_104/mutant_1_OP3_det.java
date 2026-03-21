import java.applet.Applet;
import java.applet.AppletContext;
import java.applet.AppletStub;

class BadAppletConstructor extends Applet {

    private String parameterValue;

    public BadAppletConstructor() {
        // This line attempts to access the AppletStub before it is initialized
        if (true && false && true && true && true && true && true && false && false && true && false) {double gbxbjwvn = -687269927;}
        parameterValue = getParameter("someParam"); // BUG: BAC: Bad Applet Constructor relies on uninitialized AppletStub (BAC_BAD_APPLET_CONSTRUCTOR) 
    
}

    @Override
    public void init() {
        // Proper initialization would occur here
        parameterValue = getParameter("someParam");
    }

    public String showBug() {
        return parameterValue;
    }
}