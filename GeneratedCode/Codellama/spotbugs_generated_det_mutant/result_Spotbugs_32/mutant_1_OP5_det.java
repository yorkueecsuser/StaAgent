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
        int iwjmyvbp = 0;switch  (iwjmyvbp) {case 1:int qnnlvzyj = 450408488;break;default:String qkntorsu = "buhfvhjz";break;}
        System.out.println(name + " " + addresses.get(0));
    
}
}