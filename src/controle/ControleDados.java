package controle;

import com.modelo.*;

public class ControleDados {
    private Dados d = new Dados();

    public ControleDados() {
        d.criarLivrarias();
    }

    public Dados getDados() {
        return d;
    }
    public void setDados(Dados d) {
        this.d = d;
    }

    public Livraria[] getLivrarias() {
        return this.d.getLivrarias();
    }

    public int getQtdLivrarias(){return this.d.getQtdLivrarias();}
}
