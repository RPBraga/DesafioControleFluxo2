import java.util.Scanner;

/*
  Case 1: Vamos imaginar que em um processo seletivo, existe o valor base salarial de R$ 2.000,00 e o
  salário pretentido pelo candidato. Vamos elaborar um controle de fluxo onde:

        . Se o valor salário base, for maior que valor salário pretentido, imprima : LIGAR PARA O CANDIDATO;
        . Senão, Se o valor salário base for igual ao valor salário pretentido, imprima : LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA;
        . Senão imprima: AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS.
 */
public class ProcessoSeletivo1 {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o valor do salário pretendindo: ");
        double salarioPretendido = teclado.nextDouble();
        System.out.println(salarioPretendido);
        analisarCandidato(salarioPretendido);
    }
    static void analisarCandidato (double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
