package com.sofka.todoappbe.controller;

import com.sofka.todoappbe.entity.Note;
import com.sofka.todoappbe.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
@CrossOrigin(origins = "http://localhost:3000/")
public class NoteController {

    @Autowired
    private NoteService service;

    @GetMapping("get/note")
    public List<Note> getAllNotes() {
        return service.getAllNotes();
    }

    @PostMapping("save/note")
    public Note saveNote(@RequestBody Note note) {
        return service.saveNote(note);
    }

    @PutMapping("update/note")
    public Note updateNote(@RequestBody Note note) {
        return service.updateNote(note);
    }

    @DeleteMapping("delete/note/{id}")
    public void deleteNote(@PathVariable Long id) {
        service.deleteNote(id);
    }
}
