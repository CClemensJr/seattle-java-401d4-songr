package com.super_famicom_coder.songr;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository extends CrudRepository<Album, Integer> {

}
