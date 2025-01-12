package uk.com.marinaalmeida.challengetodolist.service;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import uk.com.marinaalmeida.challengetodolist.entity.Todo;
import uk.com.marinaalmeida.challengetodolist.repository.TodoRepository;

import java.util.List;

@Service
public class TodoService {

    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    public List<Todo> create(Todo todo){
        todoRepository.save(todo);
        return todoList();
    }

    public List<Todo> todoList(){
        Sort sort = Sort.by("priority").descending().and(
                Sort.by("name").ascending());

        return todoRepository.findAll(sort);
    }

    public List<Todo> update(Todo todo){
        todoRepository.save(todo);
        return todoList();

    }
    public List<Todo> delete(Long id){
        todoRepository.deleteById(id);
        return todoList();

    }
}
