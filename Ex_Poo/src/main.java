
public class main {

	public static void main(String[] args) {
		
		Jogador j1 = new Jogador();
		j1.Altura = 1.85;
		j1.Nome = "DoCarmo";
		j1.NumCamisa = 10;
		j1.TamChuteira = 40;
		j1.TamRoupa = "GG";
		System.out.println("Nome: " + j1.Nome + "\nAltura: " + j1.Altura +"\nNumero: " + j1.NumCamisa + "\nChuteira: " + j1.TamChuteira + "\nTamanho da Roupa: " + j1.TamRoupa + "\n");
		j1.tocar();
		j1.gol();
		j1.comemorar();
		
		System.out.println("\n");
		
		Jogador j2 = new Jogador();
		j2.Altura = 1.81;
		j2.Nome = "Kauan";
		j2.NumCamisa = 8;
		j2.TamChuteira = 39;
		j2.TamRoupa = "P";
		System.out.println("Nome: " + j2.Nome + "\nAltura: " + j2.Altura +"\nNumero: " + j2.NumCamisa + "\nChuteira: " + j2.TamChuteira + "\nTamanho da Roupa: " + j2.TamRoupa + "\n");
		j2.tocar();
		j2.gol();
		j2.comemorar();
		
		System.out.println("\n");
		
		Funcionario f1 = new Funcionario();
		f1.Cargo = "Professor de Ferramentas digitais";
		f1.DataAdmissão = "25/08/23";
		f1.Nome = "Kauan Paulino";
		f1.Registro = 12345;
		f1.Salario = 1.599;
		System.out.println("Nome: " + f1.Nome + "\nCargo: " + f1.Cargo + "\nSalario: " + f1.Salario + "\nRegistro: " + f1.Registro + "\nData deAdmissao: " + f1.DataAdmissão + "\n");
		f1.BaterPonto();
		f1.trabalhar();
		f1.receberSalario();
	
		
		
		
	
	}

}
