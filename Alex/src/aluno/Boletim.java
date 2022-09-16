//Andressa 352

package aluno;

public class Boletim {
	
	public static void main(String[] args) {

		Aluno aluno1 = new Aluno();
		aluno1.n1 = 4.5f;
		aluno1.n2 = 6.7f;
		aluno1.n3 = 8.3f;
		aluno1.n4 = 8.1f;
		
		aluno1.nome = "Jorginho";
		
		Professor prof1 =new Professor();
		prof1.Disciplina = " Matemática";
		float Media= ((aluno1.n1 + aluno1.n2 + aluno1.n3 + aluno1.n4) / 4);
		
		
		
		System.out.println(aluno1.nome + " obteve a média de: " + Media + prof1.Disciplina);
		

	}

}
