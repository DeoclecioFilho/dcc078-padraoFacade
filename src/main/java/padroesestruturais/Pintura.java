package padroesestruturais;

public class Pintura extends Setor{
    private static Pintura pintura = new Pintura();

    private Pintura() {};

    public static Pintura getInstancia() {
        return pintura;
    }
}
