import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
/*
*  Foi solicitado, que nosso sistema garanta que, diante das inúmeras candidaturas sejam selecionados
*  apenas no máximo, 5 candidatos para entrevista, onde o salário pretendido seja menor ou igual ao
*  salário base.
*/

public class ProcessoSeletivo2 {
    public static void main(String[] args) {
        //selecaoCandidatos();
        imprimirSelecionados();
    }

    static void imprimirSelecionados () {
        String[] candidatos = {"FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA", "DANIELA", "JORGE"};

        //System.out.println("Imprimindo a lista de Candidatos informando o índice: ");
        //for (int indice = 0; indice < candidatos.length; indice++) {
        //    System.out.println("O Candidato número " + (indice+1) + " é o => " + candidatos [indice] );
        System.out.println("Imprimindo A lista de Candidatos usando a forma reduzida do FOR");
        for (String selecionado : candidatos){
            System.out.println("O candidato selecionado foi: " + selecionado);
        }

    }
    static void selecaoCandidatos () {
        String[] candidatos = {"FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA", "DANIELA", "JORGE"};

        int candidatoSelecionado = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.00;

        while (candidatoSelecionado < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " informou a pretenção salarial de: " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O Candidato " + candidato + " foi selecionado para entrevista.");
                candidatoSelecionado++;
            } else {
                System.out.println("O Candidato " + candidato + " foi desclacificado! ");
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
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

