public class Jogo {
    int[][] grade = new int[3][3];

    //Pegar posições
    System.out.println("Digite as suas posições");
    int pos1 = controle.lerInt();
    int pos2 = controle.lerInt();
    
    grade[pos1][pos2] = 3;
    System.out.println(grade[pos1][pos2]);
}
