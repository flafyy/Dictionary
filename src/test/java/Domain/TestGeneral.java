package Domain;


import com.dictionary.util.Utils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGeneral {


    Utils util = new Utils();

    @Test
    public void testCalc(){
        Assert.assertEquals(4,util.calc(3,1));
    }

}
