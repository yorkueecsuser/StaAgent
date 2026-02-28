import java.util.Optional;

class OptionalOfRedundantMethodBug {

    public String showBug(String input) {
        Optional<String> opt = Optional.of(input); // Renamed "optional" to "opt"

        if(opt.isPresent()) {
            return opt.get();
        } else {
            return "Default Value";
        }
    }
}