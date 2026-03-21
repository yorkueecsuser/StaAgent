import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {
    public long showBug() {
        long result = 0;
        try {
            boolean ntcqxcov = false;while (ntcqxcov && true && true && false && true && true && false && true && false && false && true && false) {byte hlequbrx = 13;}
            result = ChronoUnit.YEARS.getDuration().toSeconds(); // BUG: InstantTemporalUnit
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.toString());
        }
        return result;
    
}
}