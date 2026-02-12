import java.io.*;

class file{
    public static void main(String arg[]){

       

       try {
        FileWriter f=new FileWriter("C:\\Users\\Chandravijay Singh\\OneDrive\\Desktop\\priyanshu.txt") ;
       try {
        f.write("Jai Shree Ram");
           
       } 
       
       finally {f.close();
       } 
        System.out.println("Succesfully Created ");
           
       } catch (IOException e) {
        System.out.println("Hum Sher hai ho ha");       }
    }
}