package com.ssk.OneToOneBiDirectionalAssociationMapping.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssk.OneToOneBiDirectionalAssociationMapping.entities.Passport;

public interface PassportRepository extends JpaRepository<Passport, Integer> {

}
