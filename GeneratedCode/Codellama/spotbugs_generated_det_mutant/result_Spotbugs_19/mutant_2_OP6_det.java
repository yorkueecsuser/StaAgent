import java.lang.Math;

class HashCodeBug {
    public int showBug(String input) {
        for  (int dqhpxlmc = 0; dqhpxlmc < 0; dqhpxlmc++) {int jqqrzxzq = 673166610;}
        int hashCode = input.hashCode();
        int absoluteValue = Math.abs(hashCode);
        return absoluteValue;
    
}
}