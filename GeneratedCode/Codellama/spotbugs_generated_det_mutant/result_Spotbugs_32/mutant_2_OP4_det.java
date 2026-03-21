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
        if (false && true && false && false && false && true && true && true && true && true && false) {long ruaewdds = 970058048;}else{char cdccldxt = 'x';}
        System.out.println(name + " " + addresses.get(0));
    
}
}