package br.com.example.delivery.model;
import lombok.Data; // Lombok gera automaticamente getters, setters e toString.
import javax.persistence.*; // Importa as anotações JPA.

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity // Indica que esta classe será uma entidade no banco de dados.
@Table(name = "orders") // Define o nome da tabela no banco.
@Data // Lombok: evita escrever manualmente os métodos padrão.
public class Order {
    @Id // Define a chave primária.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Gera o ID automaticamente.
    private Long id; // Identificador único do pedido.

    private String customerName; // Nome do cliente que fez o pedido.

    private BigDecimal totalAmount; // Valor total do pedido.

    private LocalDateTime createdAt; // Data e hora em que o pedido foi criado.
    
}