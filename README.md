# Controle-contas

- Pra rodar API
    1. Criar o arquivo `.env` a partir do exemplo (já vem com valores de exemplo; troque pelo menos as senhas):
       ```bash
       cp .env.example .env
       ```
       | Variável                   | Para que serve                     |
       |----------------------------|------------------------------------|
       | `POSTGRES_USER`            | usuário do banco                   |
       | `POSTGRES_PASSWORD`        | senha do banco                     |
       | `POSTGRES_DB`              | nome do banco                      |
       | `PGADMIN_DEFAULT_EMAIL`    | e-mail de login no pgAdmin         |
       | `PGADMIN_DEFAULT_PASSWORD` | senha de login no pgAdmin          |

       O mesmo `.env` é lido pelo Docker Compose e pela API (`spring.config.import`).
       Ele está no `.gitignore`, então não vai pro repositório.
    2. Subir o Postgres (Docker):
       ```bash
       docker compose up -d
       ```
    3. Subir a API:
       ```bash
       ./mvnw spring-boot:run
       ```
