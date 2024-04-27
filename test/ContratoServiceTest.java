import dao.ContratoDao;
import dao.ContratoDaoMock;
import dao.IContratoDao;
import org.junit.Assert;
import org.junit.Test;
import service.ContratoService;
import service.IContratoService;

public class ContratoServiceTest {
    @Test
    public void salvarTest(){
        IContratoDao salvarDao = new ContratoDaoMock();
        IContratoService salvarService = new ContratoService(salvarDao);
        String retorno = salvarService.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest(){
        IContratoDao salvarDaoErro = new ContratoDao();
        IContratoService salvarServiceErro = new ContratoService(salvarDaoErro);
        String retorno = salvarServiceErro.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void buscarTest(){
        IContratoDao buscaDao = new ContratoDaoMock();
        IContratoService buscaService = new ContratoService(buscaDao);
        String retorno = buscaService.busca();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoBuscaNoBancoDeDadosTest(){
        IContratoDao buscaDao = new ContratoDao();
        IContratoService buscaService = new ContratoService(buscaDao);
        String retorno = buscaService.busca();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void excluirTest(){
        IContratoDao excluirDao = new ContratoDaoMock();
        IContratoService excluirService = new ContratoService(excluirDao);
        String retorno = excluirService.busca();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoExcluirNoBancoDeDadosTest(){
        IContratoDao excluirDao = new ContratoDao();
        IContratoService excluirService = new ContratoService(excluirDao);
        String retorno = excluirService.busca();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void atualizarTest(){
        IContratoDao atualizarDao = new ContratoDaoMock();
        IContratoService atualizarService = new ContratoService(atualizarDao);
        String retorno = atualizarService.busca();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoAtualizarNoBancoDeDadosTest(){
        IContratoDao atualizarDao = new ContratoDao();
        IContratoService atualizarService = new ContratoService(atualizarDao);
        String retorno = atualizarService.busca();
        Assert.assertEquals("Sucesso", retorno);
    }


}
