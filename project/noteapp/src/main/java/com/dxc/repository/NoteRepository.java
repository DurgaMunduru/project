package com.dxc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dxc.model.NoteThis;

public interface NoteRepository extends JpaRepository<NoteThis, String> {

}
