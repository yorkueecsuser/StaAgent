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
        boolean lsazuyit = false;while (lsazuyit && true && false && true && false && false && false && true && true && true && false && false) {short twmztwku = 1421;}
        doForward(); // Directly invoking doForward
    
}
}