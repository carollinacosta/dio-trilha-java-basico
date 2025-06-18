package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class processoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = {"FERNANDA", "RODRIGO", "CAMILA", "MARCELO", "THAIS"};
        for(String candidato : candidatos){
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu= atender();
            continuarTentando = !atendeu;
            if (continuarTentando){
                tentativasRealizadas++;
            }else
                System.out.println("CONTATO REALIZADO COM SUCESSO!");

        }while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu){
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVAS");
        }else {
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MÁXIMO DE TENTATIVAS "+ tentativasRealizadas);
        }
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){
        String[] candidatos = {"FERNANDA", "RODRIGO", "CAMILA", "MARCELO", "THAIS"};

        for(String candidato : candidatos){
            System.out.println("Os candidatos selecionados foram: " + candidato);
        }


    }

    static void selecaoCandidatos(){
        String[] candidatos = {
                "FERNANDA", "RODRIGO", "CAMILA", "MARCELO", "THAIS",
                "EDUARDO", "PRISCILA", "GUSTAVO", "JULIANA", "BRUNO"
        };

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.printf("O candidato %s solicitou este valor de salário: R$ %.2f%n", candidato, salarioPretendido);
            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado pra vaga!");
                candidatosSelecionados++;
            }
            candidatoAtual++;

        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCandidato (double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }


    }
}



