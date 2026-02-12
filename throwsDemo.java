class throwsDemo{
    void div(int a, int b) throws ArithmeticException
    {
        if(b==0){
            throw new ArithmeticException();
        }
        else{
            int c;
            c=a/b;
            System.out.println(c);
        }

    }
    public static void main(String[] args) {
        throwsDemo d =new throwsDemo();
        try{
            d.div(4,0);
            }

        catch(ArithmeticException a){
            System.out.println("We Cant Divide greater number by zero");
        }
        
    }
}