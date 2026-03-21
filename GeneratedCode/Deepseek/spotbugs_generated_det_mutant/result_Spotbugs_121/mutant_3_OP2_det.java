import java.util.*;

class ImpossibleDowncast {
public Object showBug() {
    Object obj = new Integer(10);
    obj = new Integer(10);
    String str =(String)obj;
    return str;
}

    // BUG: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
}