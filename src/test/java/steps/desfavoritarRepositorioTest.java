package steps;
import java.io.IOException;

import elementos.Elementos;
import io.cucumber.java.en.Then;
import metodos.Metodos;

public class desfavoritarRepositorioTest {
	
	Metodos me = new Metodos();
	Elementos el = new Elementos();

	@Then("deve conseguir desfavoritar um repositório que foi favoritado anteriormente")
	public void deveConseguirDesfavoritarUmRepositórioQueFoiFavoritadoAnteriormente() throws IOException {
	    me.evidenciarTeste("Não foi possivel desfavoritar");
	}
}
