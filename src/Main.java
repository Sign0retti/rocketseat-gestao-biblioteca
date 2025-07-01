import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        // Adicionando autores
        Autor autor1 = new Autor( "Machado de Assis");
        Autor autor2 = new Autor( "Clarice Lispector");

        biblioteca.adicionarAutor(autor1);
        biblioteca.adicionarAutor(autor2);

        // Adicionando livros
        Livro livro1 = new Livro(1, "Harry Potter e a Pedra Filosofal", autor1);
        Livro livro2 = new Livro(2, "O Senhor dos Anéis: A Sociedade do Anel", autor2);
        Livro livro3 = new Livro(3, "Harry Potter e a Câmara Secreta", autor1);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        // Loop para a interação com o usuário
        while (true) {
            System.out.println("Deseja ver os livros disponíveis? (sim/nao)");
            String resposta = scanner.nextLine().toLowerCase();

            if (resposta.equals("sim")) {
                List<Livro> livrosDisponiveis = biblioteca.listarLivrosDisponiveis();

                if (livrosDisponiveis.isEmpty()) {
                    System.out.println("Não há livros disponíveis no momento.");
                } else {
                    System.out.println("Livros disponíveis:");
                    for (Livro livro : livrosDisponiveis) {
                        System.out.println(livro.getId() + ": " + livro.getTitulo());
                    }

                    System.out.println("Digite o ID do livro que você deseja emprestar:");
                    int idLivro = scanner.nextInt();
                    scanner.nextLine();

                    Livro livroSelecionado = biblioteca.buscarLivroPorId(idLivro);

                    if (livroSelecionado != null && livroSelecionado.getDisponivel()) {
                        System.out.println("Digite seu nome:");
                        String nomeUsuario = scanner.nextLine();

                        biblioteca.emprestarLivro(livroSelecionado, nomeUsuario);
                        System.out.println("O livro " + livroSelecionado.getTitulo() + " foi emprestado para " + nomeUsuario);
                    } else {
                        System.out.println("Livro não encontrado ou não disponível para empréstimo.");
                    }
                }
            } else if (resposta.equals("nao")) {
                System.out.println("Deseja adicionar algum livro? (sim/não)");
                String respostaAdicaoLivro = scanner.nextLine().toLowerCase();
                if (respostaAdicaoLivro.equals("sim")) {
                    int idNovoLivro;
                    boolean idExistente;

                    do {
                        System.out.println("Digite o ID do Livro: ");
                        idNovoLivro = Integer.parseInt(scanner.nextLine());
                        idExistente = false;
                        for (Livro livro : biblioteca.listarLivros()) {
                            if (livro.getId() == idNovoLivro) {
                                idExistente = true;
                                System.out.println("ID já cadastrado! Digite outro.");
                                break;
                            }
                        }
                    } while (idExistente);
                    System.out.println("Digite o nome do Livro");
                    String nomeNovoLivro = scanner.nextLine();
                    System.out.println("Digite o Autor do Livro");
                    String nomeAutor = scanner.nextLine();
                    Autor autor = new Autor(nomeAutor);
                    Livro novoLivro = new Livro(idNovoLivro, nomeNovoLivro, autor);
                    biblioteca.adicionarLivro(novoLivro);
                    System.out.println("Livro cadastrado com sucesso.");
                }
            break;
            } else {
                System.out.println("Resposta inválida. Por favor, responda com 'sim' ou 'não'.");
            }
        }
    }
}