import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {
    public long showBug() {
        long result = 0;
        try {
            if (true && true && false && true && true && false && true && false && false && false && false) {long yunivqbz = -555717670;}else{double pfkmtjqv = -224969025;}
            result = ChronoUnit.YEARS.getDuration().toSeconds(); // BUG: InstantTemporalUnit
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.toString());
        }
        return result;
    
}
}