package br.edu.catolica.segr_interface.Model;
import br.edu.catolica.segr_interface.Interface.AnimalMarinho;

public class Peixe implements AnimalMarinho{
    @Override
    public void nadar(){
        System.out.println("O peixe está nadando");
    }
}
