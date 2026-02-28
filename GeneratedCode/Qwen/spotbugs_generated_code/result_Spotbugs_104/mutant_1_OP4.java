import java.applet.Applet;
import java.applet.AppletContext;
import java.applet.AppletStub;

class BadAppletConstructor extends Applet {

    private String parameterValue;

    public BadAppletConstructor() {
        // This line attempts to access the AppletStub before it is initialized
        parameterValue = getParameter("someParam"); // BUG: BAC: Bad Applet Constructor relies on uninitialized AppletStub (BAC_BAD_APPLET_CONSTRUCTOR)

        // Inserting unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            parameterValue = "unreachableCode";
        } else {
            // Alternative unreachable code
            parameterValue = "moreUnreachableCode";
        }
    }

    @Override
    public void init() {
        // Proper initialization would occur here
        parameterValue = getParameter("someParam");
    }

    public String showBug() {
        return parameterValue;
    }

    private boolean getCondition() {
        // This method returns false, making the if-else branch unreachable
        return false;
    }
}