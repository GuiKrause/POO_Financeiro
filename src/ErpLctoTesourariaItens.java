import java.time.LocalDate;
import java.time.LocalDateTime;

public class ErpLctoTesourariaItens {
    private int id;
    private ErpLctoTesouraria erp_lcto_tesouraria_id;
    private double valor;
    private int system_unit_id;
    private LocalDateTime datetime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ErpLctoTesouraria getErp_lcto_tesouraria_id() {
        return erp_lcto_tesouraria_id;
    }

    public void setErp_lcto_tesouraria_id(ErpLctoTesouraria erp_lcto_tesouraria_id) {
        this.erp_lcto_tesouraria_id = erp_lcto_tesouraria_id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getSystem_unit_id() {
        return system_unit_id;
    }

    public void setSystem_unit_id(int system_unit_id) {
        this.system_unit_id = system_unit_id;
    }

    public LocalDateTime getDatetime() {
        return datetime;
    }

    public void setDatetime(LocalDateTime datetime) {
        this.datetime = datetime;
    }
}
