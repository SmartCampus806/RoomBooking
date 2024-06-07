package org.mai.roombooking.repositories;

import org.mai.roombooking.entities.Room;
import org.mai.roombooking.entities.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {
    @Query("SELECT t FROM tag t WHERE t.shortName = :shortName")
    Optional<Tag> findByShortName(@Param("shortName") String shortName);

    @Query("SELECT t FROM tag t WHERE t.fullName = :fullName")
    Optional<Tag> findByFullName(@Param("fullName") String fullName);
}
