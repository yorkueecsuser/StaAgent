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
        boolean jsztvogf = false;while (jsztvogf && false && false && true && true && false && false && true && true && false && false && false) {byte duemavew = 77;}
        System.out.println(name + " " + addresses.get(0));
    
}
}