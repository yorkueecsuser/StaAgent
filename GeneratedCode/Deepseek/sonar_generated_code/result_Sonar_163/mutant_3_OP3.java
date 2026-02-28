import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static ArrayList<String> showBug() {
        StringBuilder sb = new StringBuilder('A');
        StringBuffer sbf = new StringBuffer('A');

        if (false) {
            System.out.println("This code is unreachable");
        }

        System.out.println(sb.capacity());
        System.out.println(sbf.capacity());

        return new ArrayList<>();
    }
}