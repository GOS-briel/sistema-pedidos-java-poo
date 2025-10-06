package Entidades;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CupomdeDesconto {

    private String codigo;
    private BigDecimal PercentualDesconto;
     private LocalDate Datavalidade;

    public CupomdeDesconto(String codigo, BigDecimal percentualDesconto, LocalDate datavalidade) {
        this.codigo = codigo;
        PercentualDesconto = percentualDesconto;
        Datavalidade = datavalidade;

    }

    public String getCodigo() {
        return codigo;
    }

    public BigDecimal getPercentualDesconto() {
        return PercentualDesconto;
    }

    public LocalDate getDatavalidade() {
        return Datavalidade;
    }
    public boolean isValido(){
        return LocalDate.now().isBefore(Datavalidade);
    }
    @Override
    public String toString() {
        return "CupomdeDesconto{" +
                "codigo='" + codigo + '\'' +
                ", PercentualDesconto=" + PercentualDesconto +
                ", Datavalidade=" + Datavalidade +
                '}';
    }
}
