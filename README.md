#### 1 - Buildar e executar a aplicação

Dentro do diretório root da aplicação executar os passos abaixo.

2.a - Para buildar a aplicação:
` mvn clean install #para buildar o pacote da aplicação`

a linha de código a cima criara uma pasta chamada `target` com a versão final da aplicação.

2.b Para executar a aplicação:

` java -jar movimentomonua-l0.0.1-SNAPSHOT.jar`

A partir deste ponto se tudo ocorrer corretamente a aplicação estará rodando 
e atendendo requisições através da porta cadastrada no arquivo `application.yml` (se não foi alterado estará na porta 8080).

É possível utilizar o client do swagger através da url [http://localhost:8080/swagger-ui.html], possibilitando a verificação dos endpoints, dos DTOs esperados, e até mesmo realizar testes de requisições. 

#### 2 - Pontos de melhorias
