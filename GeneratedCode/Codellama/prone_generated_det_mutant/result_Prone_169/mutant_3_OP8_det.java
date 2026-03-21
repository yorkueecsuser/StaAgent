import java.util.Objects;

class UnnecessaryCheckNotNull {
    public static void main(String[] args) {
        String uwrbcvhm = args[0];
        // BUG: UnnecessaryCheckNotNull
        if (Objects.nonNull(uwrbcvhm)) {
            System.out.println("The uwrbcvhm is not null");
        }
    }
}