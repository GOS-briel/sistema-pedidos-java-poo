# Sistema de Pedidos em Java (POO)

Sistema de cadastro de clientes, produtos e pedidos feito em Java puro, para praticar os pilares da orientação a objetos.

> Projeto desenvolvido no curso **Back End Java da Ada Tech em parceria com o Mercado Livre**, módulo de Programação Orientada a Objetos II.

## O que o sistema faz

- **CRUD de clientes:** cadastrar, listar, atualizar e buscar por id
- **Produtos e pedidos:** cada pedido guarda seus itens, com quantidade e preço
- **Status com enums:** um para o status do pedido (entrega) e outro para o pagamento
- **Notificação por e-mail:** contrato definido em interface, para avisar o cliente das mudanças no pedido

## Como está organizado

| Pacote | Responsabilidade |
|---|---|
| `Cliente`, `Produto`, `Pedido` | Classes de domínio, cada uma com seu próprio controle |
| `Controle` | Interfaces com os contratos de cadastro, listagem, atualização e notificação |
| `Servico` | Implementação das interfaces de cliente e e-mail |
| `Status` | Enums de status do pedido e do pagamento |
| `Main.java` | Ponto de entrada, que executa o CRUD de clientes |

## Conceitos praticados

- Encapsulamento e separação de responsabilidades (domínio × controle × serviço)
- Interfaces com métodos `default` para reaproveitar comportamento
- Enums para representar estados de forma segura
- Fluxo de trabalho com branches (`Developer` → `main`) e pull request

## Como executar

Abra o projeto no IntelliJ IDEA (ou outra IDE Java) e execute `src/Main.java`. Não há dependências externas.
