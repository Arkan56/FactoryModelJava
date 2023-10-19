import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int op;
        do {
            System.out.println("1) Iniciar juego");
            System.out.println("2) Salir");
            op = Integer.parseInt(entrada.nextLine());
            EnemyFactory enemyFactory = new RandomEnemyFactoryEasy();
            switch (op)
            {
                case 1:
                    for (int i = 0; i<3; i++)
                    {
                        if (i == 1){
                            enemyFactory = new RandomEnemyFactoryNormal();
                        } else if (i == 2) {
                            enemyFactory = new RandomEnemyFactoryHard();
                        }
                        System.out.println("Nivel #"+(i+1));
                        for (int j = 0; j<10; j++)
                        {
                            Entity entity = enemyFactory.createEnemy();
                            System.out.println(entity.atacar());
                        }
                    }
                    break;
                case 2:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }while (op!=2);
    }
}