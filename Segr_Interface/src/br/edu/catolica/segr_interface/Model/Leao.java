package br.edu.catolica.segr_interface.Model;
import br.edu.catolica.segr_interface.Interface.AnimalSelvagem;

public class Leao implements AnimalSelvagem{
    @Override
    public void cacar(){
        System.out.println("O leão está caçando");
    }
}
