# 📚 Gestão de Biblioteca

Uma aplicação em **Java** para gerenciar autores, livros e empréstimos de forma simples, com interação via **console**. Desenvolvido como parte dos estudos da trilha Java na **Rocketseat**.

---

## 🧰 Tecnologias Utilizadas

- Java (JDK 8 ou superior)
- IDE de sua preferência (IntelliJ IDEA, Eclipse, VS Code etc.)
- Terminal/Console para executar a aplicação

---

## 📁 Estrutura do Projeto

src/
├──Autor.java # Classe que representa um autor (id, nome)

├── Livro.java # Classe que representa um livro (id, título, autor, disponibilidade)

├── Biblioteca.java # Classe principal de lógica: cadastro, listagem, empréstimos e devoluções

└── Main.java # Classe responsável pela interação com o usuário via menu no console


---

## 🚀 Funcionalidades

✔️ **Cadastro de Autores**  
- Armazena nome e identificador único.

✔️ **Cadastro de Livros**  
- ID único, título e associação com um autor já cadastrado.

✔️ **Listagem de Livros Disponíveis**  
- Mostra os livros que não estão emprestados.

✔️ **Empréstimos de Livros**  
- O usuário informa seu nome e escolhe um livro disponível.

✔️ **Validação de Dados**  
- Evita cadastro de livros com IDs repetidos.

---

## ▶️ Como Executar

1. **Clone o repositório:**
git clone https://github.com/Sign0retti/rocketseat-gestao-biblioteca.git

Navegue até o diretório do projeto:
cd rocketseat-gestao-biblioteca


Compile os arquivos Java:
javac src/*.java


Execute o programa:
java -cp src Main


---

## 💻 Interação com o Console

Deseja ver os livros disponíveis? (sim/nao)
> sim

Livros disponíveis:
1: Harry Potter e a Pedra Filosofal
2: O Senhor dos Anéis: A Sociedade do Anel

Digite o ID do livro que você deseja emprestar:
> 1

Digite seu nome:
> João

O livro 'Harry Potter e a Pedra Filosofal' foi emprestado para João.



📝 Licença

Este projeto está licenciado sob a MIT License.
Sinta-se à vontade para usar, modificar e distribuir.
