public class ProfessorPesquisador {
  private String nome;
  private int idade;

  public void pesquisar (){
    System.out.println("Pesquisando...");
  }

  public int getIdade() {
    return idade;
  }

  public String getNome() {
    return nome;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }
  
  public void setNome(String nome) {
    this.nome = nome;
  }
}
