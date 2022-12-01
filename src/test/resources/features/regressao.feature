   Feature: Analisando a qualidade do sistema
   Eu como usuario
   Quero realizar testes 
   Para validar a qualidade do sistema
   
   Background: Given o usuário esteja na aplicacao
  
   @tag1 @all
   Scenario: Clicar em qualquer lugar para acessar a tela Meus Repositorios
   When selecionar qualquer atributo do repositório na tela Meus Repositorios
   Then deve ser redirecionado a uma tela detalhe

   @tag2 @all
   Scenario: Acessar os atributos de um repositorio
   When selecionar o detalhe de um repositório
   Then deve ser redirecionado a uma tela com nome, descrição, linguagem, ultima data de atualização e o dono do repositório
   
   @tag3 @all
   Scenario: Acessar outros repositorios pelo nome
   When estiver na tela outros Repositorios
   Then deve conseguir pesquisar um repositório pelo nome

   @tag4 @all
   Scenario: Pesquisar repositorio com parte do nome
   When estiver na tela outros Repositorios
   Then deve conseguir pesquisar um repositório por parte do seu nome
   
   @tag5 @all
   Scenario: Acessar os detalhes de um repositorio na pagina Meus Repositorios
   When estiver na tela Outros Repositórios 
   And pesquisar um repositório 
   Then deve ter acesso aos detalhes do repositório pesquisado

   @tag6 @all
   Scenario: favoritar um repositorio
   When estiver na tela Outros Repositorios
   And acessar os detalhes de um repositório
   Then deve conseguir favoritar o repositório

   @tag7 @all
   Scenario: Acessar a pagina favoritos e ver o repositorio favoritado
   When estiver na tela favoritos
   Then deve conseguir ver os repositórios favoritados

   @tag8 @all
   Scenario: Desfavotitar um repositorio
   When estiver na tela favoritos
   Then deve conseguir desfavoritar um repositório que foi favoritado anteriormente










  