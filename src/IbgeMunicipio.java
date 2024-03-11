public class IbgeMunicipio {
    private int id;
    private int codigo;
    private String nome;
    private String cidade_correspondente;
    private IbgeEstado ibge_estado_id;
    private int cep;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade_correspondente() {
        return cidade_correspondente;
    }

    public void setCidade_correspondente(String cidade_correspondente) {
        this.cidade_correspondente = cidade_correspondente;
    }

    public IbgeEstado getIbge_estado_id() {
        return ibge_estado_id;
    }

    public void setIbge_estado_id(IbgeEstado ibge_estado_id) {
        this.ibge_estado_id = ibge_estado_id;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }
}
