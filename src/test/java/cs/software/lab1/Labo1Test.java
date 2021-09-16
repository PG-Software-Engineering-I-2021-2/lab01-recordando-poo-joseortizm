package cs.software.lab1;

import org.testng.Assert;
import org.testng.annotations.Test;
import static cs.software.lab1.Labo1.*;

public class Labo1Test {
    @Test
    public void test01(){
        Automovil nissan = new Automovil(10,combustibleConsumoVehiculo,tanqueCapacidad);
        //logger.info(nissan.Rebastecer(500));
        Assert.assertEquals(nissan.rebastecer(500),"Automovil no se puede reabastecer el tanque, esta lleno.");
    }
    @Test
    public void test02(){
        Automovil toyota = new Automovil(10,combustibleConsumoVehiculo,tanqueCapacidad);
        //logger.info(toyota.Manejar(4));
        Assert.assertEquals(toyota.manejar(4),"Vehiculo viajó 4.0 km y aún tiene 6.40 de combustible.");
    }
    @Test
    public void test03(){
        Automovil nazda = new Automovil(15,combustibleConsumoVehiculo,tanqueCapacidad);
        //logger.info(nazda.Manejar(8));
        Assert.assertEquals(nazda.manejar(8), "Vehiculo viajó 8.0 km y aún tiene 7.80 de combustible.");
    }
    @Test
    public void test04(){
        Automovil volvo = new Automovil(7,combustibleConsumoVehiculo,tanqueCapacidad);
        //logger.info(volvo.Manejar(13));
        Assert.assertEquals(volvo.manejar(13), "Vehiculo necesita reabastecimiento de combustible.");
    }
    @Test
    public void test05(){
        Automovil audi = new Automovil(100,combustibleConsumoVehiculo,tanqueCapacidad);
        //logger.info(audi.Manejar(20));
        Assert.assertEquals(audi.manejar(20), "Vehiculo viajó 20.0 km y aún tiene 82.00 de combustible.");
    }
    @Test
    public void test06(){
        Automovil mercedes = new Automovil(100,combustibleConsumoVehiculo,tanqueCapacidad);
        //logger.info(mercedes.Manejar(55));
        Assert.assertEquals(mercedes.manejar(55), "Vehiculo viajó 55.0 km y aún tiene 50.50 de combustible.");
    }
    @Test
    public void test07(){
        Automovil bmw = new Automovil(25,combustibleConsumoVehiculo,tanqueCapacidad);
        //logger.info(bmw.Manejar(100));
        Assert.assertEquals(bmw.manejar(100), "Vehiculo necesita reabastecimiento de combustible.");
    }
    @Test
    public void test08(){
        Automovil dacia = new Automovil(200,combustibleConsumoVehiculo,tanqueCapacidad);
        //logger.info(dacia.Manejar(10));
        Assert.assertEquals(dacia.manejar(10), "Vehiculo viajó 10.0 km y aún tiene 191.00 de combustible.");
    }
    @Test
    public void test09(){
        Automovil fiat  = new Automovil(20,combustibleConsumoVehiculo,tanqueCapacidad);
        //logger.info(fiat.Rebastecer(150));
        Assert.assertEquals(fiat.rebastecer(150), "Automovil no se puede reabastecer el tanque, esta lleno.");
    }
    @Test
    public void test10(){
        Automovil honda  = new Automovil(10,combustibleConsumoVehiculo,tanqueCapacidad);
        //logger.info(honda.Rebastecer(5));
        Assert.assertEquals(honda.rebastecer(5), "La cantidad de combustible del vehiculo es: 15.0");
    }
    @Test
    public void test11(){
        Automovil volvo1  = new Automovil(50,combustibleConsumoVehiculo,tanqueCapacidad);
        //logger.info(volvo1.Rebastecer(5));
        Assert.assertEquals(volvo1.rebastecer(5), "La cantidad de combustible del vehiculo es: 55.0");
    }
    @Test
    public void test12(){
        Automovil volvo2  = new Automovil(30,combustibleConsumoVehiculo,tanqueCapacidad);
        //logger.info(volvo2.Rebastecer(150));
        Assert.assertEquals(volvo2.rebastecer(150), "Automovil no se puede reabastecer el tanque, esta lleno.");
    }
    @Test
    public void test13(){
        Automovil volvo3  = new Automovil(80,combustibleConsumoVehiculo,tanqueCapacidad);
        //logger.info(volvo3.Rebastecer(200));
       Assert.assertEquals(volvo3.rebastecer(200), "Automovil no se puede reabastecer el tanque, esta lleno.");
    }
    @Test
    public void test14(){
        Automovil volvo4  = new Automovil(10,combustibleConsumoVehiculo,tanqueCapacidad);
        //logger.info(volvo4.Rebastecer(120));
        Assert.assertEquals(volvo4.rebastecer(120), "Automovil no se puede reabastecer el tanque, esta lleno.");
    }
    @Test
    public void test15(){
        Camion isuzu1  = new Camion(100,combustibleConsumoVehiculo,tanqueCapacidad);
        //logger.info(isuzu1.Rebastecer(12));
        Assert.assertEquals(isuzu1.rebastecer(12), "Camion no se puede reabastecer el tanque, esta lleno.");
    }
    @Test
    public void test16(){
        Camion isuzu2  = new Camion(150,combustibleConsumoVehiculo,tanqueCapacidad);
        //logger.info(isuzu2.Rebastecer(100));
        Assert.assertEquals(isuzu2.rebastecer(100), "Camion no se puede reabastecer el tanque, esta lleno.");
    }
    @Test
    public void test17(){
        Camion isuzu3  = new Camion(200,combustibleConsumoVehiculo,tanqueCapacidad);
        //logger.info(isuzu3.Rebastecer(10));
        Assert.assertEquals(isuzu3.rebastecer(10),"Camion no se puede reabastecer el tanque, esta lleno.");
    }
    @Test
    public void test18(){
        Camion isuzu4  = new Camion(80,combustibleConsumoVehiculo,tanqueCapacidad);
        //logger.info(isuzu4.Rebastecer(20));
        Assert.assertEquals(isuzu4.rebastecer(20),"La cantidad de combustible del camion es: 99.0");
    }
    @Test
    public void test19(){
        Camion isuzu5  = new Camion(80,combustibleConsumoVehiculo,tanqueCapacidad);
        //logger.info(isuzu5.Rebastecer(10));
        Assert.assertEquals(isuzu5.rebastecer(10), "La cantidad de combustible del camion es: 89.5");
    }
    @Test
    public void test20(){
        Camion isuzu6  = new Camion(100,combustibleConsumoVehiculo,tanqueCapacidad);
        //logger.info(isuzu6.Manejar(50));
        Assert.assertEquals(isuzu6.manejar(50),"Camion viajó 50.0 km y aún tiene 55.00 de combustible");
    }
    @Test
    public void test21(){
        Camion isuzu7  = new Camion(70,combustibleConsumoVehiculo,tanqueCapacidad);
        //logger.info(isuzu7.Manejar(20));
        Assert.assertEquals(isuzu7.manejar(20), "Camion viajó 20.0 km y aún tiene 52.00 de combustible");
    }
    @Test
    public void test22(){
        Camion isuzu8  = new Camion(150,combustibleConsumoVehiculo,tanqueCapacidad);
        //logger.info(isuzu8.Manejar(100));
        Assert.assertEquals(isuzu8.manejar(100), "Camion viajó 100.0 km y aún tiene 60.00 de combustible");
    }
    @Test
    public void test23(){
        Camion isuzu9  = new Camion(90,combustibleConsumoVehiculo,tanqueCapacidad);
        //logger.info(isuzu9.Manejar(100));
        Assert.assertEquals(isuzu9.manejar(100),"Camion viajó 100.0 km y aún tiene 0.00 de combustible");
    }
    @Test
    public void test24(){
        Camion isuzu10  = new Camion(50,combustibleConsumoVehiculo,tanqueCapacidad);
        //logger.info(isuzu10.Manejar(60));
        Assert.assertEquals(isuzu10.manejar(60),"Camion necesita reabastecimiento de combustible.");
    }
    @Test
    public void test25(){
        Camion isuzu11  = new Camion(90,combustibleConsumoVehiculo,tanqueCapacidad);
        //logger.info(isuzu11.Manejar(1000));
        Assert.assertEquals(isuzu11.manejar(1000),"Camion necesita reabastecimiento de combustible.");
    }
    @Test
    public void test26(){
        Camion isuzu12  = new Camion(20,combustibleConsumoVehiculo,tanqueCapacidad);
        //logger.info(isuzu12.Manejar(100));
        Assert.assertEquals(isuzu12.manejar(100),"Camion necesita reabastecimiento de combustible.");
    }
    @Test
    public void test27(){
        Vehiculo toyota1  = new Vehiculo(100,combustibleConsumoVehiculo,tanqueCapacidad);
        //logger.info(toyota1.Manejar(20));
        Assert.assertEquals(toyota1.manejar(20),"Vehiculo viajó 20.0 km y aún tiene 82.00 de combustible.");
    }
    @Test
    public void test28(){
        Vehiculo toyota2  = new Vehiculo(150,combustibleConsumoVehiculo,tanqueCapacidad);
        //logger.info(toyota2.Manejar(100));
        Assert.assertEquals(toyota2.manejar(100),"Vehiculo viajó 100.0 km y aún tiene 60.00 de combustible.");
    }
    @Test
    public void test29(){
        Vehiculo toyota3  = new Vehiculo(90,combustibleConsumoVehiculo,tanqueCapacidad);
        //logger.info(toyota3.Manejar(20));
        Assert.assertEquals(toyota3.manejar(20),"Vehiculo viajó 20.0 km y aún tiene 72.00 de combustible.");
    }
    @Test
    public void test30(){
        Vehiculo toyota4  = new Vehiculo(200,combustibleConsumoVehiculo,tanqueCapacidad);
       //logger.info(toyota4.Manejar(100));
        Assert.assertEquals(toyota4.manejar(100),"Vehiculo viajó 100.0 km y aún tiene 110.00 de combustible.");
    }
    @Test
    public void test31(){
        Vehiculo toyota5  = new Vehiculo(300,combustibleConsumoVehiculo,tanqueCapacidad);
        //logger.info(toyota5.Manejar(290));
        Assert.assertEquals(toyota5.manejar(290),"Vehiculo viajó 290.0 km y aún tiene 39.00 de combustible.");
    }
    @Test
    public void test32(){
        Vehiculo toyota6  = new Vehiculo(110,combustibleConsumoVehiculo,tanqueCapacidad);
        //logger.info(toyota6.Manejar(80));
        Assert.assertEquals(toyota6.manejar(80),"Vehiculo viajó 80.0 km y aún tiene 38.00 de combustible.");
    }
    @Test
    public void test33(){
        Vehiculo nissan1  = new Vehiculo(80,combustibleConsumoVehiculo,tanqueCapacidad);
        //logger.info(nissan1.Manejar(100));
        Assert.assertEquals(nissan1.manejar(100),"Vehiculo necesita reabastecimiento de combustible.");
    }
    @Test
    public void test34(){
        Vehiculo nissan2  = new Vehiculo(100,combustibleConsumoVehiculo,tanqueCapacidad);
        //logger.info(nissan2.Manejar(250));
        Assert.assertEquals(nissan2.manejar(250),"Vehiculo necesita reabastecimiento de combustible.");
    }
    @Test
    public void test35(){
        Vehiculo nissan3  = new Vehiculo(80,combustibleConsumoVehiculo,tanqueCapacidad);
        //logger.info(nissan3.Manejar(300));
        Assert.assertEquals(nissan3.manejar(300),"Vehiculo necesita reabastecimiento de combustible.");
    }
    @Test
    public void test36(){
        Vehiculo nissan4  = new Vehiculo(115,combustibleConsumoVehiculo,tanqueCapacidad);
        //logger.info(nissan4.Manejar(400));
        Assert.assertEquals(nissan4.manejar(400),"Vehiculo necesita reabastecimiento de combustible.");
    }
    @Test
    public void test37(){
        Vehiculo nissan5  = new Vehiculo(200,combustibleConsumoVehiculo,tanqueCapacidad);
        //logger.info(nissan5.Manejar(250));
        Assert.assertEquals(nissan5.manejar(250),"Vehiculo necesita reabastecimiento de combustible.");
    }
    @Test
    public void test38(){
        Vehiculo nissan6  = new Vehiculo(90,combustibleConsumoVehiculo,tanqueCapacidad);
        //logger.info(nissan6.Manejar(200));
        Assert.assertEquals(nissan6.manejar(200),"Vehiculo necesita reabastecimiento de combustible.");
    }
    @Test
    public void test39(){
        Vehiculo nissan7  = new Vehiculo(300,combustibleConsumoVehiculo,tanqueCapacidad);
        //logger.info(nissan7.rebastecer(350));
        Assert.assertEquals(nissan7.rebastecer(350),"Vehiculo no se puede reabastecer el tanque, esta lleno.");
    }
    @Test
    public void test40(){
        Vehiculo nissan8  = new Vehiculo(150,combustibleConsumoVehiculo,tanqueCapacidad);
        //logger.info(nissan8.rebastecer(300));
        Assert.assertEquals(nissan8.rebastecer(300),"Vehiculo no se puede reabastecer el tanque, esta lleno.");
    }
    @Test
    public void test41(){
        Vehiculo nissan9  = new Vehiculo(10,combustibleConsumoVehiculo,tanqueCapacidad);
        //logger.info(nissan9.rebastecer(200));
        Assert.assertEquals(nissan9.rebastecer(200),"Vehiculo no se puede reabastecer el tanque, esta lleno.");
    }
    @Test
    public void test42(){
        Vehiculo nissan10  = new Vehiculo(80,combustibleConsumoVehiculo,tanqueCapacidad);
        //logger.info(nissan10.rebastecer(200));
        Assert.assertEquals(nissan10.rebastecer(200),"Vehiculo no se puede reabastecer el tanque, esta lleno.");
    }
    @Test
    public void test43(){
        Vehiculo nissan10  = new Vehiculo(80,combustibleConsumoVehiculo,tanqueCapacidad);
        //logger.info(nissan10.rebastecer(150));
        Assert.assertEquals(nissan10.rebastecer(150),"Vehiculo no se puede reabastecer el tanque, esta lleno.");
    }
    @Test
    public void test44(){
        Vehiculo nissan11  = new Vehiculo(95,combustibleConsumoVehiculo,tanqueCapacidad);
        //logger.info(nissan11.rebastecer(200));
        Assert.assertEquals(nissan11.rebastecer(200),"Vehiculo no se puede reabastecer el tanque, esta lleno.");
    }
    @Test
    public void test45(){
        Vehiculo nissan12  = new Vehiculo(11,combustibleConsumoVehiculo,tanqueCapacidad);
        //logger.info(nissan12.rebastecer(180));
        Assert.assertEquals(nissan12.rebastecer(180),"Vehiculo no se puede reabastecer el tanque, esta lleno.");
    }

