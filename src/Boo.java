public class Boo implements Entity{
    private int vida;
    private int daño;
    @Override
    public String atacar() {
        return "Cuando el jugador no lo ve, ataca";
    }
    public Boo() {
        this.vida = 3;
        this.daño = 30;
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
