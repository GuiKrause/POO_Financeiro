public class IbgeEstado {
    private int id;
    private int codigouf;
    private String nome;
    private String uf;
    private IbgeRegiao ibge_regiao_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigouf() {
        return codigouf;
    }

    public void setCodigouf(int codigouf) {
        this.codigouf = codigouf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public IbgeRegiao getIbge_regiao_id() {
        return ibge_regiao_id;
    }

    public void setIbge_regiao_id(IbgeRegiao ibge_regiao_id) {
        this.ibge_regiao_id = ibge_regiao_id;
    }
}
