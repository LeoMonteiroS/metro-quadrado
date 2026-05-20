package leo.metroquadrado.dto;

public class CalculoResponse {

    private String produto;
    private Double altura;
    private Double largura;
    private Double valorm2;
    private Double area;
    private Double valorTotal;

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getValorm2() {
        return valorm2;
    }

    public void setValorm2(Double valorm2) {
        this.valorm2 = valorm2;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
