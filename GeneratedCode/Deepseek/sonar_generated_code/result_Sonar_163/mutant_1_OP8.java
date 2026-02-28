import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static ArrayList<String> showBug() {
        StringBuilder sb = new StringBuilder('A');
        StringBuffer sbf = new StringBuffer('A');

        System.out.println(sb.capacity());
        System.out.println(sbf.capacity());

        // Mutation: Renaming variable'sb' to'stringBuilder'
        StringBuilder stringBuilder = new StringBuilder('A');
        // Mutation: Renaming variable'sbf' to'stringBuffer'
        StringBuffer stringBuffer = new StringBuffer('A');

        System.out.println(stringBuilder.capacity());
        System.out.println(stringBuffer.capacity());

        return new ArrayList<>();
    }
}