    @Test
    public void test46(){
        Vehiculo nissan13  = new Vehiculo(80,combustibleConsumoVehiculo,tanqueCapacidad);
        //logger.info(nissan13.rebastecer(20));
        Assert.assertEquals(nissan13.rebastecer(20),"La cantidad de combustible del Vehiculo es: 99.0");
    }
    @Test
    public void test47(){
        Vehiculo nissan14  = new Vehiculo(75,combustibleConsumoVehiculo,tanqueCapacidad);
        //logger.info(nissan14.rebastecer(15));
        Assert.assertEquals(nissan14.rebastecer(15),"La cantidad de combustible del Vehiculo es: 89.25");
    }

    @Test
    public void test48(){
        Vehiculo nissan15  = new Vehiculo(90,combustibleConsumoVehiculo,tanqueCapacidad);
        //logger.info(nissan15.rebastecer(10));
        Assert.assertEquals(nissan15.rebastecer(10),"La cantidad de combustible del Vehiculo es: 99.5");
    }

    @Test
    public void test49(){
        Vehiculo nissan16  = new Vehiculo(90,combustibleConsumoVehiculo,tanqueCapacidad);
        //logger.info(nissan16.rebastecer(5));
        Assert.assertEquals(nissan16.rebastecer(5),"La cantidad de combustible del Vehiculo es: 94.75");
    }

    @Test
    public void test50(){
        Vehiculo nissan17  = new Vehiculo(80,combustibleConsumoVehiculo,tanqueCapacidad);
        //logger.info(nissan17.rebastecer(5));
        Assert.assertEquals(nissan17.rebastecer(5),"La cantidad de combustible del Vehiculo es: 84.75");
    }

    @Test
    public void test51(){
        Vehiculo nissan18  = new Vehiculo(85,combustibleConsumoVehiculo,tanqueCapacidad);
        //logger.info(nissan18.rebastecer(5));
        Assert.assertEquals(nissan18.rebastecer(5),"La cantidad de combustible del Vehiculo es: 89.75");
    }

    @Test(invocationCount = 80, threadPoolSize = 80)
    public void test(){
        Camion isuzu1  = new Camion(10,combustibleConsumoVehiculo,tanqueCapacidad);
        //logger.info(isuzu1.rebastecer(40));
        Assert.assertEquals(isuzu1.rebastecer(40),"La cantidad de combustible del camion es: 48.0");
    }

}
