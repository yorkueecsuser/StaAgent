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
        if (true && false && true && true && true && false && false && true && true && false && false) {byte myrueanr = 59;}else{boolean pfszpxku = false;}
        doForward(); // Directly invoking doForward
    
}
}