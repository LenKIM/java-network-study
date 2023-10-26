package org.example.ch4.performance;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

class LearnJavaIoNioApplication {

    public static void main(String[] args) throws Exception {
        InputStream in = new FileInputStream("data.txt"); // filePath
        OutputStream out = new FileOutputStream("data2.txt"); // filePath

        int copyByte = 0;
        int data;
        long stime = System.currentTimeMillis();
        byte[] buffer = new byte[512];
//        복사 시간: 1029
//        복사된 배열의 크기: 375624
        while (true) {
            data = in.read();
            if (data == -1) {
                break;
            }
            out.write(data);
            copyByte++;
        }
        long etime = System.currentTimeMillis();

        in.close();
        out.close();
        System.out.println("복사 시간: " + (etime - stime));
        System.out.println("복사된 배열의 크기: " + copyByte);


    }
}
