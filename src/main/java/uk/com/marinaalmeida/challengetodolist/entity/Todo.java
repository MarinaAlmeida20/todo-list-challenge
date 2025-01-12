package uk.com.marinaalmeida.challengetodolist.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "todos")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private boolean concluded;
    private int priority;

    public Todo(String name, String description, boolean concluded, int priority) {
        this.name = name;
        this.description = description;
        this.concluded = concluded;
        this.priority = priority;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isConcluded() {
        return concluded;
    }

    public int getPriority() {
        return priority;
    }
}
