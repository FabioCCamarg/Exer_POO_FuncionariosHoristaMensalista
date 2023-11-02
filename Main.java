
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        
        
        
        ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
        String opt;
        
        
        do {
            opt = JOptionPane.showInputDialog(null, "Menu\n1- Criar Funcionario\n2- Mostrar\n3- Sair");
            
            
            switch (opt) {
                case "1":
                    
                   
                            
                    String opcao = JOptionPane.showInputDialog(null, "1- Horista\n2- Mensalista");
                    if (opcao.equals("1")){
                        int numeroCracha = Integer.parseInt(JOptionPane.showInputDialog(null,"Numero do Cracha: "));
                        String nome = JOptionPane.showInputDialog(null,"Nome:");
                        String setor = JOptionPane.showInputDialog(null,"Setor:");
                        String funcao = JOptionPane.showInputDialog(null,"Funcao:");
                        int qtHoras =  Integer.parseInt(JOptionPane.showInputDialog(null,"Quantidade de Horas:"));
                        double valorHora = Double.parseDouble(JOptionPane.showInputDialog(null,"Valor Hora:"));
                        
                                                
                        FucionarioHorista funcHorista= new FucionarioHorista(qtHoras,valorHora,numeroCracha,nome, setor,funcao);
                        listaFuncionarios.add(funcHorista);
                        
                    }else {
                        
                        
                        int numeroCracha = Integer.parseInt(JOptionPane.showInputDialog(null,"Numero do Cracha: "));
                        String nome = JOptionPane.showInputDialog(null,"Nome:");
                        String setor = JOptionPane.showInputDialog(null,"Setor:");
                        String funcao = JOptionPane.showInputDialog(null,"Funcao:");
                        double salario = Double.parseDouble(JOptionPane.showInputDialog(null,"Salario:"));
                        double desconto = Double.parseDouble(JOptionPane.showInputDialog(null,"Desconto:"));
                        
                                              
                        FuncionarioMensalista funcMensalista = new FuncionarioMensalista(salario,desconto,numeroCracha,nome,setor,funcao);
                        listaFuncionarios.add(funcMensalista);
                    }
                        
                    break;
                case "2":
                    String str= " ";  
                    for (Funcionario func : listaFuncionarios){
                        str += func.toString();
                    }
                    
                    
                    JOptionPane.showMessageDialog(null,str);
                    
                    break;
                case "3":
                        System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Digite uma opção valida!");
                    break;
            }

        }while(!opt.equals("3"));
    }

}
