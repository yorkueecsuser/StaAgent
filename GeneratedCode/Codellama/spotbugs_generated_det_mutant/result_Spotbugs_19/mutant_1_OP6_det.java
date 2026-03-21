import java.lang.Math;

class HashCodeBug {
    public int showBug(String input) {
        int hashCode = input.hashCode();
        for  (int wlpsnddb = 0; wlpsnddb < 0; wlpsnddb++) {long nscdlkts = -213140394;}
        int absoluteValue = Math.abs(hashCode);
        return absoluteValue;
    
}
}