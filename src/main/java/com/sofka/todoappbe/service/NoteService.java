package com.sofka.todoappbe.service;

import com.sofka.todoappbe.entity.Note;
import org.springframework.stereotype.Service;

import java.util.List;

public interface NoteService {

    List<Note> getAllNotes();

    Note saveNote(Note note);

    Note updateNote(Note note);

    void deleteNote(Long id);
}
