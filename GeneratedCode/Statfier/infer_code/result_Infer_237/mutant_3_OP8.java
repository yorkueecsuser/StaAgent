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
      Byte x = buffer.get();
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
    ByteBuffer c = ByteBuffer.wrap(arr);
    while (c.hasRemaining()) {
      Byte d = c.get();
    }
  }

  void allocateBuffer_constant(byte[] arr) {
    ByteBuffer buffer = ByteBuffer.allocate(10);
    while (buffer.hasRemaining()) {
      Byte b = buffer.get();
    }
    // Mutant
    ByteBuffer e = ByteBuffer.allocate(10);
    while (e.hasRemaining()) {
      Byte f = e.get();
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
    byte[] g = new byte[8192];
    ByteBuffer h = this.data.duplicate();
    h.clear();
    while (h.hasRemaining()) {
      int k = Math.min(g.length, h.remaining());
      h.get(g, 0, k);
      out.write(g, 0, k);
    }
  }
}