public class NiceCar {
   private Engine e;
    private Media m=new CdPlayer();

  
    public NiceCar(Engine e) {
        this.e = e;
    }
    public NiceCar(){
       e= new PowerEngine();
    }
    public void start(){
        e.start();

    }
    public void stop(){
        e.stop();
    }
    public void accelerate(){
        e.accelerate();
    }
    public void update(){
       e= new ElectricEngine();
    }
    public void play(){
        m.start();

    }
    public void pause(){
        m.stop();
    }
    public static void main(String[] args) {
       NiceCar n=new NiceCar();
       n.start();
       n.stop();
       n.accelerate();
       n.update();
       n.start();
       n.stop();
       n.accelerate();
        }
    
    
}
