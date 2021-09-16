package cs.software.lab1;

public class Automovil extends cs.software.lab1.Vehiculo {
    Automovil(double cantidadCombustible, double consumoCombustible, double capacidadTanque) {
        super(cantidadCombustible, consumoCombustible, capacidadTanque);
    }

    @Override
    String  rebastecer(double litros) {
        double espacioLibre = this.capacidadTanque - this.cantidadCombustible;

        if (litros > espacioLibre)
        {
            return "Automovil no se puede reabastecer el tanque, esta lleno.";

        }
        else{
            cantidadCombustible += litros;
            return "La cantidad de combustible del vehiculo es: "+cantidadCombustible;
        }
    }

}

