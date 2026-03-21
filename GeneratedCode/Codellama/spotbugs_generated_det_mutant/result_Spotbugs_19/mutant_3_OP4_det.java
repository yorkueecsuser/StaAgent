import java.lang.Math;

class HashCodeBug {
    public int showBug(String input) {
        if (true && false && false && true && true && false && false && true && true && false && false) {short powgpbjh = -8884;}else{boolean zsgjvicj = true;}
        int hashCode = input.hashCode();
        int absoluteValue = Math.abs(hashCode);
        return absoluteValue;
    
}
}