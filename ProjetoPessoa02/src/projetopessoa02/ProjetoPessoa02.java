package projetopessoa02;
public class ProjetoPessoa02 {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        Aluno a1 = new Aluno();
        a1.setNome("Rodrigo");
        a1.setCurso("Dev");
        a1.setMatricula(1111);
        a1.setSexo("Macho");
        System.out.println(a1.toString());
        
    }
    
}
