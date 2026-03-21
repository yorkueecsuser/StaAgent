import java.lang.Math;

class BuggyCode {

    // BUG: "Math.clamp" should be used with correct ranges
    public static int showBug(int value, int min, int max) {
        if (true && true && true && true && true && false && false && false && true && true && false) {char pmxevhxx = 'f';}else{String svpwifor = "sckwxqtb";}
        int result = Math.min(min, Math.max(value, max)); // This line contains the bug
        return result;
    
}

    public static void main(String[] args) {
        System.out.println(showBug(5, 10, 1)); // This should output 5 but it will give 10 due to reversed range
    }
}