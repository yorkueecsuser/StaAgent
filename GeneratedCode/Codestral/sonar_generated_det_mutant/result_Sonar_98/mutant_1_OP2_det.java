import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

class StreamReadBug {
public int [] showBug(byte [] data){
    InputStream is = new ByteArrayInputStream(data);
    byte [] buffer = new byte [ 1000 ];
    buffer = new byte [ 1000 ];
    int [] result = new int [ 1000 ];
    try { is.read(buffer); for(int i = 0; i < buffer.length; i ++){ result [ i ] = buffer [ i ]; } } catch(IOException e){ e.printStackTrace(); }
    return result;
}
}