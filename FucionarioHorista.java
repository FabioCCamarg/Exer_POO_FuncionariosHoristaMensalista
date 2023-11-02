
public class FucionarioHorista extends Funcionario{
    private int qtHoras;
    private double valorHora;

    public FucionarioHorista() {
            
    }

    public FucionarioHorista(int qtHoras, double valorHora) {
        this.qtHoras = qtHoras;
        this.valorHora = valorHora;
    }

    public FucionarioHorista(int qtHoras, double valorHora, int numeroCracha, String nome, String setor, String funcao) {
        super(numeroCracha, nome, setor, funcao);
        this.qtHoras = qtHoras;
        this.valorHora = valorHora;
    }
    @Override
    public String toString(){
        return  "============================="
                +"\nNumero Cracha: " + getNumeroCracha()
                +"\nNome: " + getNome()
                +"\nSetor: " +getSetor()
                +"\nFuncao: " + getFuncao()
                +"\nQuantidade Horas: " + getQtHoras()
                +"\nValor Hora: " + getValorHora();
     }
    @Override
    public double calcularSalario(){
       return qtHoras * valorHora;
    }

    public int getQtHoras() {
        return qtHoras;
    }

    public void setQtHoras(int qtHoras) {
        this.qtHoras = qtHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
    
}
