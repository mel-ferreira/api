# API - Projeto Spring Boot Med Voll

Descrição
---------

Esta é uma API de exemplo construída com Spring Boot para gerenciar recursos médicos (médicos, pacientes e autenticação). O projeto inclui migrações de banco de dados com Flyway e camadas típicas de controller, domain e infra.

Principais arquivos
-------------------

- [ApiApplication.java](src/main/java/med/voll/api/ApiApplication.java#L1) - ponto de entrada da aplicação
- Migrations: [src/main/resources/db/migration](src/main/resources/db/migration#L1) - scripts Flyway (V1__, V2__, ...)
- Configuração Flyway: [src/main/java/med/voll/api/config/FlywayConfig.java](src/main/java/med/voll/api/config/FlywayConfig.java#L1)
- Controllers:
  - [AutenticacaoController.java](src/main/java/med/voll/api/controller/AutenticacaoController.java#L1)
  - [MedicoController.java](src/main/java/med/voll/api/controller/MedicoController.java#L1)
  - [PacienteController.java](src/main/java/med/voll/api/controller/PacienteController.java#L1)

Requisitos
---------

- Java 17+ (ou conforme configurado no `pom.xml`)
- Maven (o wrapper `mvnw` / `mvnw.cmd` já está incluído)
- Banco de dados configurado via `application.properties` (ex.: Postgres, MySQL)

Configuração do banco de dados
-----------------------------

Edite `src/main/resources/application.properties` para apontar para o seu banco de dados. As migrações Flyway localizam-se em `src/main/resources/db/migration` e serão executadas automaticamente na inicialização (conforme configuração).

Executando a aplicação (modo desenvolvimento)
-------------------------------------------

No Windows (usando o wrapper incluído):

```powershell
mvnw.cmd spring-boot:run
```

Em Linux / macOS:

```bash
./mvnw spring-boot:run
```

Gerar build e executar JAR
-------------------------

```bash
./mvnw clean package
java -jar target/api-0.0.1-SNAPSHOT.jar
```

Testes
------

Execute os testes com:

```bash
./mvnw test
```

Endpoints principais
-------------------

Os endpoints estão organizados nos controllers mencionados acima. Por exemplo:

- Autenticação: implementada em AutenticacaoController
- Cadastro/Listagem/Atualização de médicos: MedicoController
- Cadastro/Listagem/Atualização de pacientes: PacienteController

Veja também os DTOs e classes de domínio em `src/main/java/med/voll/api/domain` para os formatos de requisição/resposta.

Migrações (Flyway)
------------------

Os scripts SQL estão em `src/main/resources/db/migration`. Eles são aplicados pela configuração do Flyway ao iniciar a aplicação. Caso queira aplicar manualmente, use sua ferramenta de BD preferida para executar os scripts na ordem (V1__, V2__, ...).

🧩 Estrutura do Projeto api/ 
├── src/ │ 
   ├── main/ │ │ 
      ├── java.med.voll.api/ │
         │ └── config/
         └── controller/
         └── domain/
         └── infra/    
         └── resources/
   └── test/
└── target/  
├── .gitignore 
├── README.md 
├── mvnw 
├── pom.xml