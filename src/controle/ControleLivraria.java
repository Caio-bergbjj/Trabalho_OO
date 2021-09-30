package controle;
import com.modelo.*;

public class ControleLivraria {
    private Livraria[] l;
    private int qtdLivraria;

    public ControleLivraria(ControleDados d){
        l = d.getLivrarias();
        qtdLivraria = d.getQtdLivrarias();
    }

    public String[] getNomeLivraria() {
        String[] s = new String[qtdLivraria];
        for(int i = 0; i < qtdLivraria; i++) {
            s[i] = l[i].getNome();
        }

        return s;
    }
}
