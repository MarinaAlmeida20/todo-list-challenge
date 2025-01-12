package uk.com.marinaalmeida.challengetodolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uk.com.marinaalmeida.challengetodolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
