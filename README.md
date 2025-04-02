# Kafka Microsserviços

**Kafka Microsserviços** é um projeto que implementa microsserviços utilizando Apache Kafka para simular processos como envio de pedidos, e-mails, detecção de fraudes, registro de logs, armazenamento de usuários em banco de dados e geração de relatórios.

## Funcionalidades

- **Simulação de Processos**: Envio de pedidos, notificações por e-mail, detecção de fraudes, registro de logs, armazenamento de usuários e geração de relatórios.
- **Produtores e Consumidores**: Implementação de produção e consumo de mensagens no Apache Kafka.
- **Streams**: Utiliza Kafka Streams para processamento de dados em tempo real.
- **Cluster de Brokers**: Configuração de um cluster de brokers para escalabilidade e redundância.
- **Batches, Correlation IDs e Dead Letters**: Implementação de processamento em lote, identificação de correlação e tratamento de mensagens não processáveis.
- **Idempotência e Garantias**: Garante que operações sejam idempotentes e forneçam garantias de entrega.
- **Conteinerização com Docker**: Utiliza Docker para facilitar a implantação e gestão dos microsserviços.

## Tecnologias Utilizadas

- **Java**: Linguagem utilizada para desenvolvimento dos microsserviços.
- **Apache Kafka**: Plataforma de streaming distribuído para pipelines de dados em tempo real.
- **Kafka Streams**: Biblioteca para processamento de fluxos de dados em tempo real.
- **Docker**: Plataforma para conteinerização e gerenciamento de serviços.

## Estrutura do Projeto

O repositório está organizado da seguinte forma:

- **docker/**: Configuração dos containers Docker para os serviços.
- **ecommerce/**: Implementação básica dos microsserviços.
- **microservicos/**: Versão aprimorada dos microsserviços com funcionalidades adicionais.
- **microservicos-evolution/**: Evolução dos microsserviços com melhorias e novas abordagens.
- **microservicos-evolution2/**: Continuação da evolução dos microsserviços.
- **microservicos-evolution3/**: Última versão dos microsserviços, com otimizações finais.
- **others/**: Outros arquivos e recursos do projeto.

## Configuração e Execução

### Pré-requisitos

- **Java 8 ou superior**
- **Docker**
- **Apache Kafka**

### Passos para Execução

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/williammian/kafka.git
   ```

2. **Navegue até o diretório desejado**:
   ```bash
   cd kafka/ecommerce
   ```

3. **Compile e execute os serviços**:
   ```bash
   mvn clean install
   java -jar target/nome-do-artefato.jar
   ```

4. **Utilize Docker para serviços adicionais**:
   ```bash
   docker-compose up
   ```

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).

---

