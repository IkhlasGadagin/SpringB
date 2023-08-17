public class Ex {

    
    public static void main(String[] args) {
        int a=7;
    int b=0;
        
    
    try{

      String name="Ikhlas";
      if(name.equals("Ikhlas")){
        throw new Noor("my own Exception");
      }
         //  div(a, b);
      //throw new ArithmeticException("throwing fir fun");
    }
    catch(Noor n){
        System.out.println(n.getMessage());
    }
    catch(ArithmeticException e){
       System.out.println( "shkiop");
    }
    catch(Exception e){
       System.out.println( "tere seene me tu hai");
    }
    
    finally{
        System.out.println("i  m inlove with java");
    }
    
  }  
  public static int div(int a,int b) throws ArithmeticException{
    if(b==0){
        throw  new ArithmeticException("zero is in divisible");
    }
    else
    return a/b;
  }
}
class Noor extends Exception{
    public Noor(String n){
        super(n);
    }

    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return "getMessage is called";
    }
    
}
