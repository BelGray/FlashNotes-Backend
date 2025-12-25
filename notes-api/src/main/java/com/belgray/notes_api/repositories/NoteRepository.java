package com.belgray.notes_api.repositories;

import com.belgray.notes_api.data.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {

}
