package br.edu.catolica.InversaoDependencia.Model;

import br.edu.catolica.InversaoDependencia.Interface.Magia;

public class Mago {
    String nome;
    int level;
    Magia magia;

    public Mago(String nome, int level) {
        this.nome = nome;
        this.level = level;
    }

    public void soltarMagia(){
        if(magia!=null)
            magia.soltarMagia();
        else
            System.out.println(nome + " ainda não aprendeu nenhuma magia.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Magia getMagia() {
        return magia;
    }

    public void setMagia(Magia magia) {
        this.magia = magia;
    }

    @Override
    public String toString() {
        return "Mago{" +
                "nome='" + nome + '\'' +
                ", level=" + level +
                ", magia=" + magia +
                '}';
    }
}
