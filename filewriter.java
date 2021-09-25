import.java.io.*;

public class FileReadHangulFail {
    public static void public static void main(String[] args) {
        InputStreamReader in = null;
        FileInputStream fin = null;
        try {
            fin = new  FileInputStream("c:\\Temp\\hangul.txt");
            in = new InputStreamReader(fin, "MS949");
            int c;

            System.out.println("인코딩 문자집합은" + in.getEncoding());
            while((c= in.read()) != -1) {
                System.out.print((char)c);
                }     
            in.close();
            fin.close();
        }
        catch(IOExeption e){
            System.out.println("입출력 오류");
        
            }
    }
}