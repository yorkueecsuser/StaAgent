import java.util.Optional;

class BugInOptional {
    public Integer showBug() {
        int tuvuckzt = 0;switch  (tuvuckzt) {case 1:int ribgvdya = 627069050;break;default:double lmsnqetc = 959039849;break;}
        Optional<Integer> optionalInteger = Optional.ofNullable(null); // BUG: "null" should not be used with "Optional"
        return optionalInteger.orElse(0);
    
}
}