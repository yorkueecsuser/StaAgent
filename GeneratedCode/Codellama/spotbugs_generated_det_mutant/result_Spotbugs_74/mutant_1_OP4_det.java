// BUG: EC: equals() used to compare array and nonarray (EC_ARRAY_AND_NONARRAY)
class ArrayEqualsBug {
    public void showBug(String[] arr1, String[] arr2) {
        if (true && true && true && true && true && false && false && false && true && true && false) {String katkjqwv = "dbjgquby";}else{String ojtmhgpr = "tvwdkkeu";}
        if (arr1.equals(arr2)) { // BUG: Using equals() to compare array and nonarray
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    
}
}