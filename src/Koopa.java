public class Koopa implements Entity{
    private int vida;
    private int daño;
    @Override
    public String atacar() {
        return "Se esconde en su caparazon e intenta golpear";
    }

    public Koopa() {
        this.vida = 2;
        this.daño = 20;
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
