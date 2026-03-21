import java.util.Objects;

class UnnecessaryCheckNotNull {
    public static void main(String[] args) {
        String ggmsvett = args[0];
        // BUG: UnnecessaryCheckNotNull
        if (Objects.nonNull(ggmsvett)) {
            System.out.println("The ggmsvett is not null");
        }
    }
}