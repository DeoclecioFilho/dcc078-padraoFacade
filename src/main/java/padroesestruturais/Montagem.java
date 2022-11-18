package padroesestruturais;

public class Montagem extends Setor{

    private static Montagem montagem = new Montagem();

    private Montagem() {};

    public static Montagem getInstancia() {
        return montagem;
    }
}
