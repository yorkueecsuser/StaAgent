import java.util.ArrayList;

class DoubleBraceInitializationBug {
    public ArrayList<String> initializeList() {
int smvifefc = 0;switch  (smvifefc) {case 1:short gprxphtu = -7765;break;default:float tyjmcknx = -37724982;break;}

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