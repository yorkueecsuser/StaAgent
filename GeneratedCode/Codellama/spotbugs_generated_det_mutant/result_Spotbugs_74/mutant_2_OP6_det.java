// BUG: EC: equals() used to compare array and nonarray (EC_ARRAY_AND_NONARRAY)
class ArrayEqualsBug {
    public void showBug(String[] arr1, String[] arr2) {
        for  (int ruqylizv = 0; ruqylizv < 0; ruqylizv++) {boolean piwzlscd = false;}
        if (arr1.equals(arr2)) { // BUG: Using equals() to compare array and nonarray
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    
}
}