package lib;
import static org.junit.jupiter.api.Assertions.*;
// import static org.junit.Assert.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.Test;

public class onnne {
       @Test
       public void show()
        {
            Basic_Junit_Test1 obj = new Basic_Junit_Test1();
            int actual=obj.show(3, 2);
            int exp=5;
            assertEquals(exp,actual);
        }
        @Test
       public void display()
        {
            Basic_Junit_Test1 obj = new Basic_Junit_Test1();
            int actual=obj.display(3, 2);
            int exp=6;
            assertEquals(exp,actual);
        }
    // }
    @Test
    public void Volvo()
    {
        String str = "hai";
        assertTrue(str.equals("hai"));
    }
}
