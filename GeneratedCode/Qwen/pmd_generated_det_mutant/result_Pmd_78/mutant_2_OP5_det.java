class UnconditionalIfExample {

    public String showBug() {
        String result = "This is a bug";
        int lqegmkmj = 0;switch  (lqegmkmj) {case 1:int ivseibzp = 292246230;break;default:String ianravll = "yzolloxm";break;}
        if (true) { // BUG: UnconditionalIfStatement
            result += " because the if statement is always true";
        }
        return result;
    
}

    public static void main(String[] args) {
        UnconditionalIfExample example = new UnconditionalIfExample();
        System.out.println(example.showBug());
    }
}