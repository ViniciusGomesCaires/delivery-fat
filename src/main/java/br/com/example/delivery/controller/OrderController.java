package br.com.example.delivery.controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import br.com.example.delivery.service.OrderService;
import br.com.example.delivery.dto.OrderRequest;
import br.com.example.delivery.dto.OrderDTO;

import javax.validation.Valid; // Garante que a validação dos DTOs seja feita.

import io.swagger.v3.oas.annotations.tags.Tag; // Documentação Swagger.
import io.swagger.v3.oas.annotations.Operation;


@RestController // Indica que esta classe é um Controller REST.
@RequestMapping("/api/orders") // Define a rota base.
@Tag(name = "Orders", description = "Operações sobre pedidos") // Para Swagger.
public class OrderController {
    private final OrderService service; // Injeção do serviço.

    // Construtor para injeção.
    public OrderController(OrderService service) {
        this.service = service;
    }

    @PostMapping // Define o verbo HTTP.
    @Operation(summary = "Cria um novo pedido") // Descrição para Swagger.
    public ResponseEntity<OrderDTO> createOrder(@Valid @RequestBody OrderRequest request) {
        // Chama o serviço para criar o pedido.
        OrderDTO order = service.createOrder(request);

        // Retorna o status HTTP 201 (Created) e o pedido criado.
        return ResponseEntity.status(HttpStatus.CREATED).body(order);
    }
}
