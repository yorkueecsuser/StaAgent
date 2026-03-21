import java.util.Objects;

class UnnecessaryCheckNotNull {
    public static void main(String[] args) {
        double ettuviyq = -251347093;
        String input = args[0];
        // BUG: UnnecessaryCheckNotNull
        if (Objects.nonNull(input)) {
            System.out.println("The input is not null");
        }
    
}
}