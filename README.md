# API REST - Med Voll (Spring Boot)

# API REST com Spring Boot Java

Este repositório contém uma **API REST simples construída com Spring Boot e Java**.  
No momento, o projeto inclui apenas um endpoint de `POST` para envio de dados (por enquanto é o único recurso implementado).

## 🧠 Sobre

Este projeto tem como objetivo demonstrar a construção de uma API REST em Java usando o framework **Spring Boot**. É útil tanto para aprendizado quanto como base para projetos futuros que precisem de um backend REST. 

## 📦 Tecnologias

- 🔹 Java  
- 🔹 Spring Boot  
- 🔹 Maven  
- 🔹 (Opcional) Banco de dados configurável via Spring Data JPA

## 🚀 Funcionalidades

No momento a API possui:

- **POST** endpoint para criar um recurso (por exemplo, um objeto JSON enviado ao servidor)

## 🛠️ Requisitos

Antes de rodar a aplicação, certifique-se de ter instalado em sua máquina:

- Java 17 (ou superior)
- Maven
- IDE ou editor de código (VS Code, IntelliJ, etc.)

## 🎯 Como Executar Localmente

1. Clone o repositório:
   ```bash
   git clone https://github.com/mel-ferreira/api.git

2. Entre no projeto:
   ```bash
   cd api

3. Rode a aplicação:
   ```bash
   mvn spring-boot:run

## Com Postman

Abra o Postman

1. Crie uma nova requisição
2. Defina o método como POST
3. Insira a URL
4. Envie um JSON no corpo da requisição (Body → raw → JSON)

🧩 Estrutura do Projeto
api/
├── src/
│   ├── main/
│   │   ├── java/
│   │   └── resources/
├── .gitignore
├── README.md
├── mvnw
├── pom.xml

🛠️ Próximos Passos

Endpoints GET, PUT, DELETE
