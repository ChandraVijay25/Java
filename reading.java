
import java.io.FileInputStream;
import java.io.IOException;


class reading{
    public static void main(String arg[]){

    try {
        FileInputStream r=new FileInputStream("C:\\Users\\Chandravijay Singh\\OneDrive\\Desktop\\t.txt");
         int i;
         while((i=r.read())!=-1){
            System.out.print((char)i);
         }
    } catch (IOException e) {
        System.out.println("sorry");
    }
    }
}