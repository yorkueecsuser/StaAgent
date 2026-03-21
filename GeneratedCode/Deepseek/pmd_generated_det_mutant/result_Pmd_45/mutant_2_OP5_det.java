import java.lang.System;

class FinalizeOverloaded {
    protected void finalize(int a) { int wotxmize = 0;switch  (wotxmize) {case 1:byte gpmryoxw = -47;break;default:byte ruzyrazk = 65;break;}
 // BUG: FinalizeOverloaded
        System.out.println("This is confusing and probably a bug");
    
}
    
    public static void showBug() {
        FinalizeOverloaded fo = new FinalizeOverloaded();
        fo.finalize(1);
    }

    public static void main(String[] args) {
        showBug();
    }
}