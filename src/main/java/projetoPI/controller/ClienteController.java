/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoPI.controller;

import java.util.ArrayList;
import projetoPI.DAO.ClienteDAO;
import projetoPI.model.Cliente;

/**
 *
 * @author fernando.fernandes
 */
public class ClienteController {

    /**
     * Método Estático Salvar Salvo os dados do cliente na memória ou no banco
     * de dados
     *
     * @param Id
     * @param pNome
     * @param pSexo
     * @param pDNascimento
     * @param pEstCivil
     * @param pEmail
     * @param pTelefone
     * @param pCPF
     * @param pCelular
     * @param pCelular1
     * @param pComplemento
     * @param pNumero
     * @param pBairro
     * @param pCidade
     * @param pUf
     * @param pCep
     * @param pEndereco
     * @param pRenda
     * @param pProfissao
     * @param pRg
     * @param pRendaF
     * @param pCustoMensal
     * @param pEscolaridade
     * @param pAnoFormado
     * @param pRef
     * @param pTempoEmpre
     * @return
     */
    public static boolean salvar(String pNome, String pCPF, String pSexo, String pDNascimento, String pEstCivil, String pEmail,
            String pTelefone, String pCelular, String pCelular1, String pEndereco, String pNumero, String pComplemento, String pBairro,
            String pCidade, String pUf, String pCep, String pRg, String pRenda, String pProfissao, String pTempoEmpre, String pRendaF,
            String pCustoMensal, String pEscolaridade, String pAnoFormado, String pRef) {
        //Salvo na memória
        Cliente p = new Cliente(pNome, pCPF, pSexo, pDNascimento, pEstCivil, pEmail,
                pTelefone, pCelular, pCelular1, pEndereco, pNumero, pComplemento, pBairro,
                pCidade, pUf, pCep, pRg, pRenda, pProfissao, pTempoEmpre, pRendaF,
                pCustoMensal, pEscolaridade, pAnoFormado, pRef);

        return ClienteDAO.salvar(p);
    }

    public static boolean excluir(int pID) {
        return ClienteDAO.excluir(pID);
    }

    public static boolean atualizar(int pId, String pNome, String pCPF, String pSexo, String pDNascimento, String pEstCivil, String pEmail,
            String pTelefone, String pCelular, String pCelular1, String pEndereco, String pNumero, String pComplemento, String pBairro,
            String pCidade, String pUf, String pCep, String pRg, String pRenda, String pProfissao, String pTempoEmpre, String pRendaF,
            String pCustoMensal, String pEscolaridade, String pAnoFormado, String pRef) {
        Cliente p = new Cliente(pNome, pCPF, pSexo, pDNascimento, pEstCivil, pEmail,
                pTelefone, pCelular, pCelular1, pEndereco, pNumero, pComplemento, pBairro,
                pCidade, pUf, pCep, pRg, pRenda, pProfissao, pTempoEmpre, pRendaF,
                pCustoMensal, pEscolaridade, pAnoFormado, pRef);

        return ClienteDAO.atualizar(p);

    }

    /**
     * Transformo uma lista de objetos Cliente em uma lista de Strings
     *
     * @return lista de string
     */
    public static ArrayList<String[]> getClientes() {
        ArrayList<Cliente> clientes = ClienteDAO.getClientes();
        ArrayList<String[]> listaClientes = new ArrayList<>();

        for (int i = 0; i < clientes.size(); i++) {
            listaClientes.add(new String[]{String.valueOf(clientes.get(i).getId()), clientes.get(i).getNome(),
                String.valueOf(clientes.get(i).getCPF()), clientes.get(i).getSexo(), String.valueOf(clientes.get(i).getdNascimento()),
                String.valueOf(clientes.get(i).getEstCivil()), clientes.get(i).getEmail(), clientes.get(i).getCidade(), 
                String.valueOf(clientes.get(i).getUf()), String.valueOf(clientes.get(i).getCep()), String.valueOf(clientes.get(i).getRg()), 
                String.valueOf(clientes.get(i).getRenda()), clientes.get(i).getProfissao(), String.valueOf(clientes.get(i).getTempoEmpre()), 
                String.valueOf(clientes.get(i).getCustoMensal()), String.valueOf(clientes.get(i).getEscolaridade()), 
                String.valueOf(clientes.get(i).getAnoFormado()), String.valueOf(clientes.get(i).getRef())});

        }

        return listaClientes;

    }

}
