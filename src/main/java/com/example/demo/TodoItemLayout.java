package com.example.demo;

import com.vaadin.data.Binder;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;

public class TodoItemLayout extends HorizontalLayout {

    private final CheckBox done;
    private final TextField text;
    private final Button delete;

    public TodoItemLayout(Todo todo) {
        done = new CheckBox();
        text = new TextField();
        delete = new Button();

        text.addStyleName(ValoTheme.TEXTFIELD_BORDERLESS);
        delete.setStyleName(ValoTheme.BUTTON_DANGER);
        delete.setIcon(VaadinIcons.DEL_A);

        addComponent(done);
        addComponentsAndExpand(text);
        addComponent(delete);
        setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);

        Binder<Todo> todoBinder = new Binder<>(Todo.class);
        todoBinder.bindInstanceFields(this);
        todoBinder.setBean(todo);
    }

}
