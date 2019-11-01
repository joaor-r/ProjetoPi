package projetoPI.model;


public class Produto {
    private static int qtdProdutosCriados;
    
    private int id;
    private String nome;
    private String descricao;
    private String categoria;
    private String subCategoria;
    private String valorVenda;
    private String valorImposto;
    private String comissao;
    private String dimensoes;
    private String cor;
    private String peso;
    private String tempoGarantia;
    private String marca;
    private String linha;
    private String cnpjForn;
    private String nomeForn;
    private String enderecoForn;
    private String cidadeForn;
    private String ufForn;
    private String contatoForn;
    private String telefoneForn;
    private String emailForn;
    private String estoque;
    private String unidadeM;
    private String ref;
    
    public Produto() {
        //TODO:Ao conectar-se ao banco, remover incremento pelo código
        qtdProdutosCriados++;
        this.id = qtdProdutosCriados;
    }

    public Produto(String nome, String descricao, String categoria, String subCategoria, String valorVenda, String valorImposto, 
    String comissao, String dimensoes, String cor, String peso, String tempoGarantia, String marca, String linha, String cnpjForn, 
    String nomeForn, String enderecoForn, String cidadeForn, String ufForn, String contatoForn, String telefoneForn, String emailForn 
    , String estoque, String unidadeM , String ref ) {
        qtdProdutosCriados++;
        this.id = qtdProdutosCriados;
        this.nome = nome;
        this.descricao= descricao;
        this.categoria = categoria;
        this.subCategoria = subCategoria;
        this.valorVenda = valorVenda;
        this.valorImposto = valorImposto;
        this.comissao = comissao;
        this.dimensoes = dimensoes;
        this.cor = cor;
        this.peso = peso;
        this.tempoGarantia = tempoGarantia;
        this.marca = marca;
        this.linha = linha;
        this.cnpjForn = cnpjForn;
        this.nomeForn = nomeForn;
        this.enderecoForn = enderecoForn;
        this.cidadeForn = cidadeForn;
        this.ufForn = ufForn;
        this.contatoForn = contatoForn;
        this.telefoneForn = telefoneForn;
        this.emailForn = emailForn;
        this.estoque = estoque;
        this.unidadeM =unidadeM;
        this.ref = ref;
   }

    public Produto(int id, String pNome, String pDescricao, String pCategoria, String pSubCategoria, String pValorVenda, String pValorImposto, 
    String pComissao, String pDimensoes, String pCor, String pPeso, String pTempoGarantia, String pMarca, String pLinha, String pCnpjForn, 
    String pNomeForn, String pEnderecoForn, String pCidadeForn, String pUfForn, String pContatoForn, String pTelefoneForn, String pEmailForn 
    , String pEstoque, String pUnidadeM , String pRef) {
        
        this.id = id;
        this.nome = pNome;
        this.descricao= pDescricao;
        this.categoria = pCategoria;
        this.subCategoria = pSubCategoria;
        this.valorVenda = pValorVenda;
        this.valorImposto = pValorImposto;
        this.comissao = pComissao;
        this.dimensoes = pDimensoes;
        this.cor = pCor;
        this.peso = pPeso;
        this.tempoGarantia = pTempoGarantia;
        this.marca = pMarca;
        this.linha = pLinha;
        this.cnpjForn = pCnpjForn;
        this.nomeForn = pNomeForn;
        this.enderecoForn = pEnderecoForn;
        this.cidadeForn = pCidadeForn;
        this.ufForn = pUfForn;
        this.contatoForn = pContatoForn;
        this.telefoneForn = pTelefoneForn;
        this.emailForn = pEmailForn;
        this.estoque = pEstoque;
        this.unidadeM = pUnidadeM;
        this.ref = pRef;

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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getSubCategoria() {
        return subCategoria;
    }

    public void setSubCategoria(String subCategoria) {
        this.subCategoria = subCategoria;
    }

    public String getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(String valorVenda) {
        this.valorVenda = valorVenda;
    }

    public String getValorImposto() {
        return valorImposto;
    }

    public void setValorImposto(String valorImposto) {
        this.valorImposto = valorImposto;
    }

    public String getComissao() {
        return comissao;
    }

    public void setComissao(String comissao) {
        this.comissao = comissao;
    }

    public String getDimensoes() {
        return dimensoes;
    }

    public void setDimensoes(String dimensoes) {
        this.dimensoes = dimensoes;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getTempoGarantia() {
        return tempoGarantia;
    }

    public void setTempoGarantia(String tempoGarantia) {
        this.tempoGarantia = tempoGarantia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getLinha() {
        return linha;
    }

    public void setLinha(String linha) {
        this.linha = linha;
    }

    public String getCnpjForn() {
        return cnpjForn;
    }

    public void setCnpjForn(String cnpjForn) {
        this.cnpjForn = cnpjForn;
    }

    public String getNomeForn() {
        return nomeForn;
    }

    public void setNomeForn(String nomeForn) {
        this.nomeForn = nomeForn;
    }

    public String getEnderecoForn() {
        return enderecoForn;
    }

    public void setEnderecoForn(String enderecoForn) {
        this.enderecoForn = enderecoForn;
    }

    public String getCidadeForn() {
        return cidadeForn;
    }

    public void setCidadeForn(String cidadeForn) {
        this.cidadeForn = cidadeForn;
    }

    public String getUfForn() {
        return ufForn;
    }

    public void setUfForn(String ufForn) {
        this.ufForn = ufForn;
    }

    public String getContatoForn() {
        return contatoForn;
    }

    public void setContatoForn(String contatoForn) {
        this.contatoForn = contatoForn;
    }

    public String getTelefoneForn() {
        return telefoneForn;
    }

    public void setTelefoneForn(String telefoneForn) {
        this.telefoneForn = telefoneForn;
    }

    public String getEmailForn() {
        return emailForn;
    }

    public void setEmailForn(String emailForn) {
        this.emailForn = emailForn;
    }

    public String getEstoque() {
        return estoque;
    }

    public void setEstoque(String estoque) {
        this.estoque = estoque;
    }

    public String getUnidadeM() {
        return unidadeM;
    }

    public void setUnidadeM(String unidadeM) {
        this.unidadeM = unidadeM;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }
    
    
}
