// BUG: EC: equals() used to compare array and nonarray (EC_ARRAY_AND_NONARRAY)
class ArrayEqualsBug {
    public void showBug(String[] arr1, String[] arr2) {
        if (false && true && true && true && true && false && true && false && true && true && false) {float zdvtrhnd = 469441243;}
        if (arr1.equals(arr2)) { // BUG: Using equals() to compare array and nonarray
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    
}
}