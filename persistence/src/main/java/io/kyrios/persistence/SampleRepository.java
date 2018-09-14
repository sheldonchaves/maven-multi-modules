package io.kyrios.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.kyrios.domain.KyriosSample;

@Repository
public interface SampleRepository extends JpaRepository<KyriosSample, Long> {
}
