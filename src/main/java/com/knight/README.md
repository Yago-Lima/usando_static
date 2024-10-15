
# Tutorial: Como Navegar Pelos Commits no Git

Este tutorial irá guiá-lo sobre como visualizar e navegar pelos commits em um repositório Git. Os commits são como "pontos de salvamento" no histórico do código, permitindo que você acompanhe as alterações feitas no projeto.

## Pré-requisitos

- Git instalado no seu sistema
- Acesso a um repositório Git, seja local ou remoto (por exemplo, GitHub, GitLab, etc.)

## Visualizando o Histórico de Commits

### 1. Ver o Histórico no Git Local

Para visualizar os commits em seu repositório local, você pode usar o comando `git log`. Este comando lista todos os commits feitos no repositório, mostrando o hash do commit, o autor, a data e a mensagem de commit.

```bash
git log
```

Por padrão, isso mostrará um histórico completo. Para uma versão mais compacta, você pode usar a opção `--oneline`:

```bash
git log --oneline
```

### 2. Visualizando Commits no GitHub/GitLab

Se você estiver utilizando uma plataforma como GitHub, você pode navegar pelos commits através da interface gráfica. Aqui está um passo a passo de como visualizar os commits no GitHub:

- Acesse o repositório no GitHub.
- Clique na aba **Commits**. Isso abrirá uma lista dos commits mais recentes.

Na imagem acima, vemos vários commits de um projeto. Cada commit inclui as seguintes informações:

- **Mensagem do commit**: uma breve descrição do que foi alterado (por exemplo, "como evitar mudanças em palavra static").
- **Autor do commit**: a pessoa que fez as alterações (neste caso, o autor é "Yago-Lima").
- **Tempo do commit**: o tempo desde que o commit foi feito (por exemplo, "34 minutes ago").

### 3. Explorando um Commit Específico

Se você quiser ver o que foi alterado em um commit específico, clique no commit desejado (em plataformas como GitHub). Isso irá mostrar:

- As alterações feitas em cada arquivo (adicionadas, removidas ou modificadas).
- A comparação do estado do código antes e depois do commit.

No terminal, você também pode visualizar as alterações feitas em um commit específico com o comando:

```bash
git show <commit_hash>
```

Substitua `<commit_hash>` pelo hash do commit que você deseja visualizar, que pode ser encontrado ao lado da mensagem do commit no `git log`.

### 4. Voltando Para um Commit Anterior

Se você quiser voltar para o estado de um commit anterior, você pode usar o comando `checkout`:

```bash
git checkout <commit_hash>
```

Isso irá mudar o estado do seu repositório para o commit selecionado. Lembre-se de que isso cria um estado "desanexado" (detached HEAD), então você não estará mais na última versão do código. Para voltar para o último commit, use:

```bash
git checkout main
```

(ou `master`, dependendo do nome da sua branch principal).

### 5. Comparando Commits

Você pode comparar dois commits usando a interface gráfica do GitHub ou via terminal com o comando:

```bash
git diff <commit_hash_1> <commit_hash_2>
```

Isso irá exibir as diferenças entre os dois commits.

---

## Conclusão

Navegar pelos commits é uma habilidade fundamental no Git, permitindo que você rastreie alterações no seu código e reveja o histórico do projeto. Com essas técnicas, você pode facilmente acessar o histórico de alterações e garantir a integridade do seu código ao longo do tempo.
