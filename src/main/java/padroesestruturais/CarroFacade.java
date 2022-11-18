package padroesestruturais;

public class CarroFacade {

    public static boolean verificarPendenciasLiberacao(Carro carro) {
        if (Eletrica.getInstancia().verificarCarroComPendencia(carro)) {
            return false;
        }
        if (Montagem.getInstancia().verificarCarroComPendencia(carro)) {
            return false;
        }
        if (Pintura.getInstancia().verificarCarroComPendencia(carro)) {
            return false;
        }
        return true;
    }
}
