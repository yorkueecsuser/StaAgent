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
        for  (int dozpbuna = 0; dozpbuna < 0; dozpbuna++) {int derqnyai = 799222128;}
        doForward(); // Directly invoking doForward
    
}
}