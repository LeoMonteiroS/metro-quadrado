package leo.metroquadrado.dto;

public class CalculoRequest {
    private String produto;
    private Double altura;
    private Double largura;
    private Double valorM2;

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

    public Double getValorM2() {
        return valorM2;
    }

    public void setValorM2(Double valorM2) {
        this.valorM2 = valorM2;
    }
}
