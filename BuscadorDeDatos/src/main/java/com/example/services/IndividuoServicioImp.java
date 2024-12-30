
package com.example.services;

import com.example.dao.IndividuoDao;
import com.example.entididades.Individuo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class IndividuoServicioImp implements IndividuoServicio{

    @Autowired
    public IndividuoDao individuoDao;
    
   
    @Override
    @Transactional(readOnly = true)
    public List<Individuo> listaIndividuos() {
    
        return (List<Individuo>) individuoDao.findByOrderByNombreAsc();    
    }

    @Transactional
    @Override
    public void borrar(Individuo individuo) {
        individuoDao.delete(individuo);   
    }

    @Override
    @Transactional
    public void salvar(Individuo individuo) {
        individuoDao.save(individuo);   
    }

    @Override
    @Transactional
    public Individuo localizarIndividuo(Individuo individuo) {
        return individuoDao.findById(individuo.getId_individuo()).orElse(null); 
    }

    @Override
    public List<Individuo> buscarNombreApellido(Individuo individuo) {
        return individuoDao.findByAndNombreAndApellido(individuo.getNombre(), individuo.getApellido());
    }

    @Override
    public List<Individuo> buscarNombreOrApellido(Individuo individuo) {
        return individuoDao.findByNombreOrApellido(individuo.getNombre(), individuo.getApellido());
    }

    @Override
    public int total() {
        return individuoDao.countByTotal();
    }

    @Override
    public List<Individuo> buscarFechaNac(Individuo individuo) {
        return individuoDao.findByFechaNac(individuo.getFechaNac());
    
    }

    @Override
    public List<Individuo> buscarGenero(Individuo individuo) {
        return individuoDao.findByGenero(individuo.getGenero());
    }

    @Override
    public List<Individuo> buscarTelefono(Individuo individuo) {
        return individuoDao.findByTelefono(individuo.getTelefono());    }

    @Override
    public List<Individuo> buscarCorreo(Individuo individuo) {
        return individuoDao.findByCorreo(individuo.getCorreo());
    }
    
}
