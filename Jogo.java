public class Jogo {
    static int[][] grade = new int[3][3];


    static public void mostrarGrade(){
        System.out.println("====================================");


        System.out.println(grade[0][0]+" | "+grade[0][1]+" | "+grade[0][2]);
        System.out.println(grade[1][0]+" | "+grade[1][1]+" | "+grade[1][2]);
        System.out.println(grade[2][0]+" | "+grade[2][1]+" | "+grade[2][2]);


        System.out.println("====================================");
    }

    public static void main(String[] args) {
        


        System.out.println("Digite as suas posições");
        Controle controle = new Controle();
        int pos1 = Controle.lerInt();
        int pos2 = Controle.lerInt();

        grade[pos1][pos2] = 1;

        mostrarGrade();
        

    }


}
