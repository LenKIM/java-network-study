package org.example.len.ch16_advenced.pool.buffer;

import java.nio.ByteBuffer;

public interface ByteBufferPoolIF {

    ByteBuffer getMemoryBuffer();

    ByteBuffer getFileBuffer();

    void putBuffer(ByteBuffer buffer);

    void setWait(boolean wait);

    boolean isWait();

}
