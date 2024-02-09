package com.ortega.slubumbashi.repository;


import com.ortega.slubumbashi.models.Song;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface SongRepository extends MongoRepository<Song, UUID> {

}
