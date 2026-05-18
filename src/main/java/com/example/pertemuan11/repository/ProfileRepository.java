package com.example.pertemuan11.repository;

import com.example.pertemuan11.model.Profile;
import com.example.pertemuan11.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, String> {
}
