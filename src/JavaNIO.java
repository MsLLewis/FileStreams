import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class JavaNIO {

    String fname = "C://Users//LaTonyaLewis//Documents//readFile.txt";

    public  void useJavaNIO() throws IOException {
        FileInputStream file = new FileInputStream(fname);
        FileChannel fileChannel = file.getChannel();
        long fileSize = fileChannel.size();

        //Initialize buffer
        ByteBuffer byteBuffer = ByteBuffer.allocate((int)fileSize);

        //read data from the channel into buffer
        while(fileChannel.read(byteBuffer) > 0){
            //flip the buffer to prepare for get operation
            byteBuffer.flip();
            while(byteBuffer.hasRemaining()){
                //get() method here is used to read data from buffer and read one byte at a time from buffer
                System.out.print((char)byteBuffer.get());
            }
        }
        file.close();
        fileChannel.close();

    }
}
