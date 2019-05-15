package br.com.unimedfortaleza.portal.beneficiario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.unimedfortaleza.portal.beneficiario.model.Beneficiario;
import br.com.unimedfortaleza.portal.beneficiario.service.BeneficiarioService;

@RestController
@RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public class BeneficiarioController {

    @Autowired
    private BeneficiarioService beneficiarioService;

    // @RequestMapping(method = RequestMethod.POST)
    // public ResponseEntity<Beneficiario> save(@RequestBody Beneficiario
    // beneficiario) {
    // return ResponseEntity.ok(beneficiarioService.save(beneficiario));
    // }
    //
    // @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    // public ResponseEntity<Optional<Beneficiario>> findById(@PathVariable("id")
    // Integer id) {
    // return ResponseEntity.ok(beneficiarioService.findById(id));
    // }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Iterable<Beneficiario>> findAll() {
        return ResponseEntity.ok().body(beneficiarioService.findAll());
    }

    // @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    // public ResponseEntity<?> delete(@PathVariable("id") Integer id) {
    // beneficiarioService.delete(id);
    // return ResponseEntity.ok().build();
    // }
}