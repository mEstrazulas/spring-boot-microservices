package br.com.unimedfortaleza.portal.beneficiario.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.unimedfortaleza.portal.beneficiario.model.Beneficiario;

@Service
public class BeneficiarioService {

    // @Autowired
    // private BeneficiarioRepository beneficiarioRepository;
    //
    // public Beneficiario save(@Validated Beneficiario beneficiario) {
    // return beneficiarioRepository.save(beneficiario);
    // }
    //
    // public Optional<Beneficiario> findById(Integer id) {
    // return beneficiarioRepository.findById(id);
    // }

    public Iterable<Beneficiario> findAll() {
        List<Beneficiario> benefs = new ArrayList<>();
        Beneficiario benef = new Beneficiario();
        benef.setId(24);
        benefs.add(benef);
        return benefs;
        // return beneficiarioRepository.findAll();
    }

    // public void delete(Integer id) {
    // beneficiarioRepository.deleteById(id);
    // }
}