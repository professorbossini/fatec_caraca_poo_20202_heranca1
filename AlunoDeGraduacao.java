public class AlunoDeGraduacao{
  private String nome;
  private int idade;
  private double nota1, nota2, notaFinal;

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setNota1(double nota1) {
    this.nota1 = nota1;
  }

  public void setNota2(double nota2) {
    this.nota2 = nota2;
  }

  public void setNotaFinal(double notaFinal) {
    this.notaFinal = notaFinal;
  }

  public int getIdade() {
    return idade;
  }

  public String getNome() {
    return nome;
  }

  public double getNota1() {
    return nota1;
  }

  public double getNota2() {
    return nota2;
  }

  public double getNotaFinal() {
    return notaFinal;
  }

}