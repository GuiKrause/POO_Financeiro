public class SystemUnit {
    private int id;
    private int code;
    private String name;
    private String connection_name;
    private String address_zone;
    private String address_street;
    private String getAddress_number;
    private String address_district;
    private IbgeMunicipio ibge_municipio_id;
    private String telephone;
    private String email;
    private boolean active;
    private String custom_code;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConnection_name() {
        return connection_name;
    }

    public void setConnection_name(String connection_name) {
        this.connection_name = connection_name;
    }

    public String getAddress_zone() {
        return address_zone;
    }

    public void setAddress_zone(String address_zone) {
        this.address_zone = address_zone;
    }

    public String getAddress_street() {
        return address_street;
    }

    public void setAddress_street(String address_street) {
        this.address_street = address_street;
    }

    public String getGetAddress_number() {
        return getAddress_number;
    }

    public void setGetAddress_number(String getAddress_number) {
        this.getAddress_number = getAddress_number;
    }

    public String getAddress_district() {
        return address_district;
    }

    public void setAddress_district(String address_district) {
        this.address_district = address_district;
    }

    public IbgeMunicipio getIbge_municipio_id() {
        return ibge_municipio_id;
    }

    public void setIbge_municipio_id(IbgeMunicipio ibge_municipio_id) {
        this.ibge_municipio_id = ibge_municipio_id;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getCustom_code() {
        return custom_code;
    }

    public void setCustom_code(String custom_code) {
        this.custom_code = custom_code;
    }
}
