import java.util.Random;

public class RandomEnemyFactoryEasy implements EnemyFactory{
    @Override
    public Entity createEnemy() {
        Random random = new Random();
        Entity entity;
        int numeroAleatorio = random.nextInt(10);

        if (numeroAleatorio < 7) {
            entity = new Goomba();
        } else if (numeroAleatorio < 9) {
            entity = new Koopa();
        } else {
            entity = new Boo();
        }
        return entity;
    }

    public RandomEnemyFactoryEasy() {
    }
}
