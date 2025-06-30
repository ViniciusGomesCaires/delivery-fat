package br.dto;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class OrderDTO {
     private Long id; // Identificador gerado automaticamente.

    private String customerName; // Nome do cliente.

    private BigDecimal totalAmount; // Valor total do pedido.

    private LocalDateTime createdAt; // Data e hora de criação do pedido.
}
