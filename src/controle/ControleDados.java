package controle;

import com.modelo.*;

public class ControleDados {
    private Dados d = new Dados();

    public void CriarLivraria(){
        d.criarLivrarias();
    }

    public void CriarDados(){
        d.fillWithSomeData();
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

    /*public boolean removerAluno(int i) {
        int qtdMat = d.getQtdMatriculados();
        String alunoRemovido = d.getAlunos()[i].getNome();
        String aux;
        for (int j = 0; j < qtdMat; j++) {
            aux = d.getMatr()[j].getAluno().getNome();
            if(alunoRemovido.compareTo(aux) == 0)
                return false; //n�o � poss�vel remover aluno pois ele est� matriculado em um curso
        }

        if(i == (d.getQtdAlunos() - 1)) { // O aluno a ser removido est� no final do array
            d.setQtdAlunos(d.getQtdAlunos() - 1);
            d.getAlunos()[d.getQtdAlunos()] = null;
            return true;
        } else { // o aluno a ser removido est� no meio do array
            int cont = 0;
            while(d.getAlunos()[cont].getNome().compareTo(alunoRemovido) != 0) {
                cont++;
            }
            //Rotina swap
            for(int j = cont; j < d.getQtdAlunos() - 1; j++) {
                d.getAlunos()[j] = null;
                d.getAlunos()[j] = d.getAlunos()[j+1];
            }
            d.getAlunos()[d.getQtdAlunos()] = null;
            d.setQtdAlunos(d.getQtdAlunos() - 1);
            return true;
        }
    }

    public boolean removerProfessor(int i) {
        int qtdCursos = d.getQtdCursos();
        String profRemovido = d.getProfs()[i].getNome();
        String aux;
        for (int j = 0; j < qtdCursos; j++) {
            aux = d.getCursos()[j].getProf().getNome();
            if(profRemovido.compareTo(aux) == 0)
                return false;
            //n�o � poss�vel remover professor pois ele � respons�vel por um curso
        }
        if(i == (d.getQtdProfs() - 1)) { // O prof a ser removido est� no final do array
            d.setQtdProfs(d.getQtdProfs() - 1);
            d.getProfs()[d.getQtdProfs()] = null;
            return true;
        } else { // o prof a ser removido est� no meio do array
            int cont = 0;
            while(d.getProfs()[cont].getNome().compareTo(profRemovido) != 0)
                cont++;
            //Rotina swap
            for(int j = cont; j < d.getQtdProfs() - 1; j++) {
                d.getProfs()[j] = null;
                d.getProfs()[j] = d.getProfs()[j+1];
            }
            d.getProfs()[d.getQtdProfs()] = null;
            d.setQtdProfs(d.getQtdProfs() - 1);
            return true;
        }
    }*/
}
