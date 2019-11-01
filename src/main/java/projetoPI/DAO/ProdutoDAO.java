/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoPI.DAO;

import java.util.ArrayList;
import projetoPI.model.Produto;

/**
 *
 * @author fernando.fernandes
 */
public class ProdutoDAO {
    
    public static boolean salvar(Produto p)
    {
        //Simulo uma inserção no banco de dados (INSERT INTO...)
        return SimulaDB.getInstance().SalvarProduto(p);
    }
    
    public static boolean atualizar(Produto p)
    {
        //Simulo um  UPDATE no banco de dados (UPDATE TabelaXYZ SET...)
        return SimulaDB.getInstance().AtualizarProduto(p);
    }
    
    public static boolean excluir(int pID)
    {
        //Simulo uma exclusão no banco de dados (DELETE FROM TabelaXYZ WHERE...)
        return SimulaDB.getInstance().ExcluirProduto(pID);
    }
    
    public static ArrayList<Produto> getProdutos()
    {
        return SimulaDB.getInstance().getProdutos();
    }
    
}
