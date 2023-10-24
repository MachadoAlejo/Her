public class MyHero extends Hero {
    public String name = "ADROMY";
    public int armor = 8000;
    public int attackDamage = 3700;
    public int attackVelocity = 55;
    public int moveVelocity = 50;
    public int probabilityOfCriticalStrike = 20;
    public static String weapon = "Espada";

    public MyHero() {
        // Constructor de MyHero con valores predeterminados
    }

    public void directHit() {
        // Implementación de directHit en MyHero
    }

    public void blowwithjump() {
        // Implementación de blowwithjump en MyHero
    }

    public void canalize() {
        // Aumentar la vida y la energía hasta los valores predeterminados
        int maxHealth = 20000; // Valor predeterminado para health
        int maxEnergy = 25000; // Valor predeterminado para energy

        this.health = maxHealth;
        this.energy = maxEnergy;

        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
        System.out.println("Canalizing...");
        System.out.println("Vida restaurada a " + maxHealth);
        System.out.println("Energía restaurada a " + maxEnergy);
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");

    }
    // Reducir el valor de armor
    public void coverAttack () {
        int armorReduction = 2500; // Cantidad a reducir en cada ataque
        this.armor -= armorReduction;
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
        System.out.println("Realizando Cover Attack");
        System.out.println("Armor restante: " + this.armor);
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
    }

    @Override
    public void feetAttack() {
        // Implementación de feetAttack en MyHero
    }

    @Override
    public void move() {
        // Implementación de move en MyHero
    }

    @Override
    public void jump() {
        // Implementación de jump en MyHero
    }

    @Override
    public void sprint() {
        // Implementación de sprint en MyHero
    }

    public void mostrarInfo () {
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
        System.out.println("vida: " + health );
        System.out.println("Energia: " + energy );
        System.out.println("nombre: " + name );
        System.out.println("Armadura: " + armor );
        System.out.println("Daño de ataque: " + attackDamage );
        System.out.println("Velocidad de ataque: " + attackVelocity );
        System.out.println("Probabilidad de golpe critico: " + probabilityOfCriticalStrike );
        System.out.println("Arma: " + weapon );
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
    }

}
