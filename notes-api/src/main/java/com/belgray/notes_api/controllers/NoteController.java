package com.belgray.notes_api.controllers;

import com.belgray.notes_api.data.Note;
import com.belgray.notes_api.repositories.NoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/public_notes")
@RequiredArgsConstructor
public class NoteController {

    private final NoteRepository repo;

    @GetMapping
    public List<Note> getAllNotes(){
        return repo.findAll();
    }

    @PostMapping
    public Note createNote(@RequestBody Note note){
        return repo.save(note);
    }

    @DeleteMapping("/{id}")
    public void deleteNoteById(@PathVariable Long id){
        repo.deleteById(id);
    }

    @GetMapping("/{id}")
    public Optional<Note> getNoteById(@PathVariable Long id){
        return repo.findById(id);
    }

}
