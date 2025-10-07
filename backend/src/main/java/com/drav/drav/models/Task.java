package com.drav.drav.models;

import java.time.LocalDateTime;
import java.util.Set;

import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Table(name = Task.TABLE_NAME)
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    public static final String TABLE_NAME = "task";

    public enum Status {
        PENDENTE,
        CONCLUIDA,
        CANCELADA
    }

    public enum Priority {
        BAIXA,
        MEDIA,
        ALTA
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Size(min = 2, max = 80)
    @NotBlank(message = "O título é obrigatório")
    @Column(name = "title", length = 80, nullable = false)
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "update_date")
    private LocalDateTime update_date;

    @CreatedDate
    @Column(name = "creation_date", nullable = false,  updatable = false)
    private LocalDateTime creation_date;

    @Column(name = "update_date", nullable = true)
    private LocalDateTime time;

    @Enumerated(EnumType.STRING)
    private Status status;
    
    @Enumerated(EnumType.STRING)
    private Priority priority;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToMany
    @JoinTable(
        name = "task_label",
        joinColumns = @JoinColumn(name = "task_id"),
        inverseJoinColumns = @JoinColumn(name = "label_id")
    )
    private Set<Label> labels;
}
