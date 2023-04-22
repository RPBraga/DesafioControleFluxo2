import br.com.dio.desafio.dominio.Curso;
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
        curso2.setDescricao( "Aprendendo a implementar progrmas em JAVA - Mão na massa" );
        curso2.setCargaHoraria( 80 );

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo( "Mentoria em JAVA" );
        mentoria.setDescricao( "Aulas para tirar dúvidas sobre a codificação JAVA" );
        mentoria.setData( LocalDate.now());


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}
