public class Goomba implements Entity{
    private int vida;
    private int daño;

    @Override
    public String atacar() {
        return "Corre hacia el jugador";
    }
    public Goomba() {
        this.vida = 1;
        this.daño = 10;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }
}
