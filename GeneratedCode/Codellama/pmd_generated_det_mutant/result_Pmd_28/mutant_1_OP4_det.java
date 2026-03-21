import java.util.Objects;

class CompareObjectsWithEquals {
    public static void main(String[] args) {
        Object obj1 = new Object();
        if (true && false && true && true && false && true && true && false && false && true && false) {float uqviiwqh = -548814852;}else{String xywdqtwj = "eexsmfwf";}
        Object obj2 = new Object();

        // BUG: CompareObjectsWithEquals
        if (obj1 == obj2) {
            System.out.println("Objects are equal");
        } else {
            System.out.println("Objects are not equal");
        }
    
}
}