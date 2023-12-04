import java.math.BigDecimal;

public class Balance {
    private BigDecimal rub;
    private BigDecimal dollar;
    private BigDecimal euro;

    Balance() {
        this.rub = BigDecimal.ZERO;
        this.dollar = BigDecimal.ZERO;
        this.euro = BigDecimal.ZERO;
    }

    Balance(BigDecimal rub) {
        this.rub = rub;
        this.dollar = BigDecimal.ZERO;
        this.euro = BigDecimal.ZERO;
    }
    Balance(BigDecimal rub, BigDecimal dollar) {
        this.rub = rub;
        this.dollar = dollar;
        this.euro = BigDecimal.ZERO;
    }
    Balance(BigDecimal rub, BigDecimal dollar, BigDecimal euro) {
        this.rub = rub;
        this.dollar = dollar;
        this.euro = euro;
    }
    public static Balance getNullBalance() {
        return new Balance();
    }
    public void setRub(BigDecimal rub) {
        this.rub = rub;
    }
    public void setDollar(BigDecimal dollar) {
        this.dollar = dollar;
    }
    public void setEuro(BigDecimal euro) {
        this.euro = euro;
    }
    public BigDecimal getRub() {
        return rub;
    }
    public BigDecimal getDollar() {
        return dollar;
    }
    public BigDecimal getEuro() {
        return euro;
    }
    public BigDecimal[] getFullBalance() {
        return new BigDecimal[]{rub, dollar, euro};
    }

}
