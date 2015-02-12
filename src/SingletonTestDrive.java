/**
 * Created by tejaswinibhosale on 21/01/15.
 */
public class SingletonTestDrive {
    public static void main(String args[]){
        Singleton singleton1=Singleton.getInstance();
        Singleton singleton2=Singleton.getInstance();
        Singleton singleton3=Singleton.getInstance();
        System.out.println(singleton1);
        System.out.println(singleton2);
        System.out.println(singleton3);
    }
}
