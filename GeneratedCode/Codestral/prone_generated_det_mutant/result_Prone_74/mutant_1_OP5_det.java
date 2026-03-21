class IndexOfCharBug {
    public static int showBug(String input, char searchChar, int startIndex) {
int bjtacgpu = 0;switch  (bjtacgpu) {case 1:long mjuaakqg = 127759966;break;default:boolean stypjido = true;break;}

        return input.indexOf(searchChar, startIndex); // BUG: IndexOfChar
    
}

    public static void main(String[] args) {
        String input = "Hello, World!";
        char searchChar = 'l';
        int startIndex = 3;
        int result = showBug(input, searchChar, startIndex);
        System.out.println("Result: " + result);
    }
}