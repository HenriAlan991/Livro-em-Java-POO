package aula9b;

public class Livro implements Publicacao{

    // ATRIBUTOS
    private String titulo;
    private String autor;
    private int totPags;
    private int pagAtual;
    private boolean aberto;
    private String leitor;


    // MÉTODO CONSTRUTOR

    public Livro(
            String titulo,
            String autor,
            int totPags,
            Pessoa pessoa

    ){
        setTitulo(titulo);
        setAutor(autor);
        setTotPags(totPags);
        setPagAtual(1);
        setAberto(false);
        setLeitor(pessoa.getNome());


    }



    // MÉTODOS PÚBLICOS PRÓPIOS
    public void detalhes(){
        System.out.println("--- DETALHES DO LIVRO ---");

        System.out.println("TÍTULO: " + getTitulo());
        System.out.println("AUTOR: " + getAutor());
        System.out.println("TOTAL DE PÁGINAS: " + getTotPags());
        System.out.println("PÁGINA ATUAL: " + getPagAtual());
        if(getAberto()){
            System.out.println("ABERTO: SIM");
        }
        else{
            System.out.println("ABERTO: NÃO");
        }
        System.out.println("LEITOR: " + getLeitor());
    }



    // MÉTODOS PÚBLICOS DA INTERFACE
    @Override
    public void abrir() {
        if(getAberto()){
            System.out.println("O Livro já está aberto!");
        }
        else{
            setAberto(true);
        }

    }

    @Override
    public void fechar() {
        if(getAberto()){
            setAberto(false);
        }
        else{
            System.out.println("O Livro já está fechado!");
        }

    }

    @Override
    public void folear(int pag) {
        if(pag != getPagAtual() && pag <= getTotPags() && pag >= 1){
            setPagAtual(pag);
            System.out.println("Fooleei para á página: " + getPagAtual());
        }
        else{
            System.out.println("Insira uma página válida!");
        }

    }

    @Override
    public void avancarPag(int numPags) {
        if(numPags < getTotPags() && numPags >= 1 && (numPags + getPagAtual() <= getTotPags()) && (numPags + getPagAtual() >= 1)){



            setPagAtual(getPagAtual() + numPags);
            System.out.println("Acabei de avançar " + numPags + " ,agora estamos na página: " + getPagAtual());
        }
        else{
            System.out.println("Insira um número válido de vezes!");
        }

    }

    @Override
    public void voltarPag(int numPags) {
        if(numPags < getTotPags() && numPags >= 1 && (getPagAtual() - numPags >= 1)){
            System.out.println("Acabei de voltar " + numPags + " ,agora estamos na página: " + getPagAtual());
            
        }
        else{
            System.out.println("Insira um número válido de vezes!");
        }


    }

    // MÉTODOS ESPECIAIS
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPags() {
        return totPags;
    }

    public void setTotPags(int totPags) {
        this.totPags = totPags;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public String getLeitor() {
        return leitor;
    }

    public void setLeitor(String leitor) {
        this.leitor = leitor;
    }
}
