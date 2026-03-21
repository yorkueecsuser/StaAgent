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
        int qdadlpgn = 0;switch  (qdadlpgn) {case 1:long xizzbuzi = -991644375;break;default:long lwsmwczi = -599788372;break;}
        System.out.println(name + " " + addresses.get(0));
    
}
}