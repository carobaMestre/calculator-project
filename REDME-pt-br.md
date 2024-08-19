# Calculadora Java

Este é um projeto de uma calculadora simples escrita em Java, que permite realizar operações matemáticas básicas como adição, subtração, multiplicação e divisão. O projeto foi desenvolvido seguindo boas práticas de programação orientada a objetos, com foco em escalabilidade, manutenção e facilidade de entendimento.

## Funcionalidades

- **Adição**: Soma de dois números.
- **Subtração**: Subtração de dois números.
- **Multiplicação**: Multiplicação de dois números.
- **Divisão**: Divisão de dois números, com tratamento para divisão por zero.

## Estrutura do Projeto

O projeto é dividido em duas classes principais:

1. **Calculadora**: Classe principal que gerencia a interação com o usuário e solicita os números e o operador.
2. **CalculadoraService**: Classe de serviço que contém a lógica de negócio para realizar os cálculos com base nos números e operador fornecidos.

### Classes

- **Calculadora**
  - `main(String[] args)`: Ponto de entrada do programa.
  - `solicitarNumero(Scanner scanner, String mensagem)`: Solicita um número ao usuário.
  - `solicitarOperador(Scanner scanner, String mensagem)`: Solicita um operador ao usuário.

- **CalculadoraService**
  - `calcular(double num1, double num2, char operador)`: Realiza o cálculo baseado no operador fornecido.
  - `isOperadorValido(char operador)`: Verifica se o operador fornecido é válido.

## Pré-requisitos

Para executar este projeto, você precisa ter o **Java 8** ou superior instalado em sua máquina.

## Como Executar

1. **Clone o repositório**:
    ```bash
    git clone https://github.com/seu-usuario/calculadora-java.git
    cd calculadora-java
    ```

2. **Compile o código**:
    ```bash
    javac Calculadora.java
    ```

3. **Execute o programa**:
    ```bash
    java Calculadora
    ```

4. **Interaja com o programa**:
    - Insira o primeiro número quando solicitado.
    - Escolha um operador (`+`, `-`, `*`, `/`).
    - Insira o segundo número.
    - O resultado será exibido no console.

## Exemplos de Uso

**Entrada**: 
  Digite o primeiro número: 10
  Digite o operador (+, -, *, /): *
  Digite o segundo número: 5

**Saída**:
  O resultado é: 50.0


Neste exemplo, o usuário escolheu multiplicar 10 por 5, resultando em 50.0.

## Tratamento de Erros

O programa trata alguns cenários de erro comuns, como:

- **Entrada inválida**: Se o usuário inserir um valor não numérico quando solicitado um número, o programa solicitará novamente até que um número válido seja inserido.
- **Operador inválido**: Se o usuário inserir um operador que não seja `+`, `-`, `*`, ou `/`, o programa solicitará um operador válido.
- **Divisão por zero**: Se o usuário tentar dividir um número por zero, o programa lançará uma exceção informando que essa operação não é permitida.

## Estrutura do Código

O código foi desenvolvido seguindo as boas práticas de programação, utilizando nomes de variáveis em inglês para garantir um padrão internacional, enquanto as mensagens de interação com o usuário estão em português brasileiro. A divisão entre a lógica de apresentação e a lógica de negócios foi implementada para facilitar a manutenção e a escalabilidade do projeto.

## Contribuindo

Contribuições são bem-vindas! Se você encontrar algum problema ou tiver sugestões para melhorias, sinta-se à vontade para abrir uma *issue* ou enviar um *pull request*.

## Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.

