import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

        FileReaderWriterCharacter fileReaderDemo = new FileReaderWriterCharacter();
      //  fileReaderDemo.readFile();
       // fileReaderDemo.readAllChar();
      //  fileReaderDemo.useFileWriter();
       // fileReaderDemo.readAndWrite();
      //  fileReaderDemo.usePrintWriter();

      //  FileCharacterAndByteStream fileReaderWriterByteStream = new FileCharacterAndByteStream();
      //  fileReaderWriterByteStream.useFileInputStream();
      //  fileReaderWriterByteStream.useFileInputAndFileOutputStream();

        JavaNIO javaNIO =  new JavaNIO();
        javaNIO.useJavaNIO();



    }
}