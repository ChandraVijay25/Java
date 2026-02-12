// class raaj{
//     public static void main(String[] args) {
//         int a=10;
//         int b=0;
//         try{int c;
//         c=a/b;
//         System.out.println(c);}
//         catch(ArithmeticException p)
//         {
//             System.out.println("Na karab y");
//         }
//     }
// }

class raaj{
    public static void main(String arg[]){
        String str=null;
        try {
            System.out.println(str.toUpperCase());
            
        } catch (NullPointerException n) {
            System.out.println("Sorry");
        }
        finally{
               System.out.println("Jai Shree RAm");
        }
    }
}