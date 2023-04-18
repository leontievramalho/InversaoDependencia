package br.edu.catolica.InversaoDependencia.Model;

import br.edu.catolica.InversaoDependencia.Interface.Magia;

public class RaioDeGelo implements Magia {
    @Override
    public void soltarMagia() {
        System.out.println("Um inimigo foi congelado");
    }
}
