/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoPI.model;

/**
 *
 * @author fernando.fernandes
 */
public class Cliente {

    private static int qtdClientesCriados;

    private int id;
    private String nome;
    private String cpf;
    private String sexo;
    private String dNascimento;
    private String estCivil;
    private String email;
    private String telefone;
    private String celular;
    private String celular1;
    private String endereco;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;
    private String rg;
    private String renda;
    private String profissao;
    private String tempoEmpre;
    private String rendaF;
    private String custoMensal;
    private String escolaridade;
    private String anoFormado;
    private String ref;

    public Cliente() {
        //TODO:Ao conectar-se ao banco, remover incremento pelo código
        qtdClientesCriados++;
        this.id = qtdClientesCriados;
    }

    public Cliente(String nome, String cpf, String sexo, String dNascimento, String estCivil, String email,
             String telefone, String celular, String celular1, String endereco, String numero, String complemento, String bairro,
             String cidade, String uf, String cep, String rg, String renda, String profissao, String tempoEmpre, String rendaF,
             String custoMensal, String escolaridade, String anoFormado, String ref) {
        qtdClientesCriados++;
        this.id = qtdClientesCriados;
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.anoFormado = anoFormado;
        this.bairro =bairro;
        this.celular = celular;
        this.celular1 = celular1;
        this.cep = cep;
        this.cidade = cidade;
        this.complemento = complemento;
        this.custoMensal = custoMensal;
        this.dNascimento = dNascimento;
        this.email = email;
        this.endereco = endereco;
        this.escolaridade = escolaridade;
        this.estCivil = estCivil;
        this.numero = numero;
        this.profissao = profissao;
        this.ref = ref;
        this.renda = renda;
        this.rendaF = rendaF;
        this.rg = rg;
        this.telefone = telefone;
        this.tempoEmpre = tempoEmpre;
        this.uf = uf;
    }

    public Cliente(int id, String pNome, String pCPF,String pSexo, String pDNascimento, String pEstCivil, String pEmail,
             String pTelefone, String pCelular, String pCelular1, String pEndereco, String pNumero, String pComplemento, String pBairro,
             String pCidade, String pUf, String pCep, String pRg, String pRenda, String pProfissao, String pTempoEmpre, String pRendaF,
             String pCustoMensal, String pEscolaridade, String pAnoFormado, String pRef) {
        
        this.id = id;
        this.nome = pNome;
        this.cpf = pCPF;
        this.sexo = pSexo;
        this.anoFormado = pAnoFormado;
        this.bairro =pBairro;
        this.celular = pCelular;
        this.celular1 = pCelular1;
        this.cep = pCep;
        this.cidade = pCidade;
        this.complemento = pComplemento;
        this.custoMensal = pCustoMensal;
        this.dNascimento = pDNascimento;
        this.email = pEmail;
        this.endereco = pEndereco;
        this.escolaridade = pEscolaridade;
        this.estCivil = pEstCivil;
        this.numero = pNumero;
        this.profissao = pProfissao;
        this.ref = pRef;
        this.renda = pRenda;
        this.rendaF = pRendaF;
        this.rg = pRg;
        this.telefone = pTelefone;
        this.tempoEmpre = pTempoEmpre;
        this.uf = pUf;
    }
    

    public String getCPF() {
        return cpf;
    }

    public void setCPF(String pCPF) {
        this.cpf = pCPF;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String pNome) {
        this.nome = pNome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getdNascimento() {
        return dNascimento;
    }

    public void setdNascimento(String dNascimento) {
        this.dNascimento = dNascimento;
    }

    public String getEstCivil() {
        return estCivil;
    }

    public void setEstCivil(String estCivil) {
        this.estCivil = estCivil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCelular1() {
        return celular1;
    }

    public void setCelular1(String celular1) {
        this.celular1 = celular1;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getRenda() {
        return renda;
    }

    public void setRenda(String renda) {
        this.renda = renda;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getTempoEmpre() {
        return tempoEmpre;
    }

    public void setTempoEmpre(String tempoEmpre) {
        this.tempoEmpre = tempoEmpre;
    }

    public String getRendaF() {
        return rendaF;
    }

    public void setRendaF(String rendaF) {
        this.rendaF = rendaF;
    }

    public String getCustoMensal() {
        return custoMensal;
    }

    public void setCustoMensal(String custoMensal) {
        this.custoMensal = custoMensal;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getAnoFormado() {
        return anoFormado;
    }

    public void setAnoFormado(String anoFormado) {
        this.anoFormado = anoFormado;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

}
