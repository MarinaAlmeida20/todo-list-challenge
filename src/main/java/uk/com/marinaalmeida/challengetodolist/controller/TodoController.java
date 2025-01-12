package uk.com.marinaalmeida.challengetodolist.controller;

import org.springframework.web.bind.annotation.*;
import uk.com.marinaalmeida.challengetodolist.entity.Todo;
import uk.com.marinaalmeida.challengetodolist.service.TodoService;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private TodoService todoService;

    public TodoController(TodoService todoService){
        this.todoService = todoService;
    }

    @PostMapping
    List<Todo> create(@RequestBody Todo todo){
        return  todoService.create(todo);
    }

    @GetMapping
    List<Todo> todoList(){
        return todoService.todoList();
    }

    @PutMapping
    List<Todo> update(@RequestBody Todo todo){
        return todoService.update(todo);
    }

    @DeleteMapping("{id}")
    List<Todo> delete(@PathVariable("id") Long id){
        return todoService.delete(id);
    }
}
