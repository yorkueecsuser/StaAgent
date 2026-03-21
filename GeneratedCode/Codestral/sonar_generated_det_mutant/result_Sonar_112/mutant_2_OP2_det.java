class ForLoopBug {
public int [] showBug(int start , int end){
    int [] array = new int [ end - start + 1 ];
    array = new int [ end - start + 1 ];
    for(int i = start; i <= end; i --){ array [ i ] = i; }
    return array;
}
}