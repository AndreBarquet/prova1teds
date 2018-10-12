package teds.Questao1prova;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Collections;
import static org.junit.jupiter.api.Assumptions.*;

import org.junit.jupiter.api.Test;

class TesteEquacaodoSegundoGrau {
	
	@Test
	void TesteRaizUnica() {
		// verificar se as raizes que estão retornando sao iguais

		Equacao2oGrau equacao = new Equacao2oGrau(4,4,1);
		Raizes novaraiz = null;
		novaraiz = equacao.getRaizes();
		
		assertEquals(novaraiz.getR2(), novaraiz.getR1(), novaraiz.toString());
				
	}
	
	@Test
	void TesteDuazRaizes() {
		// verificar se as raizes que estão retornando sao diferentes
		
		Equacao2oGrau equacao = new Equacao2oGrau(3,7,4);
		Raizes novaraiz = null;
		novaraiz = equacao.getRaizes();
		
		assertNotEquals(novaraiz.getR1(), novaraiz.getR2(), novaraiz.toString());
		
	}
	

	@Test
    public void TesteSemRaiz() {
		Equacao2oGrau equacao = new Equacao2oGrau(10,6,10);
        assertThrows(ArithmeticException.class, () -> {
        	equacao.getRaizes();
        });
    }
	
	


}

