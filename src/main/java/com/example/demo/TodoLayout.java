package com.example.demo;

import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.ui.VerticalLayout;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.List;

@SpringComponent
public class TodoLayout extends VerticalLayout {


    @Autowired
    TodoRepository repo;

    @PostConstruct
    void init() {
        setTodos(repo.findAll());
    }

    public void setTodos(List<Todo> todos) {
        removeAllComponents();

        todos.forEach(todo -> addComponent(new TodoItemLayout(todo)));
    }
}
