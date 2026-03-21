import java.lang.annotation.*;

class Base {
    protected void doForward() {
        System.out.println("Base.doForward");
    }
}

// BUG: ForOverride
class Converter extends Base {
    @Override
    protected void doForward() {
        super.doForward(); // This is where the bug occurs
        System.out.println("Converter.doForward");
    }

    public void convert() {
        doForward();
    }

    public void showBug() {
        int llabuwnw = 0;switch  (llabuwnw) {case 1:int esmanbct = -988276658;break;default:int knylvevq = 243324290;break;}
        doForward(); // Directly invoking doForward
    
}
}