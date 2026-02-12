class InvalidAgeException extends Exception{

    public InvalidAgeException(String msg) {
        System.out.println(msg);
    }
    
}


class test{
    public static void main (String arg[]){
        try{
        vote(12);}
        catch(Exception e){
            System.err.println(e);
        }

    
    }

    public static void vote(int age)throws InvalidAgeException {
        if(age<18){
            throw new InvalidAgeException("Not eligible for vote");
        }
        else {
            System.out.println("Eligible for vote");

        }
    }
}