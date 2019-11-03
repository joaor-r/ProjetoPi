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
       
        ArrayList<Produto> produtos = ProdutoDAO.getProdutos();
        ArrayList<String[]> listaProdutos = new ArrayList<>();

        for (int i = 0; i < produtos.size(); i++) {
            listaProdutos.add(new String[]{String.valueOf(produtos.get(i).getId()), produtos.get(i).getNome(),
                String.valueOf(produtos.get(i).getDescricao()),String.valueOf(produtos.get(i).getCategoria()),
                String.valueOf(produtos.get(i).getSubCategoria()),String.valueOf(produtos.get(i).getValorVenda()),String.valueOf(produtos.get(i).getValorImposto()),
            String.valueOf(produtos.get(i).getComissao()),String.valueOf(produtos.get(i).getDimensoes()),produtos.get(i).getCor(),
            String.valueOf(produtos.get(i).getPeso()),String.valueOf(produtos.get(i).getTempoGarantia()),produtos.get(i).getMarca(),
            produtos.get(i).getLinha(), String.valueOf(produtos.get(i).getCnpjForn()),produtos.get(i).getCidadeForn(),
            String.valueOf(produtos.get(i).getUfForn()),String.valueOf(produtos.get(i).getContatoForn()),
            String.valueOf(produtos.get(i).getTelefoneForn()),produtos.get(i).getEmailForn(),String.valueOf(produtos.get(i).getEstoque()),
            String.valueOf(produtos.get(i).getRef()),String.valueOf(produtos.get(i).getUnidadeM())});

        }

        return listaProdutos;

    }

}
