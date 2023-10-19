import java.util.Random;

public class RandomEnemyFactoryHard implements EnemyFactory{
    @Override
    public Entity createEnemy() {
        Random random = new Random();
        Entity entity;
        int numeroAleatorio = random.nextInt(10);

        if (numeroAleatorio < 7) {
            entity = new Boo();
        } else if (numeroAleatorio < 9) {
            entity = new Koopa();
        } else {
            entity = new Goomba();
        }
        return entity;
    }

    public RandomEnemyFactoryHard() {
    }
}
