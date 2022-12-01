package steps;
import java.io.IOException;

import elementos.Elementos;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;

public class repositoriosFavoritadosTest {

	Metodos me = new Metodos();
	Elementos el = new Elementos();
	
	@When("estiver na tela favoritos")
	public void estiverNaTelaFavoritos() {
	    me.clicar(el.favoritos); 
	}
	@Then("deve conseguir ver os repositórios favoritados")
	public void deveConseguirVerOsRepositóriosFavoritados() throws IOException {
	   me.currentUrl("https://localhost:44329/Home/Favorite");
	   me.evidenciarTeste("Repositorios Favoritos - sucesso]");
	}
}
