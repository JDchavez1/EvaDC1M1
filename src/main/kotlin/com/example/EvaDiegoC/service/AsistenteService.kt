package com.example.EvaDiegoC.service

import com.example.EvaDiegoC.model.Asistente
import com.example.EvaDiegoC.repository.AsistenteRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service

class AsistenteService {
    @Autowired
    lateinit var asistenteRepository: AsistenteRepository
    fun save (asistente:Asistente): Asistente{
        return asistenteRepository.save(asistente)
    }
    fun list ():List<Asistente>{
        return asistenteRepository.findAll()
    }
}