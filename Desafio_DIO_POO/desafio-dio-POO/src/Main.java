import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo( "Curso Java" );
        curso1.setDescricao( "Aprendendo a implementar POO em Java" );
        curso1.setCargaHoraria( 40 );

        Curso curso2 = new Curso();
        curso2.setTitulo( "Bootcamp Quebec Digital" );
        curso2.setDescricao( "Aprendendo a implementar programas em JAVA - Mão na massa" );
        curso2.setCargaHoraria( 80 );

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo( "Mentoria em JAVA" );
        mentoria.setDescricao( "Aulas para tirar dúvidas sobre a codificação JAVA" );
        mentoria.setData( LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Aprendendo a implementar programas em JAVA - Mão na massa");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev novoDev1 = new Dev();
        novoDev1.setNome("Rodrigo");
        novoDev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + novoDev1.getConteudosInscritos());

        novoDev1.progressao();
        novoDev1.progressao();

        System.out.println("Conteúdos Inscritos" + novoDev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + novoDev1.getConteudosConcluidos());
        System.out.println("XP atual do Dev" + novoDev1.calcularTotalXp());

        System.out.println("_____________________________");

        Dev novoDev2 = new Dev();
        novoDev2.setNome("Thiago");
        novoDev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + novoDev2.getConteudosInscritos());

        novoDev2.progressao();

        System.out.println("Conteúdos Inscritos" + novoDev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + novoDev2.getConteudosConcluidos());
        System.out.println("XP atual do Dev" + novoDev2.calcularTotalXp());

    }
}
