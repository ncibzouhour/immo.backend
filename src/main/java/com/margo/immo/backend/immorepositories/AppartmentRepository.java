package com.margo.immo.backend.immorepositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.margo.immo.backend.immomodels.Appartment;

@Repository
public interface AppartmentRepository extends JpaRepository<Appartment, String> {

}
