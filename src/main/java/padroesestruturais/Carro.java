package padroesestruturais;

public class Carro {

    public boolean liberar() {
        return CarroFacade.verificarPendenciasLiberacao(this);
    }
}
