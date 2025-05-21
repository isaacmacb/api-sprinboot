# api-sprinboot

API REST desenvolvida com Spring Boot para fins de estudo e desenvolvimento backend.

---

## 🚀 Tecnologias utilizadas

- Java 17
- Spring Boot 3.x
- Maven
- Spring Web
- Spring Data JPA
- H2 Database (ou outro banco que estiver usando)
- Lombok

---


## ⚙️ Como executar o projeto

### Pré-requisitos:

- Java 17 instalado
- Maven instalado

### Passo a passo:

```bash
# Clone o repositório
git clone https://github.com/isaacmacb/api-sprinboot.git
cd api-sprinboot

# Rode a aplicação com o Maven
./mvnw spring-boot:run
A aplicação estará disponível em: http://localhost:8080


Anotações usadas:
@SpringBootApplication	Marca a classe principal da aplicação Spring Boot. Ativa auto-configuração e escaneamento de componentes.
@RestController	Define a classe como um controller REST. Os métodos retornam dados (geralmente em JSON).
@RequestMapping	Define um caminho base para os endpoints da classe ou método.
@GetMapping	Mapeia requisições HTTP do tipo GET para o método anotado.
@RequestBody	Liga o corpo da requisição HTTP ao parâmetro do método. Usado para receber dados em JSON.
@Service	Define a classe como um componente de serviço, onde ficam as regras de negócio.
@Configuration	Indica que a classe fornece configurações do tipo @Bean para o contexto Spring.


