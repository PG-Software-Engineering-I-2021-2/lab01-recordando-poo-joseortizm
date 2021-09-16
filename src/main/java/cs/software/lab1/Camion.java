package cs.software.lab1;

public class Camion extends cs.software.lab1.Vehiculo {
    Camion(double cantidadcombustible, double consumocombustible, double capacidadtanque) {
        super(cantidadcombustible, consumocombustible, capacidadtanque);
    }
    @Override
    String rebastecer(double litros){
        double espacioLibre = this.capacidadTanque - this.cantidadCombustible;
        if (litros > espacioLibre)
        {
            return "Camion no se puede reabastecer el tanque, esta lleno.";

        }
        else{
            this.cantidadCombustible += (litros * 0.95);
            return "La cantidad de combustible del camion es: "+cantidadCombustible;
        }

    }

    @Override
    String manejar(double km) {
        double combustibleRequiere = km*this.consumoCombustible;
        if(cantidadCombustible-combustibleRequiere<0){
            return "Camion necesita reabastecimiento de combustible.";
        }
        else{
            this.cantidadCombustible -=combustibleRequiere;
            return ("Camion viajó " +(km)+" km y aún tiene " +String.format("%.2f",cantidadCombustible)+ " de combustible");
        }
    }

}
