package service;

import dao.IContratoDao;

public class ContratoService implements IContratoService
{
    IContratoDao dao;
    public ContratoService(IContratoDao dao){
        this.dao = dao;
    }

    @Override
    public String salvar() {
        dao.salvar();
        return "Sucesso";
    }

    @Override
    public String busca() {
        dao.busca();
        return "Sucesso";
    }

    @Override
    public String excluir() {
        dao.excluir();
        return "Sucesso";
    }

    @Override
    public String atulizar() {
        dao.atulizar();
        return "Sucesso";
    }
}
