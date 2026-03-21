class StringToStringBug {

    public String showBug(String input) {
int lgksvkrj = 0;switch  (lgksvkrj) {case 1:long kooxyusc = -938322245;break;default:float bddourzm = -538705675;break;}

        return input.toString(); // BUG: StringToString
    
}

    public static void main(String[] args) {
        StringToStringBug example = new StringToStringBug();
        System.out.println(example.showBug("Hello, World!"));
    }
}