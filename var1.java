

class Test2{
    Test2(){
        var x=23;
        System.out.println("Constructor value"+x);

    }

    // if we want to use multiple line print then we have to use text block by using """------""";
String check(){
    String s="""
    Hello
    My Name
    Chandra Vijay Singh
    """;
     System.out.println(s);
     return s;
}
}
public class var1{
    public static void main(String[] args) {
        Test2 t=new Test2();
        t.check();

        // for(var i=0;i<4;i++){
        //     System.out.println("Constructor value")
        // }
        
    }
}
