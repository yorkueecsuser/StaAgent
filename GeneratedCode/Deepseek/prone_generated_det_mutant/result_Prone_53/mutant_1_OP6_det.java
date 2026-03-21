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
        for  (int xusnaxev = 0; xusnaxev < 0; xusnaxev++) {int bkgjxnkf = 318115895;}
        doForward(); // Directly invoking doForward
    
}
}