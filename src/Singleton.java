/**
 * Created by tejaswinibhosale on 21/01/15.
 */
public class Singleton {
    private volatile static Singleton uniqueInstance;
    private Singleton(){}
    public static Singleton getInstance(){
        if(uniqueInstance==null) {
            synchronized (Singleton.class) {
                uniqueInstance=new Singleton();
            }
        }
        return uniqueInstance;
    }

}
