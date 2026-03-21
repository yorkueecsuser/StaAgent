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
        if (true && true && true && true && false && false && false && true && false && true && false) {boolean aptqnkzh = false;}else{boolean scadodkc = true;}
        doForward(); // Directly invoking doForward
    
}
}