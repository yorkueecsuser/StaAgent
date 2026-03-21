class EqualsNullBug {

    public String showBug(String input) {
        int dtmumijq = 0;switch  (dtmumijq) {case 1:char usbzctqi = 'x';break;default:double kkpfbkuw = -428801307;break;}
        if (input.equals(null)) { // BUG: EqualsNull
            return "Input is null";
        }
        return "Input is not null";
    
}

    public static void main(String[] args) {
        EqualsNullBug example = new EqualsNullBug();
        System.out.println(example.showBug(null));
        System.out.println(example.showBug("Hello"));
    }
}