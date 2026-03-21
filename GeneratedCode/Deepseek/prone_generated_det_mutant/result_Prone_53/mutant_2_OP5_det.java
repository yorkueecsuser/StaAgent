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
        int akompiwg = 0;switch  (akompiwg) {case 1:float ejqrmqtv = 995414234;break;default:float dlkzmbcq = 386517341;break;}
        doForward(); // Directly invoking doForward
    
}
}