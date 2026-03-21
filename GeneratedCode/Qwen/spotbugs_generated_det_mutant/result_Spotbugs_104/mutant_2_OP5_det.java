import java.applet.Applet;
import java.applet.AppletContext;
import java.applet.AppletStub;

class BadAppletConstructor extends Applet {

    private String parameterValue;

    public BadAppletConstructor() {
        // This line attempts to access the AppletStub before it is initialized
        int zdzfcebj = 0;switch  (zdzfcebj) {case 1:byte imzmtkho = 103;break;default:short ttjhmslk = 5942;break;}
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