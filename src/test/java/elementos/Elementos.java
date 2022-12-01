package elementos;
import org.openqa.selenium.By;
import driver.Driver;

public class Elementos extends Driver {
	
	//Test1 
	public By proprietario = By.xpath("//table//tr[2]//td[2][text()]");
	
	//Test2 
	public By detalhe = By.cssSelector("a[href='/Home/Details/323769542']");
	public By validarLinguagem = By.xpath("/html/body/div[3]/table/tbody/tr/td[3]");
	
	//Test3 
	public By outrosRepositorios = By.cssSelector("a[href='/Home/GetRepositorie']");
	public By campoNomeRepositorio = By.id("Result_Name");
	public By btnBuscar = By.cssSelector("button[type='submit']");
	public By validacaoProprietario3 = By.cssSelector("td[data-owner='damasio34']");
	
	//Test4 
	public By validacaoProprietario4 = By.cssSelector("td[data-owner='devsnorte']");
	
	//Test5 
	public By submitDetalhe = By.cssSelector("a[href='/Home/DetailsRepository/306135002?Login=danielbustos86']");
	public By validarJavaScript = By.cssSelector("td[data-language='JavaScript']");
	
	//Test6 
	public By clicarDetalhe = By.cssSelector("a[href='/Home/DetailsRepository/15532356?Login=W3CBrasil']");
	public By btnFavorito = By.cssSelector("button[class='btn btn-primary btn-favorito']");
	
	//Test7 
	public By favoritos = By.cssSelector("a[href='/Home/Favorite']");
	

}
