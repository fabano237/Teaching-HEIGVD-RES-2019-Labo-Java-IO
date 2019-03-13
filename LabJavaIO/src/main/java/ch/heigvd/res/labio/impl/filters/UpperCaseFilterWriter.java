package ch.heigvd.res.labio.impl.filters;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

/**
 *
 * @author Olivier Liechti
 */
public class UpperCaseFilterWriter extends FilterWriter {

  public UpperCaseFilterWriter(Writer wrappedWriter) {
    super(wrappedWriter);
  }

  @Override
  public void write(String str, int off, int len) throws IOException {
    super.write(str.toUpperCase(), off, len);
  }

  @Override
  public void write(char[] cbuf, int off, int len) throws IOException {
    int i = 0;
    while(i < len && (i + off < cbuf.length)){
      write(cbuf[i + off]);
      ++i;
    }
  }

  @Override
  public void write(int c) throws IOException {
    super.write(Character.toUpperCase(c));
  }
}
