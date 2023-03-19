package class01;

import org.testng.annotations.Test;

public class Priority {

    @Test (priority=3)
    public void Atest(){
        System.out.println("I am a Test A");
    }

    @Test (priority=1)
    public void Btest(){
        System.out.println("I am a Test B");
    }

    @Test (priority=2)
    public void Ctest(){
        System.out.println("I am a Test C");
    }
}
