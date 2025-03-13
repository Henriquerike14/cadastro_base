package cadastro_base.domain;

import java.util.ArrayList;
import cadastro_base.data.CadastroTxtImpl;

public class ControleCadastro {
    private CadastroTxtImpl db;

    public ControleCadastro() {
        this.db = new CadastroTxtImpl();
    }

    public ArrayList<Pessoa> carregarLista() {

        return this.db.lerArquivo();
    }

    public void salvar(String nome, int idade) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);
        pessoa.setIdade(idade);
        this.db.salvar(pessoa);
    }

    public void salvarLista(ArrayList<Pessoa> lista) {
        this.db.salvarLista(lista);
    }

    public void excluir(int index) {
        
        this.db.excluir(index);
    }

    public void editar(int index , String novoNome, int novaIdade) {
        this.db.editar(index, new Pessoa(novoNome, novaIdade));
    }


}
