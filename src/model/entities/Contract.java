package model.entities;

import java.sql.Date;

public class Contract {

    Integer number;
    Date dataContrato;
    Double valorTotalContrato;

    
    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }
    public Date getDataContrato() {
        return dataContrato;
    }
    public void setDataContrato(Date dataContrato) {
        this.dataContrato = dataContrato;
    }
    public Double getValorTotalContrato() {
        return valorTotalContrato;
    }
    public void setValorTotalContrato(Double valorTotalContrato) {
        this.valorTotalContrato = valorTotalContrato;
    }

    


}
