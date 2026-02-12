class throwDemo{
    public static void main(String arg[]) throws InterruptedException
    {
       for(int i=0;i<10;i++){
        Thread.sleep(1000);
        System.out.println(i);
       }
    }

}