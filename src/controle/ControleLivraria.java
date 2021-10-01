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

    public int getQtd(){ return qtdLivraria; }

    public void setQtd(int qtd){this.qtdLivraria = qtd;}

    public String getNome(int i){return l[i].getNome();}

    public String getCNPJ(int i){
        String cnpj = String.valueOf(l[i].getCNPJ());
        return cnpj;
    }

    public String getTotalClientes(int i){
        String qtdC = String.valueOf(l[i].getTotalClientes());
        return qtdC;
    }

    public String getTotalVendas(int i){
        String qtdV = String.valueOf(l[i].getTotalVen());
        return qtdV;
    }

    public String getId(int i){
        String ID = String.valueOf(l[i].getID());
        return ID;
    }

}
