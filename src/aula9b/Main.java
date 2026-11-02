package aula9b;
public class Main {
    public static void main(String[] args) {

    Pessoa Leitor1 = new Pessoa(
            "Henri Alan Cavejon Sufiatti",
            15
    );

    Livro AprendaJavaScript = new Livro(
            "Aprenda JavaScript",
            "Joao Cristo",
            256,
            Leitor1
    );

    AprendaJavaScript.abrir();
    AprendaJavaScript.folear(20);
    AprendaJavaScript.avancarPag(125);
    AprendaJavaScript.voltarPag(37);
    AprendaJavaScript.detalhes();


    }
}
