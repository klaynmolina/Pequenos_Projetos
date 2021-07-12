package ArrayListFuncionario;

public class Funcionario {
	
	private String nome;
	private String sobrenome;
	private Integer horasTrabalhadas;
	private Double valorHora;
	private Double salario;
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public void nomeCompleto() {
		//System.out.println(this.nome.concat(" ").concat(this.sobrenome));
		System.out.println("Nome completo: " + this.nome + " " + this.sobrenome);
	}
	
	public void calcularSalario() {
		this.salario = horasTrabalhadas * valorHora;
		System.out.println("Salário: R$" + this.salario);
	}
	
	public void incrementarHoras (Integer horas) {
		this.horasTrabalhadas += horas;
		System.out.println("Totais de Horas Trabalhadas: " + horasTrabalhadas);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Integer getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(Integer horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public Double getValorHora() {
		return valorHora;
	}

	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}

}
