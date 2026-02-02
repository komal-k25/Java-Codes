class Counter{
    static int count=0; //static variable

    Counter(){
        count++; //increment static variable
        System.out.println("object created. current count: "+ count);
    }
}
public class staticvar {
    public static void main(String[] args){
        Counter obj1= new Counter();
        Counter obj2= new Counter();
        Counter obj3= new Counter();

        System.out.println("final count: "+ Counter.count);  //access using class name
        }
}
