package cs.software.lab1;

import org.testng.Assert;
import org.testng.annotations.Test;
import static cs.software.lab1.Labo1.*;

public class Labo1Test {
    @Test
    public void test01(){
        Automovil nissan = new Automovil(10,combustibleConsumoVehiculo,tanqueCapacidad);
        //logger.info(nissan.Rebastecer(500));
        Assert.assertEquals("Automovil no se puede reabastecer el tanque, esta lleno.", nissan.Rebastecer(500));
    }
}
