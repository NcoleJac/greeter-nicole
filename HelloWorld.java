import java.util.Scanner;
public class HelloWorld {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("What is your name? ");
        String x = sc.nextLine();
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
