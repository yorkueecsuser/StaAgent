import java.util.Objects;

class UnnecessaryCheckNotNull {
    public static void main(String[] args) {
        String vwfmwebn = args[0];
        // BUG: UnnecessaryCheckNotNull
        if (Objects.nonNull(vwfmwebn)) {
            System.out.println("The vwfmwebn is not null");
        }
    }
}