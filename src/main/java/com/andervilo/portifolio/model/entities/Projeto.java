package com.andervilo.portifolio.model.entities;

import javax.persistence.*;

import com.andervilo.portifolio.types.RiscoType;
import com.andervilo.portifolio.types.StatusType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "projeto")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "data_inicio")
    private LocalDate dataInicio;

    @Column(name = "data_previsao_fim")
    private LocalDate dataPrevisaoFim;

    @Column(name = "data_fim")
    private LocalDate dataFim;

    @Column(name = "descricao", length = 5000)
    private String descricao;

    @Column(name = "status", length = 45)
    @Enumerated(EnumType.STRING)
    private StatusType status;

    @Column(name = "orcamento")
    private Float orcamento;

    @Column(name = "risco", length = 45)
    @Enumerated(EnumType.STRING)
    private RiscoType risco;

    @ManyToOne
    @JoinColumn(name = "idgerente", nullable = true)
    private Pessoa gerente;

    @ManyToMany
    @JoinTable(
            name = "membros",
            joinColumns = @JoinColumn(name = "idprojeto"),
            inverseJoinColumns = @JoinColumn(name = "idpessoa")
    )
    private List<Pessoa> membros;
}
