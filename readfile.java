import java.io.*;

class readfile{
    public static void main(String[] args) {
        try{
            FileReader f=new FileReader("C:\\Users\\Chandravijay Singh\\OneDrive\\Desktop\\priyanshu.txt");
       
        try {
            int i;
        while((i=f.read())!=-1)
        {
            System.out.println((char)i);
        }}
        finally{
            f.close();
        }
        }
        
         catch (IOException e) {
            System.out.println("Na HAa");
        }
    }
    }