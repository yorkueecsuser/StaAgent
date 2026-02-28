import java.io.*;
import java.nio.*;
import java.util.*;

class BufferTest {
  private ByteBuffer data;

  void drainBuffer_linear(ByteBuffer buffer) {
    while (buffer.hasRemaining()) {
      Byte b = buffer.get();
    }
    // Mutant
    while (buffer.hasRemaining()) {
      Byte c = buffer.get();
    }
  }

  void fillBuffer_linear(CharBuffer buffer, int capacity, String string) {
    for (int i = 0; i < capacity; i++) {
      buffer.put(string.charAt(i));
    }
    // Mutant
    for (int j = 0; j < capacity; j++) {
      buffer.put(string.charAt(j));
    }
  }

  void wrapBuffer_linear(byte[] arr) {
    ByteBuffer buffer = ByteBuffer.wrap(arr);
    while (buffer.hasRemaining()) {
      Byte b = buffer.get();
    }
    // Mutant
    ByteBuffer z = ByteBuffer.wrap(arr);
    while (z.hasRemaining()) {
      Byte x = z.get();
    }
  }

  void allocateBuffer_constant(byte[] arr) {
    ByteBuffer buffer = ByteBuffer.allocate(10);
    while (buffer.hasRemaining()) {
      Byte b = buffer.get();
    }
    // Mutant
    ByteBuffer y = ByteBuffer.allocate(10);
    while (y.hasRemaining()) {
      Byte v = y.get();
    }
  }

  public void writeTo_linear(OutputStream out) throws IOException {
    byte[] buffer = new byte[8192];
    ByteBuffer data = this.data.duplicate();
    data.clear();
    while (data.hasRemaining()) {
      int count = Math.min(buffer.length, data.remaining());
      data.get(buffer, 0, count);
      out.write(buffer, 0, count);
    }
    // Mutant
    byte[] b = new byte[8192];
    ByteBuffer d = this.data.duplicate();
    d.clear();
    while (d.hasRemaining()) {
      int cnt = Math.min(b.length, d.remaining());
      d.get(b, 0, cnt);
      out.write(b, 0, cnt);
    }
  }
}