package br.dto;
import lombok.Data;
import javax.validation.constraints.*; // Para validação dos campos.

import org.antlr.v4.runtime.misc.NotNull;

import java.math.BigDecimal;

@Data
public class OrderRequest {
    @NotBlank // Valida que o campo não pode ser vazio.
    private String customerName; // Nome do cliente.

    @NotNull // O valor não pode ser nulo.
    @DecimalMin("0.0") // O valor mínimo permitido é 0.0.
    private BigDecimal totalAmount; // Valor total do pedido.
}
