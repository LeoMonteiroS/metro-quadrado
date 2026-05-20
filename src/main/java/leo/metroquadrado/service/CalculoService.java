package leo.metroquadrado.service;

import leo.metroquadrado.dto.CalculoRequest;
import leo.metroquadrado.dto.CalculoResponse;
import org.springframework.stereotype.Service;

@Service
public class CalculoService{
    public CalculoResponse calcular(CalculoRequest request){
        double area = request.getAltura() * request.getLargura();
        double valorTotal = area * request.getValorM2();

        CalculoResponse response = new CalculoResponse();
        response.setProduto(request.getProduto());
        response.setAltura(request.getAltura());
        response.setLargura(request.getLargura());
        response.setValorm2(request.getValorM2());
        response.setArea(area);
        response.setValorTotal(valorTotal);

        return response;
    }
}
