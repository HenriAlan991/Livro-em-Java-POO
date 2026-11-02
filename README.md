# 📚 Livro e Leitor (Aula 9b)

Um projeto simples em Java que simula um livro sendo lido por uma pessoa. Dá pra abrir e fechar o livro, folhear até uma página específica, avançar e voltar páginas. Se alguma ação não for possível (como ir para uma página que não existe), o programa avisa no console. No final, é possível ver todos os detalhes do livro: título, autor, total de páginas, página atual, se está aberto e quem é o leitor.

## 🎓 Sobre o projeto

Este projeto foi criado durante a **aula 9b** do **Curso de Java POO** do professor **Gustavo Guanabara**, do canal **Curso em Vídeo**.

Nele eu pratiquei:

- **Encapsulamento**: atributos privados, acessados por meio de métodos *getters* e *setters*.
- **Métodos construtores**: `Pessoa` e `Livro` já nascem com os valores iniciais definidos (o livro começa fechado, na página 1).
- **Interface**: a interface `Publicacao` define o que uma publicação pode fazer, e a classe `Livro` implementa essas ações com `@Override`.
- **Relação entre classes**: o `Livro` recebe uma `Pessoa` no construtor e guarda o nome dela como leitor.

## 🗂️ Estrutura

```
src/aula9b/
├── Publicacao.java   → interface com as ações de uma publicação
├── Pessoa.java       → classe que representa o leitor
├── Livro.java        → classe que implementa Publicacao
└── Main.java         → programa principal para testar
```

## ▶️ Como executar

1. Clone ou baixe o projeto.
2. Abra em uma IDE Java (IntelliJ, Eclipse, NetBeans...).
3. Execute a classe `Main`.

Ou, pelo terminal, a partir da pasta `src`:

```bash
javac aula9b/*.java
java aula9b.Main
```

## 💬 Exemplo de saída

```
Fooleei para á página: 20
Acabei de avançar 125 ,agora estamos na página: 145
Acabei de voltar 37 ,agora estamos na página: 108
--- DETALHES DO LIVRO ---
TÍTULO: Aprenda JavaScript
AUTOR: Joao Cristo
TOTAL DE PÁGINAS: 256
PÁGINA ATUAL: 108
ABERTO: SIM
LEITOR: Henri Alan Cavejon Sufiatti
```

## 🚫 Sobre o uso de IA

**Não foi usada IA no código.** Todo o código deste projeto foi escrito por mim, durante meus estudos.

Somente este arquivo `README.md` foi feito com a ajuda do **Claude AI** (modelo utilizado: **Claude Sonnet 5.5**).

## ✍️ Autor

**Henri Alan Cavejon Sufiatti**

📅 2 de novembro de 2026
