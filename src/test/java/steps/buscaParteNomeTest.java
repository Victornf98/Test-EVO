package steps;
import java.io.IOException;

import elementos.Elementos;
import io.cucumber.java.en.Then;
import metodos.Metodos;

public class buscaParteNomeTest {
	
	Metodos me = new Metodos();
	Elementos el = new Elementos();
	
	@Then("deve conseguir pesquisar um repositório por parte do seu nome")
	public void deveConseguirPesquisarUmRepositórioPorParteDoSeuNome() throws IOException {
	    me.escrever(el.campoNomeRepositorio, "Alcool");
	    me.clicar(el.btnBuscar);
	    me.validarTexto(el.validacaoProprietario4, "devsnorte");
	    me.evidenciarTeste("Acesso aos detalhes com parte do nome - sucesso");
	}
}
