import java.util.Scanner;

public class Vetores {
	public static final int TAMANHO = 10;
	public static void main(String[] args) {
		
		//double aluno1, aluno2, aluno3, aluno4, aluno5, aluno6, aluno7, aluno8, aluno9, aluno10, total;
		double total=0;
		double alunos[]=new double[10];
		Scanner leitor = new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
		
		System.out.println("Por favor, digite o consumo do" + (i+1)+ "º aluno");
		alunos[i] = leitor.nextDouble();
		total = total + alunos[i];
		}
		
		for(int i=0;i<10;i++) {
			
			System.out.println("O aluno" + (i+1)+ "consumiu R$" + alunos[i]);
			
			}
		{
		System.out.println("O total de consumo foi de" + total);
		}
		
		leitor.close();
		

	}

}
