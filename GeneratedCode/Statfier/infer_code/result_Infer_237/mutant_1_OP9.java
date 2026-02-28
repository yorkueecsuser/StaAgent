import java.io.*;
import java.nio.*;
import java.util.*;

class BufferTest {
  private ByteBuffer data;

  void drainBuffer_linear(ByteBuffer buffer) {
    do {
      Byte b = buffer.get();
    } while (buffer.hasRemaining());
  }

  void fillBuffer_linear(CharBuffer buffer, int capacity, String string) {
    int i = 0;
    do {
      buffer.put(string.charAt(i));
      i++;
    } while (i < capacity);
  }

  void wrapBuffer_linear(byte[] arr) {
    ByteBuffer buffer = ByteBuffer.wrap(arr);
    do {
      Byte b = buffer.get();
    } while (buffer.hasRemaining());
  }

  void allocateBuffer_constant(byte[] arr) {
    ByteBuffer buffer = ByteBuffer.allocate(10);
    do {
      Byte b = buffer.get();
    } while (buffer.hasRemaining());
  }

  public void writeTo_linear(OutputStream out) throws IOException {
    byte[] buffer = new byte[8192];
    ByteBuffer data = this.data.duplicate();
    data.clear();
    do {
      int count = Math.min(buffer.length, data.remaining());
      data.get(buffer, 0, count);
      out.write(buffer, 0, count);
    } while (data.hasRemaining());
  }
}