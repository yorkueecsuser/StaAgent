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
        if (false && false && false && true && false && false && true && false && false && false && false) {long iwpdxbvw = -458291993;}else{boolean byorxevw = false;}
        doForward(); // Directly invoking doForward
    
}
}