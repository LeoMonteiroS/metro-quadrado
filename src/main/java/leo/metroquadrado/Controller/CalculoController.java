package leo.metroquadrado.Controller;

import leo.metroquadrado.dto.CalculoRequest;
import leo.metroquadrado.dto.CalculoResponse;
import leo.metroquadrado.service.CalculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CalculoController {

    @Autowired
    private CalculoService calculoService;

    @PostMapping("/calcular")
    public CalculoResponse calcular(@RequestBody CalculoRequest request){
        return calculoService.calcular(request);
    }

}
