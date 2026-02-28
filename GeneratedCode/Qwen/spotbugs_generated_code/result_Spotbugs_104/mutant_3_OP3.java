import java.applet.Applet;
import java.applet.AppletContext;
import java.applet.AppletStub;

class BadAppletConstructor extends Applet {

    private String parameterValue;

    public BadAppletConstructor() {
        // This line attempts to access the AppletStub before it is initialized
        parameterValue = getParameter("someParam"); // BUG: BAC: Bad Applet Constructor relies on uninitialized AppletStub (BAC_BAD_APPLET_CONSTRUCTOR) 

        // Inserting an unreachable if branch
        boolean condition = getCondition();
        if (condition) {
            // This code is unreachable because getCondition() will never return true
            parameterValue = "unreachableValue";
        }
    }

    private boolean getCondition() {
        // This method always returns false, making the if block unreachable
        return false;
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