package com.theironyard.entities;

import javax.persistence.*;

/**
 * Created by zach on 11/17/15.
 */
@Entity
@Table(name = "todoItems")
public class ToDoItem {
    @Id
    @GeneratedValue
    @Column(nullable = false)
    int id;

    @Column(nullable = false)
    public String text;
}
