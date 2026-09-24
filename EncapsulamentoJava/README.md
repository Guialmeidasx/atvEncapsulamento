# EncapsulamentoJava - VS Code

Projeto Java de encapsulamento convertido da estrutura usada no Eclipse.

## Estrutura

- `src/br/edu/fatecpg/encapsulamento/model/Carro.java`
- `src/br/edu/fatecpg/encapsulamento/model/ContaBancaria.java`
- `src/br/edu/fatecpg/encapsulamento/model/Produto.java`
- `src/br/edu/fatecpg/encapsulamento/view/Main.java`

## Como executar no VS Code

1. Instale o Java JDK.
2. Instale no VS Code a extensão **Extension Pack for Java** da Microsoft.
3. Abra a pasta `EncapsulamentoJava_VSCode` no VS Code.
4. Abra `Main.java`.
5. Clique em **Run** ou pressione `F5`.

Também é possível pelo terminal:

```bash
javac -d bin src/br/edu/fatecpg/encapsulamento/model/*.java src/br/edu/fatecpg/encapsulamento/view/Main.java
java -cp bin br.edu.fatecpg.encapsulamento.view.Main
```
