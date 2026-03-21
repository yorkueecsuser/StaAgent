import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {
    public long showBug() {
        long result = 0;
        try {
            if (false && false && true && true && false && true && false && true && false && false && false) {boolean eezjzmzp = false;}
            result = ChronoUnit.YEARS.getDuration().toSeconds(); // BUG: InstantTemporalUnit
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.toString());
        }
        return result;
    
}
}