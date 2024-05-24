# Projeto Biblioteca Virtual

## Integrantes
José Gabriel, Fernando Rodrigues, Daniel Soares, Thiago Santana

## Descrição

O intuito desde projeto é gertenciar umn biblioteca online, na qual é possivel realizar cadastros de usuarios e exemplares e também realizar emprestimos para os usuarios. O projeto foi desenvolvido em Java aplicando conceitos de Programação Orientada a Objetos (POO).

## Estrutura do Projeto

### Classes

1. **Pessoa**: Representa uma pessoa genérica com atributos como nome, idade e CPF. 
   - **Encapsulamento**: Os atributos são privados e acessados por meio de getters e setters.
   
2. **Usuario**: Herda de Pessoa e contém informações específicas de um usuário da biblioteca, como número de matrícula e histórico de empréstimos.
   - **Herança**: Extende a classe Pessoa.
   - **Polimorfismo**: Pode ser tratada como uma Pessoa em alguns contextos.
   
3. **Funcionario**: Herda de Pessoa e possui dados como cargo, salário e data de admissão na biblioteca.
   - **Herança**: Extende a classe Pessoa.
   - **Polimorfismo**: Pode ser tratada como uma Pessoa em alguns contextos.
   
4. **Livro**: Representa um livro com atributos como título, autor, editora e ano de publicação.
   
5. **Exemplar**: Representa uma cópia específica de um livro, com um número de identificação único.
   
6. **Emprestimo**: Contém informações sobre empréstimos, como data de início, data de devolução prevista e status.
   
7. **Biblioteca**: Contém arrays de Exemplares, Usuários e Funcionários, e métodos para gerenciar empréstimos, devoluções e cadastros.
   - **Arrays**: Utilizados para armazenar exemplares, usuários e funcionários.
   
8. **Relatorio**: Classe responsável por gerar relatórios de empréstimos, livros disponíveis, etc.
   
9. **Main**: Classe principal para inicialização do sistema e interação com o usuário através do console.
   
10. **Utilitarios**: Classe com métodos utilitários, como validação de CPF e cálculo de datas.

## Funcionalidades

- Cadastro de exemplares de livros.
- Cadastro de usuários.
- Realização de empréstimos.
- Geração de relatórios de empréstimos e livros disponíveis.