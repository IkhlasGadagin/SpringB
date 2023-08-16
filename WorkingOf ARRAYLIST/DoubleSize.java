import java.util.Arrays;

class DoubleSize<T>{

    private Object arr[];
    public static int default_size=10;
   
    public int size=0;
     @Override
    public String toString() {
        return "DoubleSize [arr=" + Arrays.toString(arr) + ", size=" + size + "]";
    }
    public DoubleSize() {
        this.arr=new Object[default_size];
    }
    public void add(T num){
        if(isFull()){
            resize();
        }
        arr[size++]=num;
    }
        public boolean isFull(){
            return size==arr.length;
        }
        public void resize(){
            Object temp[]=new Object[arr.length*2];
            for(int i=0;i<arr.length-1;i++){

                temp[i]=arr[i];
            }
           arr= temp;
        }

        public T remove(){
            T remove=(T)arr[--size];
            return remove;
        }

        public void set(int index,T value){
            arr[index]=value; 
               }


        public T  get(int index){
            return (T)arr[index];

        }  
        public static void main(String[] args) {
            DoubleSize<Integer> d=new DoubleSize();
           
              for (int i = 0; i < 14; i++) {
                d.add(2*i);
                
            }
            System.out.println(d);
            d.add(45);
            System.out.println(d);
            d.remove();
            
            


            
            
          

          
            
        }      

    }
    
