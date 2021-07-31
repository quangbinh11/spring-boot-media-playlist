package io.educative.mediaapp.controller;

import io.educative.mediaapp.exception.PlaylistNotFoundException;
import io.educative.mediaapp.exception.SongNotFoundException;
import io.educative.mediaapp.model.ErrorCodes;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler
    public ResponseEntity<?> playlistNotFound(PlaylistNotFoundException ex) {
        return ResponseEntity.badRequest().body(new ResponseStatusError(ErrorCodes.PLAYLIST_NOT_FOUND.code(), ex.getMessage()));
    }

    @ExceptionHandler
    public ResponseEntity<?> songNotFound(SongNotFoundException ex) {
        return ResponseEntity.badRequest().body(new ResponseStatusError(ErrorCodes.SONG_NOT_FOUND.code(), ex.getMessage()));
    }
}
