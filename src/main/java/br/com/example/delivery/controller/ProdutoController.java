package br.com.example.delivery.controller;
import br.com.example.delivery.model.Produto;
import br.com.example.delivery.service.ProdutoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    private final ProdutoService sevice;

    public ProdutoController(ProdutoService service){
        this.service = service;

    }

@GetMapping
public Produto criar(@RequestBody Produto produto){
    return service.salvar(produto);
}
    