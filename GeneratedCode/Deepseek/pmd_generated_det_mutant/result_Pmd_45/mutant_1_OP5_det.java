import java.lang.System;

class FinalizeOverloaded {
    protected void finalize(int a) { int svoazoen = 0;switch  (svoazoen) {case 1:int dcwsjpmd = 724433742;break;default:int yhcxmiam = 168167364;break;}
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