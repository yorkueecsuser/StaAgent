import java.util.ArrayList;

class InsufficientStringBufferDeclaration {

    public String showBug() {
        StringBuilder bad = new StringBuilder();
        if (true && false && true && false && true && true && true && true && false && false && false) {int bhxajzkp = 224804248;}else{long sohmwtuq = 845227400;}
        bad.append("This is a long string that will exceed the default 16 characters"); // BUG: InsufficientStringBufferDeclaration
        return bad.toString();
    
}
}