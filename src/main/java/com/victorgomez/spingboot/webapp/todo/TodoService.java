package com.victorgomez.spingboot.webapp.todo;


import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();


    static {
        todos.add(new Todo(1, "victorgomez","Learn AWS",
                LocalDate.now().plusYears(1), false ));
        todos.add(new Todo(2, "victorgomez","Learn DevOps",
                LocalDate.now().plusYears(2), false ));
        todos.add(new Todo(3, "victorgomez","Learn Full Stack Development",
                LocalDate.now().plusYears(3), false ));
    }

    private static int todosCount = todos.size();

    public List<Todo> findByUsername(String username){
        return todos;
    }

    public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
        Todo todo = new Todo(++todosCount,username,description,targetDate,done);
        todos.add(todo);
    }
}