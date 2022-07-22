import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);



        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devTenille = new Dev();
        devTenille.setNome("Tenille");
        devTenille.increverBootcamp(bootcamp);
        System.out.println("Conteúdos Incritos" + devTenille.getConteudosinscritos());
        devTenille.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Incritos" + devTenille.getConteudosinscritos());
        System.out.println("Conteúdos Concluidos" + devTenille.getConteudosconcluidos());
        System.out.println("XP:" + devTenille.calcularTotalXp());
        System.out.println("--------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.increverBootcamp(bootcamp);
        System.out.println("Conteúdos Incritos" + devJoao.getConteudosinscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Incritos" + devJoao.getConteudosinscritos());
        System.out.println("Conteúdos Concluidos" + devJoao.getConteudosconcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());


    }
}
