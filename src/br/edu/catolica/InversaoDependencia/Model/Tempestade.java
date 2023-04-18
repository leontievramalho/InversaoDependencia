package br.edu.catolica.InversaoDependencia.Model;

import br.edu.catolica.InversaoDependencia.Interface.Magia;

public class Tempestade implements Magia {

    @Override
    public void soltarMagia() {
        System.out.println("Um inimigo sofre um choque e fica paralizado.");
    }
}
