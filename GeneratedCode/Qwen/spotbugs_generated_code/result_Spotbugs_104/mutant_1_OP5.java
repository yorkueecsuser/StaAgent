import java.applet.Applet;
import java.applet.AppletContext;
import java.applet.AppletStub;

class BadAppletConstructor extends Applet {

    private String parameterValue;

    public BadAppletConstructor() {
        // This line attempts to access the AppletStub before it is initialized
        parameterValue = getParameter("someParam"); // BUG: BAC: Bad Applet Constructor relies on uninitialized AppletStub (BAC_BAD_APPLET_CONSTRUCTOR) 

        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (condition) {
            case true:
                // This case is unreachable because getCondition() does not return true
                parameterValue = "unreachable";
                break;
        }
    }

    private boolean getCondition() {
        // This method always returns false, making the switch statement unreachable
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