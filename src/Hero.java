public class Hero implements PowerAction {
    int health = 20000;
    int energy = 25000;

    public Hero() {
        // Constructor de Hero con valores predeterminados
    }

    @Override
    public void handsAttack() {
        // Restar un 10% al atributo energy
        double energyLossPercentage = 0.10; // 10%
        this.energy -= (int) (this.energy * energyLossPercentage);

        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
        System.out.println("Atacando con " + MyHero.weapon);
        System.out.println("Energy restante: " + this.energy);
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
    }


    @Override
    public void feetAttack() {
        // Implementación de feetAttack en Hero
    }

    @Override
    public void move() {
        // Implementación de move en Hero
    }

    @Override
    public void jump() {
        // Implementación de jump en Hero
    }

    @Override
    public void sprint() {
        // Implementación de sprint en Hero
    }
}




