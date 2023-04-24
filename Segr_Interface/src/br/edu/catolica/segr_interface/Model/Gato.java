package br.edu.catolica.segr_interface.Model;
import br.edu.catolica.segr_interface.Interface.AnimalDomestico;

public class Gato implements AnimalDomestico{
    @Override
    public void acariciar(){
        System.out.println("O gato está sendo acariciado");
    }
}
