package br.edu.catolica.segr_interface.Main;
import br.edu.catolica.segr_interface.Interface.*;
import br.edu.catolica.segr_interface.Model.*;

public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.acariciar();

        Leao leao = new Leao();
        leao.cacar();

        Peixe peixe = new Peixe();
        peixe.nadar();
    }
}