package aula09;
public class Aula09 {
    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[2];
        Livro l[] = new Livro[3];
        
        p[0] = new Pessoa("Rodrigo", 22, "Macho");
        p[1] = new Pessoa("Lais", 18, "Femea");
        
        l[0] = new Livro("Dom Casmurro", "Machado de Assis", 395, p[0]);
        l[1] = new Livro("Noite na Taberna", "Algum corno aí", 300, p[1]);
        l[2] = new Livro("Java Poo", "Gustavo Guanabara", 15, p[0]);

        l[0].abrir();
        l[0].avancarPag();
        l[0].folhear(396);
        System.out.println(l[0].detalhes());
        
    }
    
}
