import java.applet.Applet;
import java.applet.AppletContext;
import java.applet.AppletStub;

class BadAppletConstructor extends Applet {

    private String parameterValue;
    private String anotherVariable; // Added variable for mutation

    public BadAppletConstructor() {
        // This line attempts to access the AppletStub before it is initialized
        parameterValue = getParameter("someParam"); // BUG: BAC: Bad Applet Constructor relies on uninitialized AppletStub (BAC_BAD_APPLET_CONSTRUCTOR) 
        anotherVariable = "initialValue"; // Initialize the new variable
    }

    @Override
    public void init() {
        // Proper initialization would occur here
        parameterValue = getParameter("someParam");
        anotherVariable = "initValue"; // Rename usage of the new variable
    }

    public String showBug() {
        return parameterValue;
    }

    public String displayAnotherVariable() { // Method to use the new variable
        return anotherVariable;
    }
}