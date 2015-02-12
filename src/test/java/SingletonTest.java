import org.junit.Test;

import static org.junit.Assert.*;

public class SingletonTest {

    @Test
    public void testGetInstance() throws Exception {
        Singleton singleton=Singleton.getInstance();
        Singleton singleton1=Singleton.getInstance();
        assertEquals(singleton,singleton1);
    }
}