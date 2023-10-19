import java.util.Random;

public class RandomEnemyFactoryNormal implements EnemyFactory{
    @Override
    public Entity createEnemy() {
        Random random = new Random();
        Entity entity;
        int numeroAleatorio = random.nextInt(10);

        if (numeroAleatorio < 7) {
            entity = new Koopa();
        } else if (numeroAleatorio < 9) {
            entity = new Goomba();
        } else {
            entity = new Boo();
        }
        return entity;
    }

    public RandomEnemyFactoryNormal() {
    }
}
