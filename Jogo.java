public class Jogo {
    int[][] grade = new int[3][3];

    //Pegar posições
    System.out.println("Digite as suas posições");
    int pos1 = controle.lerInt();
    int pos2 = controle.lerInt();
    
    grade[pos1][pos2] = 3;
    System.out.println(grade[pos1][pos2]);
}

System.out.println("Digite as suas posições");
        Controle controle = new Controle();
        int pos1 = Controle.lerInt();
        int pos2 = Controle.lerInt();

        grade[pos1][pos2] = 3;
        System.out.println(grade[pos1][pos2]);
