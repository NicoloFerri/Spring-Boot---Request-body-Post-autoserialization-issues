import java.util.Date;

public class Ordine {

    private Integer id;
    private Integer clienteId;
    private String prodotto;
    private Integer quantita;
    private Date dataOrdine;


    public Ordine(Integer id, Integer clienteId, String prodotto, Integer quantita, Date dataOrdine) {
        this.id = id;
        this.clienteId = clienteId;
        this.prodotto = prodotto;
        this.quantita = quantita;
        this.dataOrdine = dataOrdine;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public String getProdotto() {
        return prodotto;
    }

    public void setProdotto(String prodotto) {
        this.prodotto = prodotto;
    }

    public Integer getQuantita() {
        return quantita;
    }

    public void setQuantita(Integer quantita) {
        this.quantita = quantita;
    }

    public Date getDataOrdine() {
        return dataOrdine;
    }

    public void setDataOrdine(Date dataOrdine) {
        this.dataOrdine = dataOrdine;
    }



}
