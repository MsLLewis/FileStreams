import java.io.*;

public class FileReaderWriterCharacter {

    public  void readFile(){

        try{
            FileReader fr = new FileReader("C://Users//LaTonyaLewis//Documents//readFile.txt");
            System.out.println(fr.read());
            int data = fr.read();
            System.out.println((char)data);
            fr.close();
        }catch (Exception e){
            System.out.println("input file is not available ");
        }
    }

    public void readAllChar(){
        try{
            FileReader fr = new FileReader("C://Users//LaTonyaLewis//Documents//readFile.txt");
            int i = 0;
            while((i = fr.read()) !=-1){
                System.out.print((char) i);
            }
        }catch (Exception e){
            System.out.println("Cannot read the file");
            e.printStackTrace();
        }

    }

    public void useFileWriter() throws IOException {
        FileWriter fileWriter = new FileWriter("C://Users//LaTonyaLewis//Documents//newoutput.txt");
        char[] chars = new char[] {'A', 'B', 'C', 'D', 'E'};
        String content = "I love my country \n";
        fileWriter.write(content);
        fileWriter.write(chars);
        fileWriter.close();
    }

    public void readAndWrite() throws IOException {

        FileReader in = null;
        FileWriter out = null;
        try{
            in = new FileReader("C://Users//LaTonyaLewis//Documents//readFile.txt");
            out = new FileWriter("C://Users//LaTonyaLewis//Documents//readFileOutput.txt");
            int c;
            while((c = in.read()) !=-1){
                out.write(c);

            }
            System.out.println("Reading and Writing in a file is done.");
        }catch (Exception e){
            System.out.println(e);
        }finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();    }
        }


    }

    public void usePrintWriter(){
        String data = "This is text inside the file";

        try{
            PrintWriter output = new PrintWriter("C://Users//LaTonyaLewis//Documents//printWriterOutput.txt");
            output.print(data);
            output.close();
        }catch (Exception e){
            e.getStackTrace();
        }
    }


}
