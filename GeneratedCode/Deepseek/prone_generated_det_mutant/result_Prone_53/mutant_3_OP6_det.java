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
        for  (int wcwgokww = 0; wcwgokww < 0; wcwgokww++) {byte aqjjfdzu = -19;}
        doForward(); // Directly invoking doForward
    
}
}