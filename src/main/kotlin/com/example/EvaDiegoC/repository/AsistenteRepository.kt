package com.example.EvaDiegoC.repository

import com.example.EvaDiegoC.model.Asistente
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository

interface AsistenteRepository:JpaRepository<Asistente, Long?> {

}