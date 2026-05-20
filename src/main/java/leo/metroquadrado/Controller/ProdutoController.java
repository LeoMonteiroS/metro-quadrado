package leo.metroquadrado.Controller;

import leo.metroquadrado.model.Produto;
import leo.metroquadrado.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    private final String SENHA_ADMIN = "admin123";

    @GetMapping
    public List<Produto> listarTodos(){
        return produtoService.listarTodos();
    }

    @PostMapping
    public ResponseEntity<?> salvar(@RequestBody Produto produto,
                                    @RequestHeader("senha") String senha){
        if (!SENHA_ADMIN.equals(senha)){
            return ResponseEntity.status(403).body("Senha incorreta");
        }
        return ResponseEntity.ok(produtoService.salvar(produto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> excluir(@PathVariable Long id, @RequestHeader("senha") String senha){
        if (!SENHA_ADMIN.equals(senha)){
            return  ResponseEntity.status(403).body("Senha incorreta.");
        }
        produtoService.excluir(id);
        return ResponseEntity.ok("Produto excluído.");
    }
}
