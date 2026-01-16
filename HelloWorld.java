public class HelloWorld {
    public static void main(String[] args) {
        showGreeter2();
        showGreeter3();
        showGreeter();   
     } 
    public static void showGreeter(){
      Greeter myGreeterObject = new Greeter();
       myGreeterObject.saySomething();
    }
    public static void showGreeter2(){
        Greeter2 myGreeter2Object = new Greeter2();
        myGreeter2Object.saySomethingElse();
 }
    public static void showGreeter3(){
        Greeter3 myGreeter3Object = new Greeter3();
        myGreeter3Object.saySomethingMore();
    }
}
