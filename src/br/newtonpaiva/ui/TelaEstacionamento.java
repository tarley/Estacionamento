package br.newtonpaiva.ui;

import br.newtonpaiva.domain.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class TelaEstacionamento {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("GNV7752");
        LocalDateTime inicio = LocalDateTime.now();
        Ticket ticket = new Ticket(inicio, veiculo);

        // ---------------------
        Calcular calc = new VeiculoCargaHora(7L, 8, BigDecimal.TEN);
        ticket.fechar(calc);
    }
}
