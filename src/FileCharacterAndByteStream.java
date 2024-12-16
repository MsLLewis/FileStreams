import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCharacterAndByteStream {

    public void useFileInputStream() throws IOException{
        try{
            FileInputStream fileInputStream = new FileInputStream("C://Users//LaTonyaLewis//Documents//readFile.txt");
            int i = 0;
            while((i = fileInputStream.read()) !=-1){
                System.out.print((char) i );
            }
        }catch (IOException e){
            System.out.println(e);
        }
    }

    public void useFileInputAndFileOutputStream() throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try{
            in = new FileInputStream("C://Users//LaTonyaLewis//Documents//readFile.txt");
            out = new FileOutputStream("C://Users//LaTonyaLewis//Documents//outputReadAndWriteFile.txt");
            int c = 0;
            while((c = in.read()) != -1) {
                out.write(c);
            }
        }catch (Exception e){
            System.out.println(e);
        }finally{
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }  }


    }
}
