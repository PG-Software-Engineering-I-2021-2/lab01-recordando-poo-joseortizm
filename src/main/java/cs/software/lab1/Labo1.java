package cs.software.lab1;

import java.util.logging.Logger;

public class Labo1 {
    static final Logger logger = Logger.getLogger(Labo1.class.getName());
    static double combustibleConsumoVehiculo = 0.9;
    static double combustibleConsumoCamion = 1.6;
    static double tanqueCapacidad = 100;
    public static void main(String[] args) {
        //logger.info("hola mundo");
        double cantidadCombustible = 10;
        cs.software.lab1.Automovil toyota = new cs.software.lab1.Automovil(cantidadCombustible,combustibleConsumoVehiculo,tanqueCapacidad);
        logger.info(toyota.Manejar(12));
        cs.software.lab1.Camion volvo = new cs.software.lab1.Camion(cantidadCombustible,combustibleConsumoCamion,tanqueCapacidad);
        logger.info(volvo.Manejar(4));



    }
}
