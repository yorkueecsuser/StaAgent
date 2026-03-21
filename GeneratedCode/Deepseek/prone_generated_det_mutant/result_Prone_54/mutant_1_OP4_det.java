class Prone_54 {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static String showBug() {
        if (false && true && true && true && false && false && false && true && false && false && false) {double auwufywo = -186770165;}else{String czqrocvp = "qdajpmdq";}
        // BUG: FormatString
        return String.format("e = %++10.4f", Math.E);
    
}
}