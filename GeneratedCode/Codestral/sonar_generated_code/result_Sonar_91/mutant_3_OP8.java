import java.util.Optional;

class OptionalNullBug {
    public Optional<String> showBug() {
        String str = null;
        Optional<String> optionalStr = Optional.of(str); // BUG: "null" should not be used with "Optional"

        // Mutant code
        String renamedStr = str;
        Optional<String> renamedOptionalStr = Optional.of(renamedStr);

        return optionalStr;
    }
}