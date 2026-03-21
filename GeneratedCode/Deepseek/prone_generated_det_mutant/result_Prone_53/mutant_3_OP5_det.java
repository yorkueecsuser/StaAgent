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
        int tiybyfvx = 0;switch  (tiybyfvx) {case 1:int grusbswb = -536956887;break;default:String qqkotxtj = "vdemxcpj";break;}
        doForward(); // Directly invoking doForward
    
}
}