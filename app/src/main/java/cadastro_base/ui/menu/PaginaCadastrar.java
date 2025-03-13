package cadastro_base.ui.menu;

import java.util.Scanner;
import cadastro_base.domain.ControleCadastro;

public class PaginaCadastrar {

    public static void adicionarPessoa(Scanner scanner) {
        ControleCadastro cadastro = new ControleCadastro();
        System.out.print("\nCadastre uma pessoa: \nNome:");
        String nome = scanner.nextLine();
        System.out.print("\nIdade:");
        int idade = scanner.nextInt();

        cadastro.salvar(nome, idade);
    }
}
