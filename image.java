
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;



class image{
    public static void main(String[] args) {
        try {
           
            FileInputStream f=new FileInputStream("C:\\Users\\Chandravijay Singh\\OneDrive\\Desktop\\_DSC0049.jpg");
            FileOutputStream c=new FileOutputStream("C:\\Users\\Chandravijay Singh\\OneDrive\\Desktop\\KIET\\Priyanshu.jpg");

            int i;
            while((i=f.read())!=-1){
                c.write(i);
            }
            System.out.println("Image copy");

        } catch (IOException e) {
            System.out.println("Nhi ho Pa raha hai");
        }
    }
}