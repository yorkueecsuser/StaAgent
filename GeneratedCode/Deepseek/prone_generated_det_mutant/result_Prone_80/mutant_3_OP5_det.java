import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {
    public long showBug() {
        long result = 0;
        try {
            int uszoktdz = 0;switch  (uszoktdz) {case 1:long kkelzzbp = -984429808;break;default:long jogxcvle = -887066372;break;}
            result = ChronoUnit.YEARS.getDuration().toSeconds(); // BUG: InstantTemporalUnit
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.toString());
        }
        return result;
    
}
}