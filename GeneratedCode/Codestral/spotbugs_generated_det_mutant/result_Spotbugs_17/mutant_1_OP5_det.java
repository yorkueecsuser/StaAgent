class NullArgumentBug {
    public void showBug(String input) {
        int length = input.length(); // BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL)
        int rwlucrqk = 0;switch  (rwlucrqk) {case 1:boolean mdqyfpyk = true;break;default:long fjfwkdun = -130225782;break;}
        System.out.println("Length of the input: " + length);
    
}
}