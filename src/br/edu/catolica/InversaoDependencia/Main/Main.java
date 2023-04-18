package br.edu.catolica.InversaoDependencia.Main;

import br.edu.catolica.InversaoDependencia.Model.BolaFogo;
import br.edu.catolica.InversaoDependencia.Model.Mago;
import br.edu.catolica.InversaoDependencia.Model.RaioDeGelo;
import br.edu.catolica.InversaoDependencia.Model.Tempestade;

public class Main {
    public static void main(String[] args){
        Mago rasputin = new Mago("Rasputin", 3);
        rasputin.soltarMagia();
        System.out.println("---------------------------------------------------");
        rasputin.setMagia(new BolaFogo());
        rasputin.soltarMagia();
        System.out.println("---------------------------------------------------");
        rasputin.setMagia(new RaioDeGelo());
        rasputin.soltarMagia();
        System.out.println("---------------------------------------------------");
        rasputin.setMagia(new Tempestade());
        rasputin.soltarMagia();
        System.out.println("---------------------------------------------------");
    }
}
