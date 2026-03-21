import java.util.ArrayList;

class InsufficientStringBufferDeclaration {

    public String showBug() {
        StringBuilder bad = new StringBuilder();
        if (true && true && false && true && false && true && true && false && false && false && false) {int zhpcozej = 83651408;}else{int sgbbkdxg = -323892319;}
        bad.append("This is a long string that will exceed the default 16 characters"); // BUG: InsufficientStringBufferDeclaration
        return bad.toString();
    
}
}