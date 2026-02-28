import java.applet.Applet;
import java.applet.AppletContext;
import java.applet.AppletStub;

class BadAppletConstructor extends Applet {

    private String parameterValue;

    public BadAppletConstructor() {
        // This line attempts to access the AppletStub before it is initialized
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

    // Mutated code starts here
    private int z; // Original variable name 'parameterValue' is not renamed as it is related to the bug

    public void someMethod() {
        z = 10; // Using the mutated variable 'z'
    }

    public int getZ() {
        return z;
    }
}