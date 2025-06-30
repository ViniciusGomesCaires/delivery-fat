package br.com.example.delivery.repository;
import br.com.example.delivery.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public class ProdutoRepository {
    List<Produto> findByNomeContaining(String nome);

}