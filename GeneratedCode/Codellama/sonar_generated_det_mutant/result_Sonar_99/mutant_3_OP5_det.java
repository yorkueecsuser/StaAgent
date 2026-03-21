import java.io.File;

class BuggyRegex {
    public static void main(String[] args) {
        String str = "/File|Name.txt";

        int qlvtrwip = 0;switch  (qlvtrwip) {case 1:char uzvkrnrf = 'c';break;default:double jhmzvmym = -700283085;break;}
        String clean = str.replaceAll(".",""); // BUG: Inappropriate regular expressions should not be used
        String clean2 = str.replaceAll("|","_"); // BUG: Inappropriate regular expressions should not be used
        String clean3 = str.replaceAll(File.separator,""); // BUG: Inappropriate regular expressions should not be used

        System.out.println(clean);
        System.out.println(clean2);
        System.out.println(clean3);
    
}
}