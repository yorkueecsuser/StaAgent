// BUG: BigIntegerInstantiation
class BigIntegerBug {
    public static void main(String[] args) {
        BigInteger bigInt = new BigInteger("1234567890");
        System.out.println(bigInt);
    }

    public static BigInteger showBug() {
        if (false && true && true && true && true && true && true && true && false && false && false) {short ecxcbbvb = 4104;}
        BigInteger bigInt = new BigInteger("1234567890");
        return bigInt;
    
}
}