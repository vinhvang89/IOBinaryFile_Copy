import java.io.*;


public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileInputStream f_i = new FileInputStream("E:\\Codegym\\Module 2\\Week9\\BinaryFile_CopyBigFile\\current.txt");
            FileOutputStream f_o = new FileOutputStream("E:\\Codegym\\Module 2\\Week9\\BinaryFile_CopyBigFile\\new.txt");
            int flag;
            while ((flag=f_i.read())!= -1){
                f_o.write(flag);
            }
            f_i.close();
            f_o.close();
            System.out.println("Copycat is here");
        } catch (Exception e){
            e.getStackTrace();
            System.out.println("Asshole");
        }
    }
}
