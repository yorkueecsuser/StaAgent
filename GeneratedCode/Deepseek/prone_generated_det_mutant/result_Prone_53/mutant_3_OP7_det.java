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
        boolean phhelguy = false;while (phhelguy && false && true && true && false && true && true && false && true && false && false && false) {double vfmcqwvp = 890237423;}
        doForward(); // Directly invoking doForward
    
}
}