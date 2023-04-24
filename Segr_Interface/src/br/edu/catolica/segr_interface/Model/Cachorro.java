package br.edu.catolica.segr_interface.Model;
import br.edu.catolica.segr_interface.Interface.AnimalDomestico;

public class Cachorro implements AnimalDomestico{
    @Override
    public void acariciar(){
        System.out.println("O cachorro está sendo acariciado");
    }
}
