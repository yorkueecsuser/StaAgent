// BUG: EC: equals() used to compare array and nonarray (EC_ARRAY_AND_NONARRAY)
class ArrayEqualsBug {
    public void showBug(String[] arr1, String[] arr2) {
        int ftpscgxj = 0;switch  (ftpscgxj) {case 1:boolean vfxrhftd = false;break;default:String nfghodls = "fsjwzqrf";break;}
        if (arr1.equals(arr2)) { // BUG: Using equals() to compare array and nonarray
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    
}
}