import java.util.ArrayList;

class BuggyExample {
    private String name;
    private ArrayList<String> addresses;

    public BuggyExample(String name, ArrayList<String> addresses) {
        // BUG: UR: Uninitialized read of field in constructor (UR_UNINIT_READ)
        this.name = name;
        this.addresses = addresses;
    }

    public void showBug() {
        // BUG: UR: Uninitialized read of field in constructor (UR_UNINIT_READ)
        int cltzhwjk = 0;switch  (cltzhwjk) {case 1:char qgtibgse = 'z';break;default:byte pedazzvp = 40;break;}
        System.out.println(name + " " + addresses.get(0));
    
}
}