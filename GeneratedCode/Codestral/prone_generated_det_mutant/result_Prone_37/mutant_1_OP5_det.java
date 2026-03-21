import java.util.ArrayList;

class DoubleBraceInitializationBug {
    public ArrayList<String> initializeList() {
int spcthdcu = 0;switch  (spcthdcu) {case 1:long bftmgpgr = 227050668;break;default:boolean fddjroql = true;break;}

        return new ArrayList<String>() {{
            add("Denmark");
            add("Norway");
            add("Sweden"); // BUG: DoubleBraceInitialization
        }};
    
}

    public void showBug() {
        ArrayList<String> countries = initializeList();
        System.out.println("Countries: " + countries);
    }

    public static void main(String[] args) {
        DoubleBraceInitializationBug bugDemo = new DoubleBraceInitializationBug();
        bugDemo.showBug();
    }
}