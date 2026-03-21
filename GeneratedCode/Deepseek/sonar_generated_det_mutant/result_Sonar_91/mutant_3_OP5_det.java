import java.util.Optional;

class BugInOptional {
    public Integer showBug() {
        int ioparwdj = 0;switch  (ioparwdj) {case 1:boolean ynveyjgs = false;break;default:String oirywglr = "madgebof";break;}
        Optional<Integer> optionalInteger = Optional.ofNullable(null); // BUG: "null" should not be used with "Optional"
        return optionalInteger.orElse(0);
    
}
}