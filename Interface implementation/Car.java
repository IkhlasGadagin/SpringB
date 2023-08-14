public class Car  implements Brake,Engine,Media{

    @Override
    public void brake() {
        // TODO Auto-generated method stub
        System.out.println("Car is breaking");
    }

    @Override
    public void accelerate() {
        // TODO Auto-generated method stub
         System.out.println("Car is accelerate");
    }

    @Override
    public void start() {
        // TODO Auto-generated method stub
         System.out.println("Car is startung");
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
         System.out.println("Car is stipping");
    }

   


    
}
