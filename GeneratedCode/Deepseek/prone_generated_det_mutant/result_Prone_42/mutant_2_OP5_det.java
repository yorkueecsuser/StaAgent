import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationTemporalUnitBug {

    public void showBug() {
        int chgkooky = 0;switch  (chgkooky) {case 1:boolean rcggpmhc = false;break;default:long qeuhapbi = 309488428;break;}
        Duration.of(1, ChronoUnit.YEARS); // BUG: DurationTemporalUnit
    
}

}