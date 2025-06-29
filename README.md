# 🏦 Sistema Bancário - Projeto de Estudo Java

## 📚 Sobre o Projeto

Este projeto foi desenvolvido como parte de um bootcamp de programação, com foco no aprendizado dos **conceitos fundamentais da linguagem Java**. O sistema simula operações básicas de uma conta bancária, demonstrando na prática os pilares da programação orientada a objetos.

## 🎯 Objetivos de Aprendizado

O projeto foi criado para consolidar os seguintes conceitos:

### 1. **Programação Orientada a Objetos (POO)**

- **Classes e Objetos**: Criação da classe `ContaBanco` representando uma conta bancária
- **Encapsulamento**: Uso de métodos getter para acessar atributos privados
- **Construtor**: Inicialização de objetos com estado inicial definido

### 2. **Tipos de Dados Primitivos**

- `int` - para número da conta
- `String` - para agência e nome do titular
- `double` - para valores monetários (saldo)

### 3. **Estruturas de Controle**

- **Condicionais (`if/else`)**: Validação de operações bancárias
- **Loops (`while`)**: Menu interativo que executa até o usuário escolher sair
- **Switch/Case**: Navegação entre diferentes opções do menu

### 4. **Entrada e Saída de Dados**

- **Scanner**: Captura de dados do usuário via terminal
- **System.out.println()**: Exibição de informações e mensagens
- **System.out.printf()**: Formatação de strings com placeholders

### 5. **Métodos e Parâmetros**

- Métodos com parâmetros (`depositar(double valor)`)
- Métodos de acesso (getters)
- Métodos void (que não retornam valores)

### 6. **Validação de Dados**

- Verificação de valores positivos para depósitos
- Validação de saldo suficiente para saques
- Tratamento de entradas inválidas

## 🏗️ Estrutura do Projeto

```
conta-banco/
├── src/
│   ├── ContaBanco.java      # Classe modelo da conta bancária
│   └── ContaTerminal.java   # Classe principal com interface do usuário
├── bin/                     # Arquivos compilados (.class)
├── lib/                     # Dependências (se houver)
└── README.md               # Este arquivo
```

## 💡 Conceitos Técnicos Demonstrados

### **Classe ContaBanco**

```java
public class ContaBanco {
    // Atributos de instância
    int numero;
    String agencia;
    String titular;
    double saldo;

    // Construtor
    public ContaBanco(int numero, String agencia, String titular) {
        // Inicialização com saldo inicial de R$ 25,00
    }

    // Métodos de negócio
    public void depositar(double valor) { /* ... */ }
    public void sacar(double valor) { /* ... */ }

    // Métodos de acesso (Getters)
    public double getSaldo() { /* ... */ }
}
```

### **Classe ContaTerminal**

- **Método main**: Ponto de entrada da aplicação
- **Scanner**: Interação com o usuário
- **Loop infinito**: Menu persistente até escolha de saída
- **Instanciação**: Criação de objeto ContaBanco

## 🚀 Como Executar

1. **Compilar o projeto**:

   ```bash
   javac -d bin src/*.java
   ```

2. **Executar a aplicação**:

   ```bash
   java -cp bin ContaTerminal
   ```

3. **Seguir as instruções** exibidas no terminal

## 🎲 Funcionalidades

- ✅ Criar conta bancária com dados do usuário
- ✅ Realizar depósitos com validação
- ✅ Realizar saques com verificação de saldo
- ✅ Consultar dados da conta
- ✅ Visualizar saldo atual
- ✅ Menu interativo e intuitivo

## 📖 Conceitos de Boas Práticas

1. **Separação de Responsabilidades**:

   - `ContaBanco`: Lógica de negócio
   - `ContaTerminal`: Interface com usuário

2. **Validação de Entrada**:

   - Verificação de valores antes de processar operações

3. **Feedback ao Usuário**:

   - Mensagens claras para cada operação

4. **Controle de Fluxo**:
   - Menu organizado e navegação intuitiva

## 🔍 Próximos Passos de Aprendizado

Este projeto serve como base para conceitos mais avançados:

- **Herança e Polimorfismo**
- **Coleções (ArrayList, HashMap)**
- **Tratamento de Exceções**
- **Interfaces e Classes Abstratas**
- **Persistência de Dados**

---

_Desenvolvido como projeto educacional para consolidação dos fundamentos da linguagem Java._
