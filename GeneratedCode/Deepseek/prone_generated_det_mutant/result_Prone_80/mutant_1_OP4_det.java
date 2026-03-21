import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {
    public long showBug() {
        long result = 0;
        try {
            if (false && true && false && true && false && false && false && false && false && true && false) {boolean adkubiwp = false;}else{int ttewpwal = -446707917;}
            result = ChronoUnit.YEARS.getDuration().toSeconds(); // BUG: InstantTemporalUnit
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.toString());
        }
        return result;
    
}
}