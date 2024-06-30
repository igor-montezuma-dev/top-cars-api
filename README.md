# Top Cars API

Este é um projeto Java Spring Boot que fornece uma API para gerenciamento de carros. Ele permite operações CRUD em carros, marcas e modelos.

## Funcionalidades

- **Gerenciamento de Carros**: A aplicação permite que os usuários criem, leiam, atualizem e excluam carros. Cada carro tem um modelo, marca, ano de fabricação, cor e preço.

- **Gerenciamento de Marcas**: Os usuários podem criar, ler, atualizar e excluir marcas de carros. Cada marca tem um nome e uma lista de modelos associados.

- **Gerenciamento de Modelos**: Os usuários podem criar, ler, atualizar e excluir modelos de carros. Cada modelo pertence a uma marca e tem um nome.

- **Busca de Carros**: Os usuários podem buscar carros por marca, modelo, ano de fabricação, cor e preço.

## Tecnologias Utilizadas

- Java
- Spring Boot
- Maven
- PostgreSQL (Hibernate)
- Docker
  
## Pré-requisitos

- JDK 17 ou superior
- PostgreSQL (com banco de dados criado)

- ## Configuração do Banco de Dados

1. Crie um banco de dados PostgreSQL com o nome `top-cars`.
2. Configure as credenciais de acesso ao banco de dados no arquivo `application.properties`.

Exemplo de `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/top-cars
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
````
## Contribuição

1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/sua-feature`)
3. Commite suas alterações (`git commit -m 'Adiciona sua feature'`)
4. Faça um push para a branch (`git push origin feature/sua-feature`)
5. Abra um Pull Request

## Licença

Este projeto está licenciado sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

Feito por [Igor Montezuma](https://github.com/igor-montezuma-dev)
