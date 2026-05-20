package leo.metroquadrado.service;

import leo.metroquadrado.model.Produto;
import leo.metroquadrado.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> listarTodos(){
        return produtoRepository.findAll();
    }

    public Produto salvar(Produto produto){
        return produtoRepository.save(produto);
    }

    public void excluir(Long id){
        produtoRepository.deleteById(id);
    }
}
