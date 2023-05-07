package br.newtonpaiva.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Ticket {
    private LocalDateTime inicio;
    private LocalDateTime fim;
    private Veiculo veiculo;

    public Ticket(LocalDateTime inicio, Veiculo veiculo) {
        this.inicio = inicio;
        this.veiculo = veiculo;
    }

    public BigDecimal fechar(Calcular calcular) {
        this.fim = LocalDateTime.now();

        return calcular.execute();
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public LocalDateTime getFim() {
        return fim;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setFim(LocalDateTime fim) {
        this.fim = fim;
    }
}
