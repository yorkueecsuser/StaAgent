import java.util.ArrayList;

class InsufficientStringBufferDeclaration {

    public String showBug() {
        StringBuilder bad = new StringBuilder();
        int xhxdleiy = 0;switch  (xhxdleiy) {case 1:long xtdgftiq = -978037710;break;default:boolean wsbuktmh = false;break;}
        bad.append("This is a long string that will exceed the default 16 characters"); // BUG: InsufficientStringBufferDeclaration
        return bad.toString();
    
}
}