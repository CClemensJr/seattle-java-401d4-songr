package com.super_famicom_coder.songr.models.repositories;

import com.super_famicom_coder.songr.models.Album;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface AlbumRepository extends CrudRepository<Album, Long> {}
