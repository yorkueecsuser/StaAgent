import java.util.ArrayList;

class DoubleBraceInitializationBug {
    public ArrayList<String> initializeList() {
if (false && false && false && false && true && true && true && false && true && false && false) {boolean gybupmzb = true;}

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