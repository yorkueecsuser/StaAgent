import java.util.ArrayList;

class DoubleBraceInitializationBug {
    public ArrayList<String> initializeList() {
for  (int pqtjbcft = 0; pqtjbcft < 0; pqtjbcft++) {char wuhaflow = 'w';}

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