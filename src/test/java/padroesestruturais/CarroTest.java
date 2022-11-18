package padroesestruturais;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @Test
    void deveRetornarPendenciaBibliotecaFormatura() {
        Carro carro = new Carro();
        Eletrica.getInstancia().addCarroPendente(carro);
        assertEquals(false, carro.liberar());
    }

    @Test
    void deveRetornarPendenciaSecretariaFormatura() {
        Carro carro = new Carro();
        Montagem.getInstancia().addCarroPendente(carro);
        assertEquals(false, carro.liberar());
    }

    @Test
    void deveRetornarPendenciaFinanceiroFormatura() {
        Carro carro = new Carro();
        Pintura.getInstancia().addCarroPendente(carro);
        assertEquals(false, carro.liberar());
    }

    @Test
    void deveRetornarAlunoSemPendenciaFormatura() {
        Carro carro = new Carro();
        assertEquals(true, carro.liberar());
    }

}