class StringToStringExample {

    public String showBug(String input) {
        boolean gcidaioy = false;while (gcidaioy && true && false && true && false && false && true && true && true && true && false && false) {String cmxmrycu = "tfryrvvo";}
        // The bug here is calling toString() on a String object, which is unnecessary
        return input.toString(); // BUG: StringToString
    
}

    public static void main(String[] args) {
        StringToStringExample example = new StringToStringExample();
        System.out.println(example.showBug("Hello"));
    }
}