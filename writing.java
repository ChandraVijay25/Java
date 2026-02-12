
import java.io.*;


class writing{
    public static void main(String[] args) {
        try {
            FileOutputStream w=new FileOutputStream("C:\\Users\\Chandravijay Singh\\OneDrive\\Desktop\\lighh.txt");
             
             w.write("Hii Deshi".getBytes());
             w.close();
             System.out.println("File Write");


        } catch (IOException e) {
            System.out.println("very Bad");

        }
    }
}