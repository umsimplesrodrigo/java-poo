package aula09;
public class Livro implements Publicacao{
    private String titulo, autor;
    private int total_pag, pag_atual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int total_pag, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.setAberto(false);
        this.setPag_atual(0);
        this.total_pag = total_pag;
        this.leitor = leitor;
    }

    public String detalhes() {
        return "Livro{" + "\nTítulo: " + titulo 
                + ", \nAutor: " + autor 
                + ", \nTotal de páginas: " + total_pag 
                + ", \nPágina atual: " + pag_atual 
                + ", \nAberto? " + aberto 
                + ", \nLeitor: " + this.leitor.getNome() + "\n}";
    }


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

    public int getTotal_pag() {
        return total_pag;
    }

    public void setTotal_pag(int total_pag) {
        this.total_pag = total_pag;
    }

    public int getPag_atual() {
        return pag_atual;
    }

    public void setPag_atual(int pag_atual) {
        this.pag_atual = pag_atual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int pag) {
        if (pag > this.getPag_atual()) {
            System.out.println("Não é possivél ir até essa página! O livro possui "
                    + "apenas " + this.getTotal_pag() + " páginas!");
        } else {
            this.setPag_atual(pag);
        }
    }

    @Override
    public void avancarPag() {
        if (this.isAberto()) {
            this.setPag_atual(this.getPag_atual() + 1);
            System.out.println("Você avançou uma página!");
        } else if (this.getPag_atual() == this.getTotal_pag()) {
            System.out.println("Já está na última página!");
        } else {
            System.out.println("O livro fechado!");
        }
    }

    @Override
    public void voltarPag() {
        if (this.isAberto()) {
            this.setPag_atual(this.getPag_atual() - 1);
            System.out.println("Você voltou uma página!");
        } else if (this.getPag_atual() == 0) {
            System.out.println("Você está na primeira paǵina, não pode voltar!");
        } else {
            System.out.println("O livro fechado!");
        }
    }
}
