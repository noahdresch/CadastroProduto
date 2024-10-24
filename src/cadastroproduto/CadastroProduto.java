/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadastroproduto;

/**
 *
 * @author Noa
 */
public class CadastroProduto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String produtos[] = new String[100];
        int cont = 0;

        int opcao = 0;

        while (opcao != 6) {
            opcao = Entrada.leiaInt(""
                    + "[1] - Cadastrar produto\n"
                    + "[2] - Listar todos produtos\n"
                    + "[3] - Consultar um produto\n"
                    + "[4] - Atualizar um produto\n"
                    + "[5] - Excluir um produto\n"
                    + "[6] - SAIR");

            if (opcao == 1) {
                System.out.println("CADASTRO DO PRODUTO");

                produtos[cont] = Entrada.leiaString("Informe o nome do produto");
                cont++;

                System.out.println("Produto cadastrado com sucesso!");
                
            } else if (opcao == 2) {
                System.out.println("LISTAGEM DE PRODUTOS");

                for (int i = 0; i < cont; i++) {
                    System.out.println("Produto " + (i + 1) + " - " + produtos[i]);
                }
                
            } else if (opcao == 3) {
                System.out.println("CONSULTA DE PRODUTO");
                
                String nomeConsulta = Entrada.leiaString("Informe um nome de produto para consultar: ");
                
                boolean achei = false;
                for (int i = 0; i < cont; i++) {
                    if (nomeConsulta.equalsIgnoreCase(produtos[i])) {
                        System.out.println("Produto - " + nomeConsulta + " - localizado!");
                        achei = true;
                    }
                }
                if (achei == false) {
                    System.out.println("Produto nao localizado.");
                }

            } else if (opcao == 4) {
                System.out.println("ATUALIZACAO DE PRODUTO");
        
        String nomeAtualizar = Entrada.leiaString("Informe o nome do produto que deseja atualizar: ");
        
        boolean atualizado = false;
        for (int i = 0; i < cont; i++) {
            if (nomeAtualizar.equalsIgnoreCase(produtos[i])) {
                produtos[i] = Entrada.leiaString("Informe o novo nome para o produto: ");
                System.out.println("Produto atualizado com sucesso!");
                atualizado = true;
                break;
            }
        }
        if (!atualizado) {
            System.out.println("Produto nao encontrado para atualizacao.");
        }

            } else if (opcao == 5) {
                System.out.println("EXCLUSAO DE PRODUTO");
        
        String nomeExcluir = Entrada.leiaString("Informe o nome do produto que deseja excluir: ");
        
        boolean excluido = false;
        for (int i = 0; i < cont; i++) {
            if (nomeExcluir.equalsIgnoreCase(produtos[i])) {
                produtos[i] = null;
                cont--;
                System.out.println("Produto excluído com sucesso!");
                excluido = true;
                break;
            }
        }
        if (!excluido) {
            System.out.println("Produto nao encontrado para exclusao.");
        }

            }
        }
        
        
        System.exit(0);
        
    }
}

