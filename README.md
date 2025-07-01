📚 Gestão de Biblioteca


Uma aplicação em Java para gerenciar o cadastro de autores e livros, além de permitir empréstimos de livros a usuários.

🧰 Tecnologias Utilizadas
Java (JDK 8+)

IDE a sua escolha (IntelliJ, Eclipse, VS Code etc.)

📁 Estrutura do Projeto
text
Copiar
Editar
src/
├── Autor.java            # Classe que representa um autor (id, nome)
├── Livro.java            # Classe que representa um livro (id, título, autor, disponibilidade)
├── Biblioteca.java       # Classe principal de lógica: adiciona autores/livros, lista, busca, empréstimo, devolução
└── Main.java             # Interação com o usuário via console (menu de opções)
🚀 Funcionalidades
Cadastro de autores

Armazena informações como nome e um identificador único.

Cadastro de livros

Cada livro tem ID único, título e autor associado.

Listagem de livros disponíveis

Consulta ao acervo com filtragem por disponibilidade.

Empréstimos

O usuário escolhe um livro disponível, fornece seu nome, e o sistema registra o empréstimo.

Validação de IDs

O sistema impede o cadastro de novos livros com IDs já existentes, forçando o usuário a digitar outra opção.

▶️ Como Executar
Clone este repositório

bash
Copiar
Editar
git clone https://github.com/Sign0retti/rocketseat-gestao-biblioteca.git
Navegue até o diretório do projeto

bash
Copiar
Editar
cd rocketseat-gestao-biblioteca
Compile o projeto

nginx
Copiar
Editar
javac src/*.java
Execute a aplicação

css
Copiar
Editar
java -cp src Main
Interaja com o menu no console

Digite sim ou nao quando solicitado.

Em nao, você pode escolher cadastrar novos livros.

Em sim, pode consultar e realizar empréstimos.

🛠️ Melhorias Futuras
Adicionar funcionalidade de devolução de livros.

Implementar persistência em arquivo ou banco de dados (CSV, JSON, SQLite etc.).

Criar opções de menu para listar todos os livros, e buscar por autor ou título.

Tratar entradas inválidas (números, textos, confirmação).

📚 Exemplo de Uso
yaml
Copiar
Editar
Deseja ver os livros disponíveis? (sim/nao)
> sim
Livros disponíveis:
1: Harry Potter e a Pedra Filosofal
2: O Senhor dos Anéis: A Sociedade do Anel
...
Digite o ID do livro que você deseja emprestar:
> 1
Digite seu nome:
> João
O livro Harry Potter e a Pedra Filosofal foi emprestado para João
🤝 Contribuição
Contribuições são bem-vindas! Você pode:

Enviar uma issue com sugestões ou bugs.

Abrir um pull request com melhorias e novas funcionalidades.

📝 Licença
Este projeto está sob a licença MIT — sinta-se à vontade para usar e adaptar.

