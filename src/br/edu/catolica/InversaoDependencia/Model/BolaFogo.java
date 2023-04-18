package br.edu.catolica.InversaoDependencia.Model;

import br.edu.catolica.InversaoDependencia.Interface.Magia;

public class BolaFogo implements Magia {
    @Override
    public void soltarMagia() {
        System.out.println("Uma grande área foi queimada.");
    }
}
