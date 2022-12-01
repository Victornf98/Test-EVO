package steps;
import java.io.IOException;

import elementos.Elementos;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;

public class favoritarRepositorioTest {

	Metodos me = new Metodos();
	Elementos el = new Elementos();

	@When("estiver na tela Outros Repositorios")
	public void estiverNaTelaOutrosRepositorios() {
	    me.clicar(el.outrosRepositorios);
	}
	@When("acessar os detalhes de um repositório")
	public void acessarOsDetalhesDeUmRepositório() {
	    me.escrever(el.campoNomeRepositorio, "AcessibilidadeWeb");
	    me.clicar(el.btnBuscar);
	    me.clicar(el.clicarDetalhe);
	}
	@Then("deve conseguir favoritar o repositório")
	public void deveConseguirFavoritarORepositório() throws IOException {
	   me.clicar(el.btnFavorito);
	   me.evidenciarTeste("Favoritado com sucesso");
	}	
}
