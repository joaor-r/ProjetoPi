/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoPI.controller;

import java.util.ArrayList;
import projetoPI.DAO.ProdutoDAO;
import projetoPI.model.Produto;

/**
 *
 * @author fernando.fernandes
 */
public class ProdutoController {

    /**
     * Método Estático Salvar Salvo os dados do cliente na memória ou no banco
     * de dados
     *
     * @param pNome
     * @param pDescricao
     * @param pCategoria
     * @param pSubCategoria
     * @param pValorVenda
     * @param pValorImposto
     * @param pComissao
     * @param pCor
     * @param pDimensoes
     * @param pPeso
     * @param pTempoGarantia
     * @param pLinha
     * @param pMarca
     * @param pCnpjForn
     * @param pNomeForn
     * @param pEnderecoForn
     * @param pCidadeForn
     * @param pUfForn
     * @param pContatoForn
     * @param pTelefoneForn
     * @param pEmailForn
     * @param pEstoque
     * @param pUnidadeM
     * @param pRef
     * @return
     */

    public static boolean salvar(String pNome, String pDescricao, String pCategoria, String pSubCategoria, String pValorVenda, String pValorImposto,
            String pComissao, String pDimensoes, String pCor, String pPeso, String pTempoGarantia, String pMarca, String pLinha, String pCnpjForn,
            String pNomeForn, String pEnderecoForn, String pCidadeForn, String pUfForn, String pContatoForn, String pTelefoneForn, String pEmailForn,
            String pEstoque, String pUnidadeM, String pRef) {
        //Salvo na memória
        Produto p = new Produto(pNome, pDescricao, pCategoria, pSubCategoria, pValorVenda, pValorImposto,
                pComissao, pDimensoes, pCor, pPeso, pTempoGarantia, pMarca, pLinha, pCnpjForn,
                pNomeForn, pEnderecoForn, pCidadeForn, pUfForn, pContatoForn, pTelefoneForn, pEmailForn,
                pEstoque, pUnidadeM, pRef);

        return ProdutoDAO.salvar(p);
    }

    public static boolean excluir(int pID) {
        return ProdutoDAO.excluir(pID);
    }

    public static boolean atualizar(int pId, String pNome, String pDescricao, String pCategoria, String pSubCategoria, String pValorVenda, String pValorImposto,
            String pComissao, String pDimensoes, String pCor, String pPeso, String pTempoGarantia, String pMarca, String pLinha, String pCnpjForn,
            String pNomeForn, String pEnderecoForn, String pCidadeForn, String pUfForn, String pContatoForn, String pTelefoneForn, String pEmailForn,
            String pEstoque, String pUnidadeM, String pRef) {
        Produto p = new Produto(pNome, pDescricao, pCategoria, pSubCategoria, pValorVenda, pValorImposto,
                pComissao, pDimensoes, pCor, pPeso, pTempoGarantia, pMarca, pLinha, pCnpjForn,
                pNomeForn, pEnderecoForn, pCidadeForn, pUfForn, pContatoForn, pTelefoneForn, pEmailForn,
                 pEstoque, pUnidadeM, pRef);

        return ProdutoDAO.atualizar(p);

    }

    /**
     * Transformo uma lista de objetos Cliente em uma lista de Strings
     *
     * @return lista de string
     */
    public static ArrayList<String[]> getProdutos() {
        ArrayList<Produto> clientes = ProdutoDAO.getProdutos();
        ArrayList<String[]> listaProdutos = new ArrayList<>();

        for (int i = 0; i < clientes.size(); i++) {
            listaProdutos.add(new String[]{String.valueOf(clientes.get(i).getId()), clientes.get(i).getNome(),
                String.valueOf(clientes.get(i).getDescricao()),String.valueOf(clientes.get(i).getCategoria()),
                String.valueOf(clientes.get(i).getSubCategoria()),String.valueOf(clientes.get(i).getValorVenda()),String.valueOf(clientes.get(i).getValorImposto()),
            String.valueOf(clientes.get(i).getComissao()),String.valueOf(clientes.get(i).getDimensoes()),clientes.get(i).getCor(),
            String.valueOf(clientes.get(i).getPeso()),String.valueOf(clientes.get(i).getTempoGarantia()),clientes.get(i).getMarca(),
            clientes.get(i).getLinha(), String.valueOf(clientes.get(i).getCnpjForn()),clientes.get(i).getCidadeForn(),
            String.valueOf(clientes.get(i).getUfForn()),String.valueOf(clientes.get(i).getContatoForn()),
            String.valueOf(clientes.get(i).getTelefoneForn()),clientes.get(i).getEmailForn(),String.valueOf(clientes.get(i).getEstoque()),
            String.valueOf(clientes.get(i).getRef()),String.valueOf(clientes.get(i).getUnidadeM())});

        }

        return listaProdutos;

    }

}
