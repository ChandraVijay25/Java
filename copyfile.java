
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


class copyfile{
    public static void main(String arg[]) throws IOException
    {
        FileInputStream r=new FileInputStream("C:\\Users\\Chandravijay Singh\\OneDrive\\Desktop\\priyanshu.txt");
        FileOutputStream w=new FileOutputStream("C:\\Users\\Chandravijay Singh\\OneDrive\\Desktop\\Raaj.txt");

        int i;

        while((i=r.read())!=-1){

            w.write((char)i);
        }
        System.out.println("Ho gya Copy");
    }
}